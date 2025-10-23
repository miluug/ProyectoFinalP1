package org.example.proyectofinalmusica.model;

import java.time.LocalDate;

public class Estudiante extends Persona {

    private LocalDate fechaNacimiento;


    public Estudiante(String numIdentificacion, String nombreCompleto, String correoElectronico, String telefono, String direccion, LocalDate fechaNacimiento) {
        super(numIdentificacion, nombreCompleto, correoElectronico, telefono, direccion);
        this.fechaNacimiento = fechaNacimiento;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
}
