package mx.appwhere.gestores.front.application.dto.uanl.list;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.experimental.PackagePrivate;

/**
 * @author Ivan Solorio Garcia
 * version 1.0 2018/10/12
 */
@Data
@PackagePrivate
@JsonIgnoreProperties(ignoreUnknown = true)
public class ListResponse {
    String nombre;
    String idExt;
}
