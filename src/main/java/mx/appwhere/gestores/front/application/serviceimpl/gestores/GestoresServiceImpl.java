package mx.appwhere.gestores.front.application.serviceimpl.gestores;

import mx.appwhere.gestores.front.application.constants.ViewsLocation;
import mx.appwhere.gestores.front.domain.services.GenericService;
import mx.appwhere.gestores.front.domain.services.gestores.GestoresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

@Service
public class GestoresServiceImpl implements GestoresService {

    @Autowired
    GenericService genericService;

    @Override
    public ModelAndView getMainView(String bsfOperador) {
        ModelAndView mv = new ModelAndView(ViewsLocation.VISTA_PRINCIPAL);
        return mv;
    }

}
