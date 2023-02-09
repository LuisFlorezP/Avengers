package clases;

import org.example.Heroe;

public class Villain {

    protected String name;
    public int power;
    private Heroe heroe;

    public int destroy() {
        int resultado = this.power - this.heroe.getPower();

        return resultado;
    }
}
