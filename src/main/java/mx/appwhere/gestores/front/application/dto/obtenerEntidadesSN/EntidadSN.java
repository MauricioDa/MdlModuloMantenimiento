package mx.appwhere.gestores.front.application.dto.obtenerEntidadesSN;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.stereotype.Component;

@JsonIgnoreProperties(ignoreUnknown = true)
@Component
public class EntidadSN {

    @JsonProperty("Resultado")
    private Resultado Resultado;

    public Resultado getResultado ()
    {
        return Resultado;
    }

    public void setResultado (Resultado Resultado)
    {
        this.Resultado = Resultado;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [Resultado = "+Resultado+"]";
    }
}
