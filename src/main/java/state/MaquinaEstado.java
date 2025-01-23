package state;

public abstract class MaquinaEstado {

    public abstract String getEstado();

    public boolean ligar(Maquina maquina) {
        return false;
    }

    public boolean desligar(Maquina maquina) {
        return false;
    }

    public boolean suspender(Maquina maquina) {
        return false;
    }

    public boolean colocarCafe(Maquina maquina) {
        return false;
    }

    public boolean comCreditos(Maquina maquina) {
        return false;
    }

    public boolean despejarCafe(Maquina maquina) {
        return false;
    }

}
