package Salazar;

import java.io.IOException;
import java.util.List;

public interface BaseBllCrud<T> {
    
    public void crear(); //Create
    public void consultar(String id)throws IOException; //Retrieve
    public void actualizar()throws IOException; //Update
    public void eliminar()throws IOException; //Delete
    
    
    
    
}
