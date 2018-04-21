package com.rajesh.sharma;

public class Animal {
    private String name;
    private String bodycolour;
    private  int legs;
    private  String eyecolour;

    public Animal() {
        System.out.println("In Animal constructor");
    }


    public Animal(String name, String bodycolour, int legs, String eyecolour) {
        this.name = name;
        this.bodycolour = bodycolour;
        this.legs = legs;
        this.eyecolour = eyecolour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBodycolour() {
        return bodycolour;
    }

    public void setBodycolour(String bodycolour) {
        this.bodycolour = bodycolour;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public String getEyecolour() {
        return eyecolour;
    }

    public void setEyecolour(String eyecolour) {
        this.eyecolour = eyecolour;
    }

    public int getLegs() {
        return this.legs;
    }
}
