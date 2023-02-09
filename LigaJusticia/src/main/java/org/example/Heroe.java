package org.example;

public class Heroe {

    private String name;
    private int power = 20; // power of 0 a 100

    public Heroe() {
    }

    public Heroe(String name, int power) {
        this.name = name;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        if (power >= 0 && power <= 100) {
            this.power = power;
        }
        else {
            System.out.println("Valor incorrecto");
        }

    }

    public String greet(String name) {
        return "Hi friend, how are you " + name + "?";
    }
}
