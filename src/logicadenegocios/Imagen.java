
package logicadenegocios;

import java.io.Serializable;

/**
 *
 * @author emifu
 */
public class Imagen implements Serializable{
    String ruta;

    public Imagen(String ruta) {
        this.ruta = ruta;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }
    
}
