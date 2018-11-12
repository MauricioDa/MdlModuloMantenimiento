package mx.appwhere.gestores.front.application.dto.insertUserDto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SetEmpleadoResponse {

    @JsonProperty("SEmpleado")
    private SEmpleado SEmpleado;

    public SEmpleado getSEmpleado ()
    {
        return SEmpleado;
    }

    public void setSEmpleado (SEmpleado SEmpleado)
    {
        this.SEmpleado = SEmpleado;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [SEmpleado = "+SEmpleado+"]";
    }
}
