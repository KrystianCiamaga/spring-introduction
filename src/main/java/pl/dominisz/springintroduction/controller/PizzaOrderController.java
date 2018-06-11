package pl.dominisz.springintroduction.controller;


import org.springframework.web.bind.annotation.*;
import pl.dominisz.springintroduction.service.PizzaOrder;

import java.util.List;




@RestController("/pizzaorders")
public class PizzaOrderController {

    private final PizzaOrderService pizzaOrderService;


    public PizzaOrderController(PizzaOrderService pizzaOrderService) {
        this.pizzaOrderService = pizzaOrderService;
    }

    @RequestMapping(path="/")
    public List<PizzaOrder> getAllOrders(){

        return pizzaOrderService.findAll();




    }



    @RequestMapping(path = "/{id}")
    public PizzaOrder getOrder(@PathVariable Long id){

        return pizzaOrderService.findById(id);


    }




    @RequestMapping(path = "/",method = RequestMethod.POST)
    public PizzaOrder createOrder(@RequestBody PizzaOrder pizzaOrder){

        return pizzaOrderService.create(pizzaOrder);


    }






}
