package mx.appwhere.gestores.front.application.controllers.gestores;


import mx.appwhere.gestores.front.application.constants.ViewsLocation;
import mx.appwhere.gestores.front.application.dto.logoNuevoDto.LogoNuevo;
import mx.appwhere.gestores.front.application.dto.obtenerEntidades.Fila;
import mx.appwhere.gestores.front.application.dto.obtenerEntidadesSN.FilaSn;
import mx.appwhere.gestores.front.domain.services.altalogo.AltaLogoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;


@RestController
public class GestoresController {

    @Autowired
    AltaLogoService altaLogoService;

    @PostMapping("busqueda-logos")
    public ModelAndView getMainView(@RequestParam("BSFOPERADOR") String bsfOperador) {
        ModelAndView mv = new ModelAndView(ViewsLocation.VISTA_PRINCIPAL);
        Fila[] catalogoCon = altaLogoService.obtenerEntidadLogo();
        FilaSn[] catalogoSn = altaLogoService.obtenerEntidadSN();
        mv.addObject("conLogos", catalogoCon);
        mv.addObject("sinLogo", catalogoSn);
        altaLogoService.obtenerEntidadSN();

        return mv;
    }

    @PostMapping("enviar-logo")
    @ResponseBody
    public String altaLogo(LogoNuevo logoNuevo) throws IOException {
        altaLogoService.subirLogoNew(logoNuevo);
        return altaLogoService.insertarActualizar(logoNuevo);
    }

}
