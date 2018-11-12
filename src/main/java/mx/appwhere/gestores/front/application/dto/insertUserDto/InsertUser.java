package mx.appwhere.gestores.front.application.dto.insertUserDto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class InsertUser {

    @JsonProperty("SetEmpleadoResponse")
    private SetEmpleadoResponse SetEmpleadoResponse;

    public SetEmpleadoResponse getSetEmpleadoResponse ()
    {
        return SetEmpleadoResponse;
    }

    public void setSetEmpleadoResponse (SetEmpleadoResponse SetEmpleadoResponse)
    {
        this.SetEmpleadoResponse = SetEmpleadoResponse;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [SetEmpleadoResponse = "+SetEmpleadoResponse+"]";
    }
}
