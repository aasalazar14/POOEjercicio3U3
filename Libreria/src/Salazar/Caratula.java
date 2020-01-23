package Salazar;

public class Caratula {

    private String Fecha;
    private Unidad Unidad;
    private byte NumeroEjercicio;
    private String Titulo;
    private String Descripcion;

    public Caratula() {

    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public Unidad getUnidad() {
        return Unidad;
    }

    public void setUnidad(Unidad Unidad) {
        this.Unidad = Unidad;
    }

    public byte getNumeroEjercicio() {
        return NumeroEjercicio;
    }

    public void setNumeroEjercicio(byte NumeroEjercicio) {
        this.NumeroEjercicio = NumeroEjercicio;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    //Crea una cadena de texto con los valores de inicio
    //De inicio de la caratula y la retorna.
    public String ImprimirInicio() {
        String R = "";
        R += "\t***********************************************************\n";
        R += "\t*\tUNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE\t\t*\n";
        R += "\t*\tCarrera de Ingenieria de Software\t\t*\n";
        R += "\t*\t\tSEP 19 - FEB 20\t\t\t\t*\n";
        R += "\t*\t\tUnidad: " + Unidad + "\t\t\t\t*\n";
        R += "\t*\t PROGRAMACION ORIENTADA A OBJETOS NRC 255" + "\t*\t\t\t\n";
        R += "\t*\t\tDocente: " + "Ing Diego Velasco" + "\t\t*\t\n";
        R += "\n\t************************************************************\n";
        R += "\t*\tNombre: " + "Adrian Salazar" + "\t\t\t\t*\n";
        R += "\t*\tEjercicio: " + NumeroEjercicio + "\t\t\t\t\t*\n";
        R += "\t*\tFecha: " + Fecha + "\t\t\t\t*\n";
        R += "\n\t*****************************************************************\n";
        R += "\t*\tTitulo: " + Titulo + "\t\t\t*\t\t\n";
        R += "\t*\tDescripcion: " + Descripcion + "*\t\t\t\n";

        R += "\n\t******************************************************************";
        return R;
    }

    public String ImprimirFin() {
        String R = "";
        System.out.print("\u001B[0m");
        System.out.print("\n\t\u001B[46m" + "'Cada ser humano observa al mundo desde sus propias limitaciones psicológicas'");
        return R;
    }
}
