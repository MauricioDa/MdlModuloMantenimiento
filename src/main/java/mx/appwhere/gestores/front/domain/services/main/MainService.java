package mx.appwhere.gestores.front.domain.services.main;

import mx.appwhere.gestores.front.application.dto.ejemplo.EjemploDto;
import mx.appwhere.gestores.front.application.dto.ejemplo.ExampleDto;
import mx.appwhere.gestores.front.domain.exceptions.ajax.FormatException;
import org.springframework.web.servlet.ModelAndView;

public interface MainService {
    ModelAndView getMain(String BsfOperador);

    ModelAndView getMainTranport(String transport);

    EjemploDto utilizarConverter();

    EjemploDto getValidation(ExampleDto exampleDto)throws FormatException;
}
