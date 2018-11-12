package mx.appwhere.gestores.front.application.dto.obtenerEntidades;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Resultado {

    @JsonProperty("fila")
    private Fila[] fila;

    public Fila[] getFila ()
    {
        return fila;
    }

    public void setFila (Fila[] fila)
    {
        this.fila = fila;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [fila = "+fila+"]";
    }
}
