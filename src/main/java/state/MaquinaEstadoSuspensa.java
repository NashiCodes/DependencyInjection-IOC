package state;

public class MaquinaEstadoSuspensa extends MaquinaEstado {

    private static final MaquinaEstadoSuspensa instance = new MaquinaEstadoSuspensa();

    private MaquinaEstadoSuspensa() {
    }

    public static MaquinaEstadoSuspensa getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Suspensa";
    }

    public boolean ligar(Maquina maquina) {
        maquina.setEstado(MaquinaEstadoLigada.getInstance());
        return true;
    }

    public boolean desligar(Maquina maquina) {
        maquina.setEstado(MaquinaEstadoDesligada.getInstance());
        return true;
    }
}
