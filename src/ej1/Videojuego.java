package ej1;

import java.util.ArrayList;

public class Videojuego {
    static class Objeto{
        private String nombre;

        public Objeto(String nombre){this.nombre=nombre;}
        public String getNombre(){return nombre;}
        public String toString(){return nombre;}
    }


    static class Jugador{

        private String nombre;
        private int vida;
        private ArrayList<Objeto> inventario;

        public Jugador(String nombre,int vida){
            this.nombre=nombre;
            this.vida=vida;
            this.inventario= new ArrayList<>();
        }

        public void agregarObjeto(Objeto objeto){
            inventario.add(objeto);
        }

        public void mostrarEstado(){
            System.out.println("Nombre = " + nombre);
            System.out.println("Vida = " + vida);
            System.out.println("Inventario: ");

            if(inventario.isEmpty()){
                System.out.println("Está vacio");
            } else {
                for(Objeto a : inventario){
                    System.out.println("-" + a);
                }
            }
        }

    }
}
