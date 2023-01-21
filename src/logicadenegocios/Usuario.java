
package logicadenegocios;

import java.io.File;

/**
 *
 * @author emifu
 */
public class Usuario {
    private String nombre;
    private String apellidos;
    private String nombreUsuario;
    private String correo;
    private char[] contraseña;
    
    public static final File RUTA = new File("baseDatos/Usuarios.json");
    public Usuario(String nombre, String apellidos, String usuario, String correo, char[] contraseña) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nombreUsuario = usuario;
        this.correo = correo;
        this.contraseña = contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public char[] getContraseña() {
        return contraseña;
    }

    public void setContraseña(char[] contraseña) {
        this.contraseña = contraseña;
    }
    
    
}
