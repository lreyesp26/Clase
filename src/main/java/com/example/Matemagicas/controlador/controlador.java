/*
     * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
     * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Matemagicas.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Luis
 */
@Controller
public class controlador {

    @GetMapping("/")
    public ModelAndView vistaPrincipal() {
        ModelAndView modelo = new ModelAndView("index");
        return modelo;
    }

    @GetMapping("/login")
    public ModelAndView vistaLogin() {
        ModelAndView modelo = new ModelAndView("login");
        return modelo;
    }

    @GetMapping("/register")
    public ModelAndView vistaRegister() {
        ModelAndView modelo = new ModelAndView("register");
        return modelo;
    }
    
    @GetMapping("/actividades")
    public ModelAndView vistaActividades() {
        ModelAndView modelo = new ModelAndView("actividades");
        return modelo;
    }
    
    @GetMapping("/calificaciones")
    public ModelAndView vistaCalificaciones() {
        ModelAndView modelo = new ModelAndView("calificaciones");
        return modelo;
    }
}
