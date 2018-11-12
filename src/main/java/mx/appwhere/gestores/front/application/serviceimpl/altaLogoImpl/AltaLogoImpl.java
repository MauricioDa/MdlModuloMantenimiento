package mx.appwhere.gestores.front.application.serviceimpl.altaLogoImpl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import mx.appwhere.gestores.front.application.dto.SubirLogoDto.Editar;
import mx.appwhere.gestores.front.application.dto.logoNuevoDto.LogoNuevo;
import mx.appwhere.gestores.front.application.dto.obtenerEntidades.EntidadCN;
import mx.appwhere.gestores.front.application.dto.obtenerEntidades.Fila;
import mx.appwhere.gestores.front.application.dto.obtenerEntidadesSN.EntidadSN;
import mx.appwhere.gestores.front.application.dto.obtenerEntidadesSN.FilaSn;
import mx.appwhere.gestores.front.domain.services.altalogo.AltaLogoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

@Service
public class AltaLogoImpl implements AltaLogoService {

    @Autowired
    EntidadCN entidadCN;

    @Autowired
    EntidadSN entidadSN;

    @Autowired
    Editar editar;


    @Override
    public String subirLogoNew(LogoNuevo logoNuevo) {
        return "Hola";
    }

    @Override
    public Fila[] obtenerEntidadLogo() {

        final String uri = "http://172.26.9.65:8288/Digitalizacion/ConLogo";
        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(uri, String.class);
        ObjectMapper mapper = new ObjectMapper();
        try {
             entidadCN= mapper.readValue(result, EntidadCN.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return entidadCN.getResultado().getFila();
    }

    @Override
    public FilaSn[] obtenerEntidadSN() {

        final String url = "http://172.26.9.65:8288/Digitalizacion/SinLogo";
        RestTemplate restTemplate = new RestTemplate();
        String resul = restTemplate.getForObject(url, String.class);
        ObjectMapper mapper = new ObjectMapper();
        try {
           entidadSN = mapper.readValue(resul, EntidadSN.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return entidadSN.getResultado().getFila();
    }

    @Override
    public String insertarActualizar(LogoNuevo logoNuevo) throws IOException {

        String url="http://172.26.9.65:8288/Digitalizacion/InsertarActualizarLogo";
        final Gson gson = new GsonBuilder().setPrettyPrinting().create();
        final String json = gson.toJson(logoNuevo);
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<String> entity = new HttpEntity<String>(json,headers);
        String answer = restTemplate.postForObject(url, entity, String.class);
        ObjectMapper mapper = new ObjectMapper();
        editar = mapper.readValue(answer, Editar.class);

        return null;
    }


}
