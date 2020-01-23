
package Salazar;

import java.util.Calendar;

public class Persona {
    private String cedula;
    private String apellido;
    private String nombre;
    private Calendar nacimiento;

    public Persona() {
    }

    public Persona(String cedula, String apellido, String nombre, Calendar nacimiento) {
        this.cedula = cedula;
        this.apellido = apellido;
        this.nombre = nombre;
        this.nacimiento = nacimiento;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Calendar getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Calendar nacimiento) {
        this.nacimiento = nacimiento;
    }

    @Override
    public String toString() {
        return  apellido + " " + nombre ;
    }
    
}
