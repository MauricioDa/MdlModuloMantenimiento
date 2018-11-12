package mx.appwhere.gestores.front.application.dto.SubirLogoDto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.stereotype.Component;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@Component
public class Editar {

    @JsonProperty("Resultado")
    private Insertar instertar;

    public Insertar getInstertar() {
        return instertar;
    }

    public void setInstertar(Insertar instertar) {
        this.instertar = instertar;
    }
}
