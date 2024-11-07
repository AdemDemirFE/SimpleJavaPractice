package com.company;

public class Doctor extends Person {
    boolean isSurgeon;
    double fee;

    public Doctor(String name, int id, boolean isSurgeon, double fee) {
        super(name, id);
        this.isSurgeon = isSurgeon;
        this.fee = fee;
    }
}

