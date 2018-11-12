package mx.appwhere.gestores.front.application.dto.altaUsuarioDto;

import lombok.Data;

@Data
public class GetUser {

    private String entidad;
    private String expediente;
    private String activo;

    public String getEntidad() {
        return entidad;
    }

    public void setEntidad(String entidad) {
        this.entidad = entidad;
    }

    public String getExpediente() {
        return expediente;
    }

    public void setExpediente(String expediente) {
        this.expediente = expediente;
    }

    public String getActivo() {
        return activo;
    }

    public void setActivo(String activo) {
        this.activo = activo;
    }
}
