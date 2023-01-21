
package logicadenegocios;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalDate;

/**
 *
 * @author emifu
 */
public class ServidorLocal {
    private String nombre;
    private Ciudad ciudad;
    private String fechaCreacion;
    private static int puerto = 5000;
    public static final File RUTA = new File("baseDatos/Servidores.json");
    
    /*
    private ServerSocket ss;
    private Socket s;
    private DataInputStream din;
    private DataOutputStream dout;
    */
    public ServidorLocal(String nombre, Ciudad ciudad, String fechaCreacion) { //, ServerSocket ss, Socket s, DataInputStream din, DataOutputStream dout
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.fechaCreacion = fechaCreacion;
        ServidorLocal.puerto ++;
        
        /*
        this.ss = ss;
        this.s = s;
        this.din = din;
        this.dout = dout;
        */
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
/*
    public ServerSocket getSs() {
        return ss;
    }

    public void setSs(ServerSocket ss) {
        this.ss = ss;
    }

    public Socket getS() {
        return s;
    }

    public void setS(Socket s) {
        this.s = s;
    }

    public DataInputStream getDin() {
        return din;
    }

    public void setDin(DataInputStream din) {
        this.din = din;
    }

    public DataOutputStream getDout() {
        return dout;
    }

    public void setDout(DataOutputStream dout) {
        this.dout = dout;
    }
  */  
    
}
