package mx.appwhere.gestores.front.application.dto.uanl;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.experimental.PackagePrivate;

/**
 * @author Ivan Solorio Garcia
 * version 1.0 2018/10/03
 */
@Data
@PackagePrivate
@JsonIgnoreProperties(ignoreUnknown = true)
public class Result {
    @JsonProperty("Resultado")
    Row result;
}
