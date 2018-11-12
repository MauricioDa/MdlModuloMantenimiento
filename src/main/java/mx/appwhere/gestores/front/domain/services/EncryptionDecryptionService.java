package mx.appwhere.gestores.front.domain.services;

import mx.appwhere.gestores.front.application.dtoBackend.encryptionDecryption.EncryptionDecryptionResponseDto;

public interface EncryptionDecryptionService {

    EncryptionDecryptionResponseDto encrypt(String textToEncrypt);
    EncryptionDecryptionResponseDto decrypt(String textToDecrypt);

}
