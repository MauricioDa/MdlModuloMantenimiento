package mx.appwhere.gestores.front.domain.services.altausuarios;

import mx.appwhere.gestores.front.application.dto.altaUsuarioDto.GetUser;
import mx.appwhere.gestores.front.application.dto.empleadoDto.Empleado;
import mx.appwhere.gestores.front.application.dto.setUserDto.SetUser;

import java.io.IOException;

public interface AltaUsuarioService {

    GetUser getUser(String entidad, String Expediente, String activo );

    Empleado obtenerEmpleado(GetUser getUser) throws IOException;

    String SetUser(SetUser setUser) throws IOException;

}
