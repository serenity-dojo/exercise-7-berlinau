package com.serenitydojo;

public abstract class Pet {
    private String name;
    private int age;
    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Pet() {
    }

    public abstract String play();

    public String getName() {
        return "Fido";
    }

    public int getAge() {
        return 5;
    }
}
