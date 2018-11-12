package mx.appwhere.gestores.front.application.dto.empleadoDto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GetEmpleadoResponse {

    @JsonProperty("Empleado")
    private Empleado Empleado;

    public Empleado getEmpleado ()
    {
        return Empleado;
    }

    public void setEmpleado (Empleado Empleado)
    {
        this.Empleado = Empleado;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [Empleado = "+Empleado+"]";
    }
}
