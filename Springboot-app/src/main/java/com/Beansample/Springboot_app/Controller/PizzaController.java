package com.Beansample.Springboot_app.Controller;

import com.Beansample.Springboot_app.Service.VegPizza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PizzaController {

    @Autowired
    private VegPizza vegPizza;                    //Field injection

    @Autowired
    public PizzaController(VegPizza vegPizza){       //Constructor injection
        this.vegPizza = vegPizza;
    }

   public String getPizza(){
        return vegPizza.getPizza();
    }
}
