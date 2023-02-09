package org.example;

public class Heroe {

    private String name;
    public int power = 20; // power of 0 a 100

    public Heroe() {
    }

    public Heroe(String name, int power) {
        this.name = name;
        this.power = power;
    }

    public String greet(String name) {
        return "Hi friend, how are you " + name + "?";
    }
}
