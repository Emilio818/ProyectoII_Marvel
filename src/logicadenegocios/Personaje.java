package logicadenegocios;

import com.google.gson.annotations.SerializedName;
import java.awt.Image;
import java.io.File;


public class Personaje {
    @SerializedName("datosHeroe")
    private DatosHeroe pDatosHeroe;
    @SerializedName("datosPersonales")
    private DatosPersonales pDatosPersonales;
    @SerializedName("franquicia")
    private String pFranquicia;
    @SerializedName("fotografia")
    private Imagen pFotografia; 
    
    public static final File RUTA = new File("baseDatos/Personajes.json");
    
    public Personaje(DatosHeroe datosHeroe, DatosPersonales datosPersonales, String franquicia, Imagen fotografia) {
        this.pDatosHeroe = datosHeroe;
        this.pFranquicia = franquicia;
        this.pDatosPersonales = datosPersonales;
        this.pFotografia = fotografia;
    }

    public DatosHeroe getpDatosHeroe() {
        return pDatosHeroe;
    }

    public void setpDatosHeroe(DatosHeroe pDatosHeroe) {
        this.pDatosHeroe = pDatosHeroe;
    }

    public DatosPersonales getpDatosPersonales() {
        return pDatosPersonales;
    }

    public void setpDatosPersonales(DatosPersonales pDatosPersonales) {
        this.pDatosPersonales = pDatosPersonales;
    }

    public String getpFranquicia() {
        return pFranquicia;
    }

    public void setpFranquicia(String pFranquicia) {
        this.pFranquicia = pFranquicia;
    }

    public Imagen getpFotografia() {
        return pFotografia;
    }

    public void setpFotografia(Imagen pFotografia) {
        this.pFotografia = pFotografia;
    }
    




    
}