package mx.appwhere.gestores.front.application.controllers.main;

import mx.appwhere.gestores.front.application.constants.ApplicationConstants;
import mx.appwhere.gestores.front.application.constants.ViewsLocation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Luis Angel Flores Pérez
 * @version 1.0 07/02/2018
 */
@RestController
@RequestMapping("/menu")
public class MainController {

    private String bsfOperador = "ig6bpA59BmxGAIwqUPcX5SRRxl3om/4vKuu6jFTBSvU5gKmGr1uJw8UtEY0a81/ln/qt7jxIHGE9hcv8i60x9l3wMLwI0JzXABXqlKpSRnAjEZyjRb3Gw9pX9RD79azdVLMxK77tK+V9DMxQrXQyXzcdZYZfFAZdAv46EBax9n2RQeDMm/YyZ4nWfPcM4mkXP3Nbrl7+W7AyLIxZJsfjPAcsjDwPk6LODqB+2Igq+qJUWQd1Q+8DOdq3ITGxkyIHaiptUThyiP5LsDt0Lk2LhJViS+gguFhWGwfSvg3gtH0lbNDqHnWd/ryTAt0fXzbYNiJ82hA5nxKCVG4VEfcGefu9qcFxcqRd4pOs13p6sJN8scY3gPAp8clP09GDI7KzQQEpCP5laRlQUFz92e7K2j9HhbrYQexRzj8ZEZfOf7fWGHEsIO84ax6tdVT4fH7vLt9aoHWk5vluxKjJlLOLlHqyIeUZRuQrxWRqN4J/6WN/Bi+68coYJfZs5egDiXK0y4ORPULj7zIKAjCOCTnfLmrF+8NROOVm+w83svkgQOO4FM/SAtyPJQQ5yWSwxM7S";
    /**
     * Nombre getMainView
     * Propósito Presentar el formulario para enviar mediante POST en bsfOperador
     * Inputs -
     * @return ModelAndView hacia el archivo HTML /main/main.html
     */
    @GetMapping(produces = ApplicationConstants.VIEWS_PRODUCE_HTML)
    public ModelAndView getMainView() {
        ModelAndView mav = new ModelAndView(ViewsLocation.MAIN_VIEW);
        mav.addObject("BSFOPERADOR", bsfOperador);
        return mav;
    }
}
