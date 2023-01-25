package aplicacion;

import com.google.gson.Gson;
import logicadenegocios.Imagen;
import java.awt.Image;
import javax.swing.ImageIcon;
import logicadenegocios.DatosHeroe;
import logicadenegocios.DatosPersonales;
import logicadenegocios.Personaje;
import logicadenegocios.Poder;
import logicadenegocios.TipoDeClase;
import logicadenegocios.TipoDePersonaje;

/**
 *
 * @author emifu
 */
public class Main {

    public static void main(String[] args) {
        Gson gson = new Gson();
        /*
        Poder poder = new Poder(50, 50, 50, 50, 50);
        DatosHeroe datosHeroe = new DatosHeroe("Iron Man", TipoDeClase.TECNOLOGICO, TipoDePersonaje.HEROE, poder);
        DatosPersonales datosPersonales = new DatosPersonales("Tony Stark", "06/12/99", "New York");
        Imagen imagen = new Imagen("/recursos/defecto/foto.png");
        Personaje personaje = new Personaje(datosHeroe, datosPersonales, "Marvel", imagen);
        String json = gson.toJson(personaje);
        */

        /*
        String json = "{\"address\":{\"city\":\"Berlin\",\"country\":\"Germany\"},\"age\":30,\"first_name\":\"John\",\"mail\":\"john@gmail.com\"}";
        Employee employee = gson.fromJson(json, Employee.class);
        */
        
        
        System.out.println("Hola Chechita guapa");
        //Ciudad ciudad1 = new Ciudad("Honduras", "Barcelona", "Barcelina", Escenario.CIUDAD);
        //Ciudad ciudad2 = new Ciudad("Mongolia", "Barcelona", "Barcelina", Escenario.CIUDAD);
        //ManejoJSON.guardarJSON(ciudad1, Ciudad.RUTA);
        //ManejoJSON.guardarJSON(ciudad2, Ciudad.RUTA);
        //ArrayList<Object> lista = new ArrayList<>();
        //lista = ManejoJSON.leerJSON(Ciudad.RUTA, Ciudad.class);
        //Ciudad ciudad1 = (Ciudad) lista.get(0);
        //Ciudad ciudad2 = (Ciudad) lista.get(1);
        //System.out.println(ciudad1.getPais());
        //System.out.println(ciudad2.getPais());
        //ManejoJSON.modificarJSON(ciudad1, 1, Ciudad.RUTA);
        //Servidor servidor = new Servidor();
        /*
        Poder poder1 = new Poder(50, 80, 30, 10, 10);
        DatosHeroe datosHeroe1 = new DatosHeroe("Barbilla Roja", TipoDeClase.MUTANTE, TipoDePersonaje.VILLANO, "Los Padrinos Magicos", poder1);
        Date fecha = new Date();
        DatosPersonales datosPersonales1 = new DatosPersonales("Washinton McCoffi", fecha, "Dinmsdayl");
        File foto1 = new File("/Proyecto2_Marvel/src/main/java/recursos/defecto/foto.png");  
        Personaje personaje1 = new Personaje(datosHeroe1, datosPersonales1);
        
        System.out.println(personaje1.toString());
        
        ManejoJSON.guardarJSON(personaje1, Personaje.RUTA);*/
    }
}
