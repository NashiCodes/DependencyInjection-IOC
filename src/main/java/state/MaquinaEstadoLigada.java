package state;

public class MaquinaEstadoLigada extends MaquinaEstado {

    private static final MaquinaEstadoLigada instance = new MaquinaEstadoLigada();

    private MaquinaEstadoLigada() {
    }

    public static MaquinaEstadoLigada getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Ligada";
    }

    public boolean desligar(Maquina maquina) {
        maquina.setEstado(MaquinaEstadoDesligada.getInstance());
        return true;
    }

    public boolean suspender(Maquina maquina) {
        maquina.setEstado(MaquinaEstadoSuspensa.getInstance());
        return true;
    }

    public boolean colocarCafe(Maquina maquina) {
        maquina.setEstado(MaquinaEstadoComCafe.getInstance());
        return true;
    }
}
