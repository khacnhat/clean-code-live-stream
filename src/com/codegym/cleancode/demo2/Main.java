package com.codegym.cleancode.demo2;

public class Main {
    public static void main(String[] args) {
        Order order = new Order();

        if (order.getStatus() == "paid") {
            System.out.println("Order was paid");
        }
    }
}