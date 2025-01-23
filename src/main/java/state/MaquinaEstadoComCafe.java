package state;

public class MaquinaEstadoComCafe extends MaquinaEstado{

    private static final MaquinaEstadoComCafe instance = new MaquinaEstadoComCafe();

    @Override
    public String getEstado() {
        return "Com Café";
    }

    public static MaquinaEstadoComCafe getInstance() {
        return instance;
    }

    @Override
    public boolean comCreditos(Maquina maquina) {
        maquina.setEstado(MaquinaEstadoComCreditos.getInstance());
        return true;
    }
}
