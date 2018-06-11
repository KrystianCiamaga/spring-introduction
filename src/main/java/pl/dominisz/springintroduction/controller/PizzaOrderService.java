package pl.dominisz.springintroduction.controller;

import pl.dominisz.springintroduction.service.PizzaOrder;

import java.util.List;

public interface PizzaOrderService {


    List<PizzaOrder> findAll();

    PizzaOrder findById(Long id);

    PizzaOrder create(PizzaOrder pizzaOrder);
}
