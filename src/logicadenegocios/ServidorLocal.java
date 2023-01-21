
package logicadenegocios;

import gui.D_JuegoServidor;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author emifu
 */
public class ServidorLocal {
    private String nombre;
    private Ciudad ciudad;
    private String fechaCreacion;
    private int puerto;
    
 
    public static final File RUTA = new File("baseDatos/Servidores.json");
    
    public ServidorLocal(String nombre, Ciudad ciudad, String fechaCreacion, int puerto) { 
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.fechaCreacion = fechaCreacion;
        this.puerto = puerto;
 
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public int getPuerto() {
        return puerto;
    }

    public void setPuerto(int puerto) {
        this.puerto = puerto;
    }

    
}
