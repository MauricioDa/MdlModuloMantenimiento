package mx.appwhere.gestores.front.application.dto.obtenerEntidades;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Fila {

    @JsonProperty("TsRegistro")
    private String TsRegistro;
    @JsonProperty("id")
    private String id;
    @JsonProperty("codigo")
    private String codigo;
    @JsonProperty("nombre")
    private String nombre;
    @JsonProperty("logo")
    private String logo;

    public String getTsRegistro ()
    {
        return TsRegistro;
    }

    public void setTsRegistro (String TsRegistro)
    {
        this.TsRegistro = TsRegistro;
    }

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getCodigo ()
    {
        return codigo;
    }

    public void setCodigo (String codigo)
    {
        this.codigo = codigo;
    }

    public String getNombre ()
    {
        return nombre;
    }

    public void setNombre (String nombre)
    {
        this.nombre = nombre;
    }

    public String getLogo ()
    {
        return logo;
    }

    public void setLogo (String logo)
    {
        this.logo = logo;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [TsRegistro = "+TsRegistro+", id = "+id+", codigo = "+codigo+", nombre = "+nombre+", logo = "+logo+"]";
    }
}
