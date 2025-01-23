import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import state.Maquina;
import state.MaquinaEstadoDesligada;
import state.MaquinaEstadoLigada;

import static org.junit.jupiter.api.Assertions.*;


public class MaquinaDesligadaTest {
    Maquina maquina;

    @BeforeEach
    public void setup() {
        maquina = new Maquina();
    }

    @Test
    public void testMaquinaDesligada() {
        assertEquals(MaquinaEstadoDesligada.getInstance(), maquina.getEstado());
    }

    @Test
    public void testLigar() {
        assertTrue(maquina.ligar());
        assertEquals(MaquinaEstadoLigada.getInstance(), maquina.getEstado());
    }

    @Test
    public void testInserirCreditosMaquinaDesligada() {
        assertFalse(maquina.inserirCreditos());
        assertEquals(MaquinaEstadoDesligada.getInstance(), maquina.getEstado());
    }

    @Test
    public void testDespejarCafeMaquinaDesligada() {
        assertFalse(maquina.despejarCafe());
        assertEquals(MaquinaEstadoDesligada.getInstance(), maquina.getEstado());
    }

    @Test
    public void testSuspenderMaquinaDesligada() {
        assertFalse(maquina.suspender());
        assertEquals(MaquinaEstadoDesligada.getInstance(), maquina.getEstado());
    }

}
