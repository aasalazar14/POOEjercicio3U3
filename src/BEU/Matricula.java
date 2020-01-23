package BEU;

import Salazar.Persona;
import Salazar.Unidad;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.UUID;

public class Matricula {

    //Datos
    private final String numero;
    private Calendar Fecha;
    private Estado estado;
    private Persona estudiante;
    private Curso curso;
    private final  List<Calificacion> calificaciones = new ArrayList<>();
    //Informacion
    private float promedio;
    

    public Matricula() {
        Fecha = Calendar.getInstance();
        estado = Estado.Registrada;
        UUID numeroAleatorio = UUID.randomUUID();
        this.numero = numeroAleatorio.toString();
    }

    public String getNumero() {
        return numero;
    }

  
    public float getPromedio() {
        return promedio;
    }

    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }
    

    public Calendar getFecha() {
        return Fecha;
    }

    public void setFecha(Calendar Fecha) {
        this.Fecha = Fecha;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Persona getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Persona estudiante) {
        this.estudiante = estudiante;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
    

    public void calcularPromedio() {
       if (this.calificaciones.isEmpty()){
           return;
       }
        float suma = 0f;
        for (Calificacion c : calificaciones) {
            suma += c.valor; // Se puede acceder al atributo porque
        }
        int divisor = this.calificaciones.size();
        promedio = (float) suma / (float) divisor;
        if(divisor == 3 ){
            if (promedio> 14){
                this.estado = Estado.Aprobada;
            }else{
                this.estado = Estado.Reprobada;
            }
        }
    }
//Este metodo registra una calificacion y retorna un número
    //1 si es la nota de la Unidad 1
    //2 si es la nota de la unidad II
    // 3 si es la nota de la unidad III
    // o si ya tiene todas las notas
    public int addCalificacion(float v) {
        Calificacion cal = new Calificacion();
        int cuentaNotas = this.calificaciones.size();
        switch (cuentaNotas) {
            case 0:
                cal.setUnidad(Unidad.I);
                break;
            case 1:
                cal.setUnidad(Unidad.II);
                break;
            case 2:
                cal.setUnidad(Unidad.III);
                break;
            default: return 0;// caso de tener todas las notas retorna 0

        }
        cal.setValor(v);
        cal.setFecha(Calendar.getInstance());
        this.calificaciones.add(cal);
        this.calcularPromedio();
        //Retorna el tamaño de la lista
         return this.calificaciones.size();
    }
    @Override
    public String toString(){
        return estudiante.toString() +" #"+ numero;
    }
    public String toSave(){
         GsonBuilder gb = new GsonBuilder();
            gb.setPrettyPrinting();
            Gson gson = gb.create();
            return (gson.toJson(this));
    }
public String imprimirDetalle(){
     
        String str = "\n\t" + this.estudiante;
        for (Calificacion c : this.calificaciones){
            str += "\t\t"+c.getValor();
         }
        str += "\t\t"+ this.promedio + "\n";
        return str;
                
   
}



    class Calificacion {

        private Calendar fecha;
        private float valor;
        private Unidad unidad;

        public Calificacion() {
        }

        public Calendar getFecha() {
            return fecha;
        }

        public void setFecha(Calendar fecha) {
            this.fecha = fecha;
        }

        public float getValor() {
            return valor;
        }

        public void setValor(float valor) {
            this.valor = valor;
        }

        public Unidad getUnidad() {
            return unidad;
        }

        public void setUnidad(Unidad unidad) {
            this.unidad = unidad;
        }

    }
     

}
