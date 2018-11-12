package mx.appwhere.gestores.front.application.serviceimpl;
import mx.appwhere.gestores.front.domain.constants.DomainConstants;
import mx.appwhere.gestores.front.domain.constants.DomainError;
import mx.appwhere.gestores.front.domain.exceptions.ConnectionException;
import mx.appwhere.gestores.front.domain.exceptions.RestResponseException;
import mx.appwhere.gestores.front.domain.exceptions.ajax.AjaxException;
import mx.appwhere.gestores.front.domain.services.GenericService;
import mx.appwhere.gestores.front.domain.util.RestClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;


@Service
public class GenericServiceImpl implements GenericService {

	private RestClient restClient;

	@Autowired
	public void setRestClient(RestClient restClient) {
		this.restClient = restClient;
	}

	@Override
	public Object responseObject(String uri, Object request, Class response) {
		Object res;
		try {

			HttpHeaders headers = new HttpHeaders();
			headers.add(HttpHeaders.ACCEPT, DomainConstants.MEDIA_TYPE_JSON);
			UriComponents uriComponents = UriComponentsBuilder.fromUriString(uri).build();
			res = restClient.post(uriComponents, headers, request, response);

		} catch (RestResponseException ex) {
			ex.getApiError().ifPresent(apiError -> {
				throw new AjaxException(apiError.getMessage(), DomainError.BACKEND_ERROR);
			});
			throw new ConnectionException("Error de conexion");
		}
		return res;
	}

	@Override
	public Object responseMav(String uri, Object request, Class response) {
		try {
			HttpHeaders headers = new HttpHeaders();
			headers.add(HttpHeaders.ACCEPT, DomainConstants.MEDIA_TYPE_JSON);
			UriComponents uriComponents = UriComponentsBuilder.fromUriString(uri).build();
			return restClient.post(uriComponents, headers, request, response);
		} catch (RestResponseException ex) {
			return null;
		}
	}

//	@Override
//	public AttrCatalogueDto[] consultarCatalogo(String uri) {
//		 try {
//		      UriComponents uriComponents = UriComponentsBuilder.fromUriString(uri).build();
//		      HttpHeaders headers = new HttpHeaders();
//		      headers.add("Accept", "application/vnd.pri.remittances.v1.0+json");
//		      //headers.add("content-type", "application/json;  charset=utf-8");
//		      return restClient.get(uriComponents, headers,AttrCatalogueDto[] .class);
//		 } catch (RestResponseException ex) {
//            ex.getApiError().ifPresent(apiError -> {
//                if (Objects.nonNull(apiError.getErrorCode())) {
//                    DomainError.getDomainError(apiError.getErrorCode()).ifPresent(domainError -> {
//                        if (domainError.equals(DomainError.ESB_ERROR)) {
//                                throw new AplicationServiceException(
//                                    ServiceMessages.ESB_ERROR);
//                        }
//                    });
//                }
//            });
//          throw new ConnectionException(ServiceMessages.CONNECTION_ERROR);
//        }
//	}

}
