package mx.appwhere.gestores.front.application.dtoBackend.bsfOperador;

public class BsfOperadorContainerDto {

    private BsfOperadorDto BSFOPERADOR;

    public BsfOperadorContainerDto() {
    }

    public BsfOperadorContainerDto(BsfOperadorDto BSFOPERADOR) {
        this.BSFOPERADOR = BSFOPERADOR;
    }

    public BsfOperadorDto getBSFOPERADOR() {
        return BSFOPERADOR;
    }

    public void setBSFOPERADOR(BsfOperadorDto BSFOPERADOR) {
        this.BSFOPERADOR = BSFOPERADOR;
    }
}
