package com.example;

public class Estudiante {

    private String nombre;
    private int edad;
    private double promedio;

    public Estudiante() {
        this.nombre = "Desconocido";
        this.edad = 0;
        this.promedio = 0.0;
    }

    public Estudiante(String nombre, int edad, double promedio) {
        this.nombre = nombre;
        setEdad(edad);
        this.promedio = promedio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad > 0) {
            this.edad = edad;
        } else {
            System.out.println("Error: La edad debe ser mayor que 0.");
        }
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public boolean haAprobado() {
        return promedio >= 3.0;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Promedio: " + promedio);

        if (haAprobado()) {
            System.out.println("Estado: APROBADO");
        } else {
            System.out.println("Estado: REPROBADO");
        }
    }
}