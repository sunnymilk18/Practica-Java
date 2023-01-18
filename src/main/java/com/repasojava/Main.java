package com.repasojava;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    static List<Persona> listaEmpleados = new ArrayList<Persona>();

    public static void main(String[] args) {

        listaEmpleados.add(new Empleado("Nombre de prueba 1", 23, "1.234.567-8", LocalDate.of(2002, 5, 12),
                "Operador de maquinaria pesada", 800000));

        listaEmpleados.add(new Empleado("Nombre de prueba 2", 31, "8.546.238-K", LocalDate.of(1992, 2, 4),
                "Administrador de empresas", 750000));

        listaEmpleados.add(new Empleado("Nombre de prueba 3", 35, "4.567.123-16", LocalDate.of(1995, 6, 25),
                "Electricista", 800000));

        for (Persona p : listaEmpleados) {
            p.mostrarDatos();
        }
    }
}
