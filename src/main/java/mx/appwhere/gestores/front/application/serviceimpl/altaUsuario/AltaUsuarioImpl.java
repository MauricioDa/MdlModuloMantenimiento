package mx.appwhere.gestores.front.application.serviceimpl.altaUsuario;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import mx.appwhere.gestores.front.application.dto.altaUsuarioDto.GetUser;
import mx.appwhere.gestores.front.application.dto.empleadoDto.Empleado;
import mx.appwhere.gestores.front.application.dto.empleadoDto.GetEmpleado;
import mx.appwhere.gestores.front.application.dto.insertUserDto.InsertUser;
import mx.appwhere.gestores.front.application.dto.setUserDto.SetUser;
import mx.appwhere.gestores.front.domain.services.altausuarios.AltaUsuarioService;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

@Service
public class AltaUsuarioImpl implements AltaUsuarioService {

    @Override
    public GetUser getUser(String entidad, String expediente, String activo) {
          GetUser getUser = new GetUser();
            getUser.setEntidad(entidad);
            getUser.setExpediente(expediente);
            getUser.setActivo(activo);
        return getUser;
    }

    @Override
    public Empleado obtenerEmpleado(GetUser getUser) throws IOException {

        String url="http://172.26.9.65:8288/RemInterEmpleados/GetEmpleado";
        final Gson gson = new GsonBuilder().setPrettyPrinting().create();
        final String json = gson.toJson(getUser);
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<String> entity = new HttpEntity<String>(json,headers);
        String answer = restTemplate.postForObject(url, entity, String.class);
        ObjectMapper mapper = new ObjectMapper();
        GetEmpleado getEmpleados = mapper.readValue(answer, GetEmpleado.class);
        Empleado empleado=null;
        if (getEmpleados.getGetEmpleadoResponse()==null){
            empleado= new Empleado().create("","","","","","","","","","");
        }else{
            empleado=getEmpleados.getGetEmpleadoResponse().getEmpleado();
        }

        return empleado;
    }

    @Override
    public String SetUser(SetUser setUser) throws IOException {

        String url="http://172.26.9.65:8288/RemInterEmpleados/SetEmpleado";
        final Gson gson = new GsonBuilder().setPrettyPrinting().create();
        final String json = gson.toJson(setUser);
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<String> entity = new HttpEntity<String>(json,headers);
        String answer = restTemplate.postForObject(url, entity, String.class);
        ObjectMapper mapper = new ObjectMapper();
        InsertUser insertUser = mapper.readValue(answer, InsertUser.class);

        return null;
    }
}
