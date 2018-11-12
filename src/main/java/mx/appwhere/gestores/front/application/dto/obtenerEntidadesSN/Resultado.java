package mx.appwhere.gestores.front.application.dto.obtenerEntidadesSN;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)

public class Resultado {

    @JsonProperty("fila")
    private FilaSn[] fila;

    public FilaSn[] getFila ()
    {
        return fila;
    }

    public void setFila (FilaSn[] fila)
    {
        this.fila = fila;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [fila = "+fila+"]";
    }
}
