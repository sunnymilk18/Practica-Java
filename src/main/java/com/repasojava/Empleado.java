package com.repasojava;

import java.time.LocalDate;

public class Empleado extends Persona {

    private String especialidad;
    private int salario;

    public Empleado() {
    }

    public Empleado(String nombre, int edad, String rut, LocalDate fechaNacimiento, String especialidad, int salario) {
        super(nombre, edad, rut, fechaNacimiento);
        this.especialidad = especialidad;
        this.salario = salario;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public void mostrarDatos() {
        System.out.println("\nNombre: " + getNombre() + "\nEdad: " + getEdad() + "\nRut: " + getRut() +
                "\nFecha de nacimiento: " + this.fechaFormateada(getFechaNacimiento()) + "\nEspecialidad: "
                + getEspecialidad() + "\nSalario: " + getSalario());
    }

}
