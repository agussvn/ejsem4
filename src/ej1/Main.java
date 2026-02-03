package ej1;

public class Main{
    public static void main(String[] args) {
        System.out.println("--GUERRERO EJ1--");
        Videojuego.Jugador jug1 = new Videojuego.Jugador("Guerrero",100);

        Videojuego.Objeto espada = new Videojuego.Objeto("Espada");
        Videojuego.Objeto pico = new Videojuego.Objeto("Pico");
        Videojuego.Objeto escudo = new Videojuego.Objeto("Escudo");

        jug1.agregarObjeto(espada);
        jug1.agregarObjeto(pico);

        jug1.mostrarEstado();

        System.out.println("----------------");

    }
    }
