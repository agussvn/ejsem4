package ej2;

import java.util.ArrayList;
public class Curso {
    static class Alumno {
        public String nombre;
        public double nota;

        public Alumno(String nombre, double nota) {
            this.nombre = nombre;
            this.nota = nota;
        }

        public void mostrarDatos() {
            System.out.println("Nombre = " + nombre + " , Nota = " + nota);
        }
    }

    class curso {

        private String nombre;
        private ArrayList<Alumno> alumnos;

        public curso(String nombre) {
            this.nombre = nombre;
            this.alumnos = new ArrayList<>();
        }

        public void agregarAlumno(Alumno alumno) {
            alumnos.add(alumno);
        }

        public void mostrarCurso() {
            System.out.println("Curso: " + nombre);
            System.out.println("Lista de alumnos: ");
            for (Alumno a : alumnos) {
                a.mostrarDatos();
            }
        }
    }
}
