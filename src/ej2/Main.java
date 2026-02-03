package ej2;

public class Main {
    public static void main(String[] args) {
        System.out.println("--CURSO EJ2--");
        Curso.Alumno curso = new Curso.Alumno("Programación");

        Curso.Alumno a1 = new Curso.Alumno("1", 8);
        Curso.Alumno a2 = new Curso.Alumno("2", 6);
        Curso.Alumno a3 = new Curso.Alumno("3", 2);

        curso.agregarAlumno(a1);
        curso.agregarAlumno(a2);
        curso.agregarAlumno(a3);

        curso.mostrarCurso();
    }
}
