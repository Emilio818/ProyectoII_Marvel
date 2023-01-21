package logicadenegocios;


import java.io.File;

/**
 *
 * @author Ginger
 */
public class Ciudad {
    private String pais;
    private String estado;
    private String ciudad;
    private Escenario escenario;
    public static final File RUTA = new File("baseDatos/Ciudades.json"); 

    public Ciudad(String pais, String estado, String ciudad, Escenario escenario) {
        this.pais = pais;
        this.estado = estado;
        this.ciudad = ciudad;
        this.escenario = escenario;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Escenario getEscenario() {
        return escenario;
    }

    public void setEscenario(Escenario escenario) {
        this.escenario = escenario;
    }

    
}
