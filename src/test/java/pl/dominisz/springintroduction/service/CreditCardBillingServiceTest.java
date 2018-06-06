package pl.dominisz.springintroduction.service;

import org.junit.Test;

public class CreditCardBillingServiceTest {

    @Test
    void shouldCreateReceiptForProperOrder() {


        CreditCardBillingService creditCardBillingService=new CreditCardBillingService();

        PizzaOrder pizzaOrder=new PizzaOrder();
        CreditCard creditCard=new CreditCard();

        Receipt actualReceipt=creditCardBillingService.chargeOrder(pizzaOrder,creditCard);



    }

}
