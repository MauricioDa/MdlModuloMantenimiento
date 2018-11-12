package mx.appwhere.gestores.front.application.dto.ejemplo;

import mx.appwhere.gestores.front.application.dto.Dto;

public class EjemploDto implements Dto {

    private String response;
    private String numeroCodigo;

    public EjemploDto() {
    }

    public EjemploDto(String response, String numeroCodigo) {
        this.response = response;
        this.numeroCodigo = numeroCodigo;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public String getNumeroCodigo() {
        return numeroCodigo;
    }

    public void setNumeroCodigo(String numeroCodigo) {
        this.numeroCodigo = numeroCodigo;
    }
}
