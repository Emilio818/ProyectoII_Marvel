
package logicadenegocios;

import aplicacion.ManejoJSON;
import java.io.File;

/**
 *
 * @author emifu
 */
public class Estadistica {
    private String usuario;
    private String estado;
    private Personaje personaje;
    
    public static final File RUTA = new File("baseDatos/Estadisticas.json");

    public Estadistica(String usuario, String estado, Personaje personaje) {
        this.usuario = usuario;
        this.estado = estado;
        this.personaje = personaje;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Personaje getPersonaje() {
        return personaje;
    }

    public void setPersonaje(Personaje personaje) {
        this.personaje = personaje;
    }

    
    
}
