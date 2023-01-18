package com.repasojava;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Persona {

    private String nombre;
    private int edad;
    private String rut;
    private LocalDate fechaNacimiento;

    public Persona() {
    }

    public Persona(String nombre, int edad, String rut, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.edad = edad;
        this.rut = rut;
        this.fechaNacimiento = fechaNacimiento;
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
        this.edad = edad;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String fechaFormateada(LocalDate fechaNacimiento) {
        DateTimeFormatter fecha = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return fechaNacimiento.format(fecha);
    }

    public void mostrarDatos() {
        System.out.println("\nNombre: " + getNombre() + "\nEdad: " + getEdad() + "\nRut: " + getRut() +
                "\nFecha de nacimiento: " + this.fechaFormateada(this.fechaNacimiento));
    }

}
