package Salazar;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public abstract class BasePersistencia<T> {

    protected List<String> leerDirectorio(String directorio, String titulo) throws IOException {
        String ruta = System.getProperty("user.dir") + "/" + directorio;
        File carpeta = new File(ruta);
        File[] archivos = carpeta.listFiles();
        if (archivos == null || archivos.length == 0) {
            return null;
        }
        List<String> resultado = new ArrayList<>();
        String contenido = "";
        for (File a : archivos) {
            contenido = this.leer(directorio, a.getName());
            if (contenido.contains(titulo)) {
                resultado.add(contenido);
            }
        }
        return resultado;
    }

    protected String leer(String directorio, String nombre) throws IOException {
        StringBuilder sb = new StringBuilder();
        try (BufferedReader br = Files.newBufferedReader(Paths.get(directorio, nombre))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                sb.append(linea).append("\n");
            }
            return sb.toString();
        } catch (Exception e) {
            throw e;
        }

    }

    protected String imprimir(T objeto) {
        GsonBuilder gb = new GsonBuilder();
        gb.setPrettyPrinting();
        Gson gson = gb.create();
        return gson.toJson(objeto);
    }

    public void escribir(String directorio, String nombre, T objeto) throws IOException {
        String contenido = this.imprimir(objeto);
        String nombreArchivo = System.getProperty("user.dir") + "/" + directorio + "/" + nombre + ".json";
        try {
            try (FileWriter archivo = new FileWriter(nombreArchivo)) {
                archivo.write(contenido);
            }
        } catch (IOException e) {
            throw e;
        }
    }

    public void escribir(String directorio, String nombre, List<T> objeto) throws IOException {
        String contenido = this.imprimir((T) objeto);
        String nombreArchivo = System.getProperty("user.dir") + "/" + directorio + "/" + nombre + ".json";
        try {
            try (FileWriter archivo = new FileWriter(nombreArchivo)) {
                archivo.write(contenido);
            }
        } catch (IOException e) {
            throw e;
        }
    }

    protected String imprimir(List<T> objeto) {
        GsonBuilder gb = new GsonBuilder();
        gb.setPrettyPrinting();
        Gson gson = gb.create();
        return gson.toJson(objeto);
    }

}
