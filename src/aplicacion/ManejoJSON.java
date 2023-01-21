package aplicacion;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Emilio
 */
public class ManejoJSON {

    public static void guardarJSON(Object lineaNueva, File ruta){
        try (PrintWriter archivo = new PrintWriter(new FileWriter(ruta, true))) {
            Gson gson;
            gson = new Gson();
            String jsonString = gson.toJson(lineaNueva);
            archivo.write(jsonString);
            archivo.write("\n");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    
    public static ArrayList leerJSON(File ruta, Class clase){
        String cadena;
        List<Object> datos;
        datos = new ArrayList<>();
        try{
            FileReader file = new FileReader(ruta);
            BufferedReader buff = new BufferedReader(file);
            while ((cadena = buff.readLine()) != null){
                datos.add(toClass(cadena, clase));
            }
        }catch(IOException e){
            System.out.println(e);
        }
        return (ArrayList) datos;
        
    }
    
    public static void borrarJSON(int numLinea, File ruta){
        ArrayList datos = leerJSON(ruta, Object.class);
        datos.remove(numLinea);
        try (PrintWriter archivo = new PrintWriter(new FileWriter(ruta))) {
            for (int i = 0; i < datos.size(); i++){
                archivo.write(toJson(datos.get(i)));
                archivo.write("\n");
            }
        }catch(IOException e){
            System.out.println(e);
        }  
    }
    
    public static void borrarTodoJSON(File ruta){
        try {
            PrintWriter archivo = new PrintWriter(new FileWriter(ruta));
            archivo.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        
    }
    
    public static void modificarJSON(Object lineaNueva, int numLinea, File ruta){
        ArrayList datos = leerJSON(ruta, Object.class);
        datos.remove(numLinea);
        datos.add(numLinea, lineaNueva);
        try (PrintWriter archivo = new PrintWriter(new FileWriter(ruta))) {
            for (int i = 0; i < datos.size(); i++){
                archivo.write(toJson(datos.get(i)));
                archivo.write("\n");
            }
        }catch(IOException e){
            System.out.println(e);
        }  
    }
        
    //Recibe la clase pseudonimo, la convierte a Json y la regresa como cadena
    private static String toJson(Object dato){
        Gson gson = new Gson();
        return gson.toJson(dato);
        
    }
    
    //Con esto logramos manipular los datos, convierte a una clase una cadena de datos.
    private static Object toClass(String dato, Class clase){
        Gson gson = new Gson();
        return gson.fromJson(dato, clase);    
    }
   
}
    
