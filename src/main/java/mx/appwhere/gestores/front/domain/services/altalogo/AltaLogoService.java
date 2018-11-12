package mx.appwhere.gestores.front.domain.services.altalogo;

import mx.appwhere.gestores.front.application.dto.logoNuevoDto.LogoNuevo;
import mx.appwhere.gestores.front.application.dto.obtenerEntidades.Fila;
import mx.appwhere.gestores.front.application.dto.obtenerEntidadesSN.FilaSn;

import java.io.IOException;

public interface AltaLogoService {

    String subirLogoNew(LogoNuevo logoNuevo);

    Fila[] obtenerEntidadLogo();

   FilaSn[] obtenerEntidadSN();

   String insertarActualizar(LogoNuevo logoNuevo) throws IOException;

}
