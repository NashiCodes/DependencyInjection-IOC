import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import state.*;

import static org.junit.jupiter.api.Assertions.*;

public class MaquinaComCafeTest {
    Maquina maquina;

    @BeforeEach
    public void setup() {
        maquina = new Maquina();
        maquina.ligar();
        maquina.colocarCafe();
    }

    @Test
    public void testMaquinaComCafe() {
        assertEquals(MaquinaEstadoComCafe.getInstance(), maquina.getEstado());
    }

    @Test
    public void testDesligar() {
        assertFalse(maquina.desligar());
        assertEquals(MaquinaEstadoComCafe.getInstance(), maquina.getEstado());
    }

    @Test
    public void testSuspender() {
        assertFalse(maquina.suspender());
        assertEquals(MaquinaEstadoComCafe.getInstance(), maquina.getEstado());
    }

    @Test
    public void testInserirCreditos() {
        assertTrue(maquina.inserirCreditos());
        assertEquals(MaquinaEstadoComCreditos.getInstance(), maquina.getEstado());
    }

    @Test
    public void testDespejarCafe() {
        assertFalse(maquina.despejarCafe());
        assertEquals(MaquinaEstadoComCafe.getInstance(), maquina.getEstado());
    }
}
