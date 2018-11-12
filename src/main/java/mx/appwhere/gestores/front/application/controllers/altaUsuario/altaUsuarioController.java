package mx.appwhere.gestores.front.application.controllers.altaUsuario;

import mx.appwhere.gestores.front.application.constants.ViewsLocation;
import mx.appwhere.gestores.front.application.dto.empleadoDto.Empleado;
import mx.appwhere.gestores.front.application.dto.logoNuevoDto.LogoNuevo;
import mx.appwhere.gestores.front.application.dto.setUserDto.SetUser;
import mx.appwhere.gestores.front.domain.services.altausuarios.AltaUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;

@RestController
public class altaUsuarioController {

    @Autowired
    AltaUsuarioService altaUsuarioService;

    @PostMapping("alta-usuario")
    public ModelAndView getAltaUsuario(@RequestParam("BSFOPERADOR") String bsfOperador) {
        ModelAndView mv = new ModelAndView(ViewsLocation.VISTA_ALTA);
        return mv;
    }

    @PostMapping("insertar-usuario")
    public ModelAndView getUser(@RequestParam("entidad") String entidad, @RequestParam("expediente") String expediente) throws IOException {
        Empleado empleado = altaUsuarioService.obtenerEmpleado(altaUsuarioService.getUser(entidad, expediente, "true"));
        ModelAndView mv = new ModelAndView(ViewsLocation.VISTA__SET);
        mv.addObject("empleado", empleado );
        return mv;
    }

    @PostMapping("send-user")
    @ResponseBody
    public String altaLogo(SetUser setUser) throws IOException {
            altaUsuarioService.SetUser(setUser);
        return null;
    }
}
