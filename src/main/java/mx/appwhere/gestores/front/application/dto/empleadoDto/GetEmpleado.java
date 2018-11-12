package mx.appwhere.gestores.front.application.dto.empleadoDto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GetEmpleado {

    @JsonProperty("GetEmpleadoResponse")
    private GetEmpleadoResponse GetEmpleadoResponse;

    public GetEmpleadoResponse getGetEmpleadoResponse ()
    {
        return GetEmpleadoResponse;
    }

    public void setGetEmpleadoResponse (GetEmpleadoResponse GetEmpleadoResponse)
    {
        this.GetEmpleadoResponse = GetEmpleadoResponse;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [GetEmpleadoResponse = "+GetEmpleadoResponse+"]";

    }
}
