package state;

public class MaquinaEstadoDesligada extends MaquinaEstado {

    private static final MaquinaEstadoDesligada instance = new MaquinaEstadoDesligada();

    private MaquinaEstadoDesligada() {
    }

    public static MaquinaEstadoDesligada getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Desligada";
    }

    public boolean ligar(Maquina maquina) {
        maquina.setEstado(MaquinaEstadoLigada.getInstance());
        return true;
    }
}
