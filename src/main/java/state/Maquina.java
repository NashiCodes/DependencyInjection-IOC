package state;

public class Maquina {

    private MaquinaEstado estado;

    public Maquina() {
        this.estado = MaquinaEstadoDesligada.getInstance();
    }

    public boolean ligar() {
        return estado.ligar(this);
    }

    public boolean desligar() {
        return estado.desligar(this);
    }

    public boolean suspender() {
        return estado.suspender(this);
    }

    public boolean inserirCreditos() {
        return estado.comCreditos(this);
    }

    public boolean despejarCafe() {
        return estado.despejarCafe(this);
    }

    public MaquinaEstado getEstado() {
        return estado;
    }

    public void setEstado(MaquinaEstado estado) {
        this.estado = estado;
    }
}
