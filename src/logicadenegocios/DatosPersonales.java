package logicadenegocios;

import com.google.gson.annotations.SerializedName;

public class DatosPersonales {
    @SerializedName("nombreCompleto")
    private String mNombreCompleto;
    @SerializedName("fechaNacimiento")
    private String pFechaNacimiento;
    @SerializedName("Ciudad")
    private Ciudad pCiudad;

    public DatosPersonales(String nombreCompleto, String fechaNacimiento, Ciudad ciudad) {
        this.mNombreCompleto = nombreCompleto;
        this.pFechaNacimiento = fechaNacimiento;
        this.pCiudad = ciudad;
    }

    public String getmNombreCompleto() {
        return mNombreCompleto;
    }

    public void setmNombreCompleto(String mNombreCompleto) {
        this.mNombreCompleto = mNombreCompleto;
    }

    public String getpFechaNacimiento() {
        return pFechaNacimiento;
    }

    public void setpFechaNacimiento(String pFechaNacimiento) {
        this.pFechaNacimiento = pFechaNacimiento;
    }

    public Ciudad getpCiudad() {
        return pCiudad;
    }

    public void setpCiudad(Ciudad pCiudad) {
        this.pCiudad = pCiudad;
    }


}