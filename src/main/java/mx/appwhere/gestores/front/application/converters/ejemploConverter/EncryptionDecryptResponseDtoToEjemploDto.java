package mx.appwhere.gestores.front.application.converters.ejemploConverter;

import mx.appwhere.gestores.front.application.dto.ejemplo.EjemploDto;
import mx.appwhere.gestores.front.application.converters.AbstractConverter;
import mx.appwhere.gestores.front.application.dtoBackend.encryptionDecryption.EncryptionDecryptionResponseDto;
import org.springframework.stereotype.Component;

/**
 * @author Jose Angel Hernandez
 * @version 1.0 - 2018/02/20
 */
@Component
public class EncryptionDecryptResponseDtoToEjemploDto extends AbstractConverter<EncryptionDecryptionResponseDto, EjemploDto> {
    @Override
    public EjemploDto convert(EncryptionDecryptionResponseDto source) {
        EjemploDto ejemploDto= new EjemploDto();
        ejemploDto.setNumeroCodigo(source.getCodRet());
        ejemploDto.setResponse(source.getRespuesta());
        return ejemploDto;

    }
}
