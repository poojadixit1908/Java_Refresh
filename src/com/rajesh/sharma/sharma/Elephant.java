package com.rajesh.sharma.sharma;

import com.rajesh.sharma.Animal;

public class Elephant extends Animal {

    private boolean hasTrunk;

    public Elephant(String name, String bodycolour, int legs, String eyecolour) {
        super(name, bodycolour, legs, eyecolour);
        this.hasTrunk = true;
    }

}