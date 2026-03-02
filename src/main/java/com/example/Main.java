package com.example;

public class Main {

    public static void main(String[] args) {

        // ====== PRUEBA LIBRO ======
        System.out.println("=== PRUEBA LIBRO ===");
        Libro l1 = new Libro();
        l1.mostrarDetalles();

        Libro l2 = new Libro("Harry Potter", "J.K. Rowling");
        l2.mostrarDetalles();

        Libro l3 = new Libro("El Señor de los Anillos", "J.R.R. Tolkien", 1200);
        l3.mostrarDetalles();


        // ====== PRUEBA CUENTA BANCARIA ======
        System.out.println("\n=== PRUEBA CUENTA BANCARIA ===");
        CuentaBancaria cuenta = new CuentaBancaria("Maria", 500);
        cuenta.depositar(200);
        System.out.println("Saldo actual: " + cuenta.getSaldo());

        cuenta.retirar(1000); // Fondos insuficientes


        // ====== PRUEBA ESTUDIANTE ======
        System.out.println("\n=== PRUEBA ESTUDIANTE ===");
        Estudiante e = new Estudiante("Pedro", 21, 2.5);
        e.mostrarInfo();
    }
}