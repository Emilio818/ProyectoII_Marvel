
package logicadenegocios;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/**
 *
 * @author emifu
 */
public class DatosHeroe implements Serializable{
    @SerializedName("pseudonimo")
    private String pPseudonimo;
    @SerializedName("tipoDeClase")
    private TipoDeClase pTipoDeClase;
    @SerializedName("tipoDePersonaje")
    private TipoDePersonaje pTipoDePersonaje;
    @SerializedName("poder")
    private Poder pPoder;

    public DatosHeroe(String pseudonimo, TipoDeClase tipoDeClase, TipoDePersonaje tipoDePersonaje, Poder poder) {
        this.pPseudonimo = pseudonimo;
        this.pTipoDeClase = tipoDeClase;
        this.pTipoDePersonaje = tipoDePersonaje;
        this.pPoder = poder;
    }

    public String getmPseudonimo() {
        return pPseudonimo;
    }

    public void setmPseudonimo(String mPseudonimo) {
        this.pPseudonimo = mPseudonimo;
    }

    public TipoDeClase getpTipoDeClase() {
        return pTipoDeClase;
    }

    public void setpTipoDeClase(TipoDeClase pTipoDeClase) {
        this.pTipoDeClase = pTipoDeClase;
    }

    public TipoDePersonaje getpTipoDePersonaje() {
        return pTipoDePersonaje;
    }

    public void setpTipoDePersonaje(TipoDePersonaje pTipoDePersonaje) {
        this.pTipoDePersonaje = pTipoDePersonaje;
    }

    public Poder getpPoder() {
        return pPoder;
    }

    public void setpPoder(Poder pPoder) {
        this.pPoder = pPoder;
    }

    
    
    
}
