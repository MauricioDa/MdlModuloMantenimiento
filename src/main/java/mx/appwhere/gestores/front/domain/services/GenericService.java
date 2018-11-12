package mx.appwhere.gestores.front.domain.services;



/**
 * @author Luis Angel Flores
 * @version 1.0 - 28/03/2018
 */
public interface GenericService {

	public Object responseObject(String uri, Object request, Class response);

    public Object responseMav(String uri, Object request, Class response);
    
   // public AttrCatalogueDto[] consultarCatalogo(String uri);
}
