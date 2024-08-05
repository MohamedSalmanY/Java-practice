package com.Beansample.Springboot_app.Controller;

import org.springframework.stereotype.Component;

@Component("pizzademo")
public class PizzaController {

    public String getPizza(){
        return "Hot Pizza";
    }
}
