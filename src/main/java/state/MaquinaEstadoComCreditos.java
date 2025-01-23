package state;

public class MaquinaEstadoComCreditos extends MaquinaEstado {

    private static final MaquinaEstadoComCreditos instance = new MaquinaEstadoComCreditos();

    private MaquinaEstadoComCreditos() {
    }

    public static MaquinaEstadoComCreditos getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Com Créditos";
    }

    public boolean despejarCafe(Maquina maquina) {
        maquina.setEstado(MaquinaEstadoLigada.getInstance());
        return true;
    }

    public boolean comCreditos(Maquina maquina) {
        return true;
    }
}
