package com.company;

public class Material {
    String name;
    int quantity;
    double price;

    public Material(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public double getTotalCost() {
        return quantity * price;
    }
}