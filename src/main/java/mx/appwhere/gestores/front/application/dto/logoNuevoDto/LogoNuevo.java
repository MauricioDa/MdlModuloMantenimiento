package mx.appwhere.gestores.front.application.dto.logoNuevoDto;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class LogoNuevo {

    private String ENTIDAD;
    private String LOGO;



    public LogoNuevo create(String ENTIDAD, String LOGO) {
        this.ENTIDAD = ENTIDAD;
        this.LOGO = LOGO;
        return this;
    }

    public String getENTIDAD() {
        return ENTIDAD;
    }

    public void setENTIDAD(String ENTIDAD) {
        this.ENTIDAD = ENTIDAD;
    }

    public String getLOGO() {
        return LOGO;
    }

    public void setLOGO(String LOGO) {
        this.LOGO = LOGO;
    }
}
