package BLL;

import BEU.Curso;
import BEU.Estado;
import BEU.Estudiante;
import BEU.Matricula;
import Salazar.BaseBllCrud;
import Salazar.BasePersistencia;
import Salazar.Util;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GestionMatricula extends BasePersistencia<Matricula> implements BaseBllCrud<Matricula> {

    private Matricula matricula;
    private final String directorio = "matriculas";

    public GestionMatricula() {
    }

    public void setMatricula(Matricula matricula) {
        this.matricula = matricula;
    }
      public String imprimir(){
        StringBuilder sb = new StringBuilder();
        sb.append("Estudiante: ").append(matricula.getEstudiante()).append("\n");
        sb.append("Curso: ").append(matricula.getCurso().getTitulo()).append("\n");
        sb.append("Promedio: ");
        sb.append(matricula.getPromedio());
        sb.append(matricula.imprimirDetalle());
        
        return sb.toString();
    }

    public String Calificar(float valor) {
        String mensaje = "";

        int num = this.matricula.addCalificacion(valor);
        switch (num) {
            case 0:
                mensaje = "Todas las notas estan registradas.\n";
                break;
            case 1:
                mensaje = "Calificacion de la Unidad I registrada correctamente.\n";
                break;
            case 2:
                mensaje = "Calificacion de la Unidad II registrada correctamente.\n";
                break;
            case 3:
                mensaje = "Calificacion de la Unidad III registrada correctamente.\n";
                break;
            default:
                mensaje = "Hubo un error al agregar la calificacion.\n";
                break;

        }
        return mensaje;
    }

    public void archivar() throws IOException {
        this.escribir(directorio, this.matricula.getNumero(), matricula);
    }

    public void configurar(Curso cr, Estudiante est) {
        this.matricula.setCurso(cr);
        this.matricula.setEstudiante(est);
    }

    public void promediar() {
        this.matricula.calcularPromedio();
    }

    public String imprimirDetalle() {
        return matricula.imprimirDetalle();
    }

    public String anularMatricula() {
        String str = "";

        matricula.setEstado(Estado.Anulada);
        str += "\nLa matricula ha sido anulada con exito\n";
        float valor = matricula.getCurso().getCosto() * 0.10f;
        str += "El valor que debe cancelar por anular la matricula es: " + valor;

        return str;
    }

    public List<Matricula> reportar(String titulo) throws IOException {
        List<Matricula> resultado = new ArrayList<>();
        List<String> contenidos = this.leerDirectorio(directorio, titulo);
        for (String texto : contenidos) {
            GsonBuilder gb = new GsonBuilder();
            gb.setPrettyPrinting();
            Gson gson = gb.create();
            
             try {
                 Matricula m = gson.fromJson(texto, Matricula.class);
                 resultado.add(m);
             }catch(JsonSyntaxException ex ){
                 Util.imprimir("No se pudo convertir en matricula" + ex.toString()+ "\n");
             }            
        }
        return resultado;
    }

    @Override
    public void crear() {
        matricula = new Matricula();

    }

    @Override
    public void consultar(String id) throws IOException {
        String archivo = id + ".json";
        String contenido = this.leer(directorio, archivo);
        GsonBuilder gb = new GsonBuilder();
        gb.setPrettyPrinting();
        Gson gson = gb.create();
        matricula = gson.fromJson(contenido, Matricula.class);
    }

    @Override
    public void actualizar() throws IOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar() throws IOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
