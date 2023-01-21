
package logicadenegocios;

import com.google.gson.annotations.SerializedName;

/**
 *
 * @author emifu
 */
public class Poder {
    @SerializedName("vida")
    private int pVida;
    @SerializedName("fuerza")
    private int pFuerza;
    @SerializedName("velocidad")
    private int pVelocidad;
    @SerializedName("inteligencia")
    private int pInteligencia;
    @SerializedName("recursosEconomicos")
    private int pRecursosEconomicos;

    public Poder(int vida, int fuerza, int velocidad, int inteligencia, int recursosEconomicos) {
        this.pVida = vida;
        this.pFuerza = fuerza;
        this.pVelocidad = velocidad;
        this.pInteligencia = inteligencia;
        this.pRecursosEconomicos = recursosEconomicos;
    }
    
    public int poderTotal(){
        int sumaTotal = this.pFuerza + this.pInteligencia + 
                this.pRecursosEconomicos + this.pVelocidad + this.pVida;
        int poderTotal = (sumaTotal * 100) / 500;
        return poderTotal;
    }
    public int getpVida() {
        return pVida;
    }

    public void setpVida(int pVida) {
        this.pVida = pVida;
    }

    public int getpFuerza() {
        return pFuerza;
    }

    public void setpFuerza(int pFuerza) {
        this.pFuerza = pFuerza;
    }

    public int getpVelocidad() {
        return pVelocidad;
    }

    public void setpVelocidad(int pVelocidad) {
        this.pVelocidad = pVelocidad;
    }

    public int getpInteligencia() {
        return pInteligencia;
    }

    public void setpInteligencia(int pInteligencia) {
        this.pInteligencia = pInteligencia;
    }

    public int getpRecursosEconomicos() {
        return pRecursosEconomicos;
    }

    public void setpRecursosEconomicos(int pRecursosEconomicos) {
        this.pRecursosEconomicos = pRecursosEconomicos;
    }
    
}
