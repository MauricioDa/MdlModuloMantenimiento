package mx.appwhere.gestores.front.application.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Alejandro Martin
 * @version 1.0 - 2017/10/04
 */
@Controller
@RequestMapping("view")
public class IndexController {


    @GetMapping("prueba")
    public String index() {
        return "consultaOperaciones";

    }
}
