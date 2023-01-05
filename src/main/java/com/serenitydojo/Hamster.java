package com.serenitydojo;

public class Hamster extends Pet {

    private String favoriteGame;
    public Hamster(String hazel, int age, String favoriteGame) {
        super(hazel, age);
        this.favoriteGame = favoriteGame;
    }

    @Override
    public String play() {
        return "runs in wheel";
    }
}
