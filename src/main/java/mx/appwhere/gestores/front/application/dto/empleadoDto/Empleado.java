package mx.appwhere.gestores.front.application.dto.empleadoDto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Empleado {

    @JsonProperty("nombre")
    private String nombre;

    @JsonProperty("sucursal")
    private String sucursal;

    @JsonProperty("numeroCelular")
    private String numeroCelular;

    @JsonProperty("entidad")
    private String entidad;

    @JsonProperty("apellidoMaterno")
    private String apellidoMaterno;

    @JsonProperty("apellidoPaterno")
    private String apellidoPaterno;

    @JsonProperty("foto")
    private String foto;

    @JsonProperty("expediente")
    private String expediente;

    @JsonProperty("fechaNacimiento")
    private String fechaNacimiento;

    @JsonProperty("activo")
    private String activo;

    public Empleado create(String nombre, String sucursal, String numeroCelular, String entidad, String apellidoMaterno, String apellidoPaterno, String foto, String expediente, String fechaNacimiento, String activo) {
        this.nombre = nombre;
        this.sucursal = sucursal;
        this.numeroCelular = numeroCelular;
        this.entidad = entidad;
        this.apellidoMaterno = apellidoMaterno;
        this.apellidoPaterno = apellidoPaterno;
        this.foto = foto;
        this.expediente = expediente;
        this.fechaNacimiento = fechaNacimiento;
        this.activo = activo;
        return this;
    }

    public String getNombre ()
    {
        return nombre;
    }

    public void setNombre (String nombre)
    {
        this.nombre = nombre;
    }

    public String getSucursal ()
    {
        return sucursal;
    }

    public void setSucursal (String sucursal)
    {
        this.sucursal = sucursal;
    }

    public String getNumeroCelular ()
    {
        return numeroCelular;
    }

    public void setNumeroCelular (String numeroCelular)
    {
        this.numeroCelular = numeroCelular;
    }

    public String getEntidad ()
    {
        return entidad;
    }

    public void setEntidad (String entidad)
    {
        this.entidad = entidad;
    }

    public String getApellidoMaterno ()
    {
        return apellidoMaterno;
    }

    public void setApellidoMaterno (String apellidoMaterno)
    {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getApellidoPaterno ()
    {
        return apellidoPaterno;
    }

    public void setApellidoPaterno (String apellidoPaterno)
    {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getFoto ()
    {
        return foto;
    }

    public void setFoto (String foto)
    {
        this.foto = foto;
    }

    public String getExpediente ()
    {
        return expediente;
    }

    public void setExpediente (String expediente)
    {
        this.expediente = expediente;
    }

    public String getFechaNacimiento ()
    {
        return fechaNacimiento;
    }

    public void setFechaNacimiento (String fechaNacimiento)
    {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getActivo ()
    {
        return activo;
    }

    public void setActivo (String activo)
    {
        this.activo = activo;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [nombre = "+nombre+", sucursal = "+sucursal+", numeroCelular = "+numeroCelular+", entidad = "+entidad+", apellidoMaterno = "+apellidoMaterno+", apellidoPaterno = "+apellidoPaterno+", foto = "+foto+", expediente = "+expediente+", fechaNacimiento = "+fechaNacimiento+", activo = "+activo+"]";
    }

}
