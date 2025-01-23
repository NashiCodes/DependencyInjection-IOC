import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import state.*;

import static org.junit.jupiter.api.Assertions.*;

public class MaquinaSuspensaTest {
    Maquina maquina;

    @BeforeEach
    public void setup() {
        maquina = new Maquina();
    }

    @Test
    public void testSuspenderMaquinaDesligada() {
        assertFalse(maquina.suspender());
        assertEquals(MaquinaEstadoDesligada.getInstance(), maquina.getEstado());
    }

    @Test
    public void testSuspenderMaquinaLigada() {
        maquina.ligar();
        assertTrue(maquina.suspender());
        assertEquals(MaquinaEstadoSuspensa.getInstance(), maquina.getEstado());
    }

    @Test
    public void testSuspenderMaquinaComCreditos() {
        maquina.ligar();
        maquina.inserirCreditos();
        assertFalse(maquina.suspender());
        assertEquals(MaquinaEstadoComCreditos.getInstance(), maquina.getEstado());
    }

    @Test
    public void testSuspenderMaquinaSuspensa() {
        maquina.ligar();
        maquina.suspender();
        assertFalse(maquina.suspender());
        assertEquals(MaquinaEstadoSuspensa.getInstance(), maquina.getEstado());
    }

    @Test
    public void testDesligarMaquinaSuspensa() {
        maquina.ligar();
        maquina.suspender();
        assertTrue(maquina.desligar());
        assertEquals(MaquinaEstadoDesligada.getInstance(), maquina.getEstado());
    }

    @Test
    public void testInserirCreditosMaquinaSuspensa() {
        maquina.ligar();
        maquina.suspender();
        assertFalse(maquina.inserirCreditos());
        assertEquals(MaquinaEstadoSuspensa.getInstance(), maquina.getEstado());
    }

    @Test
    public void testDespejarCafeMaquinaSuspensa() {
        maquina.ligar();
        maquina.suspender();
        assertFalse(maquina.despejarCafe());
        assertEquals(MaquinaEstadoSuspensa.getInstance(), maquina.getEstado());
    }

    @Test
    public void testLigarMaquinaSuspensa() {
        maquina.ligar();
        maquina.suspender();
        assertTrue(maquina.ligar());
        assertEquals(MaquinaEstadoLigada.getInstance(), maquina.getEstado());
    }
}
