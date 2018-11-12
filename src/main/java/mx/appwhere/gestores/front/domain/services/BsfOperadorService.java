package mx.appwhere.gestores.front.domain.services;

import mx.appwhere.gestores.front.application.dtoBackend.bsfOperador.BsfOperadorDto;

public interface BsfOperadorService {

    BsfOperadorDto decryptBsfOperador(String bsfOperadorEncrypted);

    String encryptBsfOperador(BsfOperadorDto bsfOperadorDto);

}
