package com.example;
import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {
    public void checkOut(){
        System.out.println("Checkout method from ShoppingCart called.");
    }
}
