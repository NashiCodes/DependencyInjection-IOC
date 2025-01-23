import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import state.*;

import static org.junit.jupiter.api.Assertions.*;

public class MaquinaComCreditosTest {
    Maquina maquina;

    @BeforeEach
    public void setup() {
        maquina = new Maquina();
        maquina.ligar();
        maquina.colocarCafe();
        maquina.inserirCreditos();
    }

    @Test
    public void testMaquinaComCreditos() {
        assertEquals(MaquinaEstadoComCreditos.getInstance(), maquina.getEstado());
    }

    @Test
    public void testDesligar() {
        assertFalse(maquina.desligar());
        assertEquals(MaquinaEstadoComCreditos.getInstance(), maquina.getEstado());
    }

    @Test
    public void testSuspender() {
        assertFalse(maquina.suspender());
        assertEquals(MaquinaEstadoComCreditos.getInstance(), maquina.getEstado());
    }

    @Test
    public void testInserirCreditos() {
        assertTrue(maquina.inserirCreditos());
        assertEquals(MaquinaEstadoComCreditos.getInstance(), maquina.getEstado());
    }

    @Test
    public void testDespejarCafe() {
        assertTrue(maquina.despejarCafe());
        assertEquals(MaquinaEstadoLigada.getInstance(), maquina.getEstado());
    }

    @Test
    public void testColocarCafe() {
        assertFalse(maquina.colocarCafe());
        assertEquals(MaquinaEstadoComCreditos.getInstance(), maquina.getEstado());
    }
}
