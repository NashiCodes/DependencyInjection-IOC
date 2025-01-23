import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import state.*;

import static org.junit.jupiter.api.Assertions.*;

public class MaquinaLigadaTest {
    Maquina maquina;

    @BeforeEach
    public void setup() {
        maquina = new Maquina();
        maquina.ligar();
    }

    @Test
    public void testMaquinaLigada() {
        assertEquals(MaquinaEstadoLigada.getInstance(), maquina.getEstado());
    }

    @Test
    public void testDesligar() {
        assertTrue(maquina.desligar());
        assertEquals(MaquinaEstadoDesligada.getInstance(), maquina.getEstado());
    }

    @Test
    public void testSuspender() {
        assertTrue(maquina.suspender());
        assertEquals("Suspensa", maquina.getEstado().getEstado());
    }

    @Test
    public void testInserirCreditos() {
        assertFalse(maquina.inserirCreditos());
        assertEquals(MaquinaEstadoLigada.getInstance(), maquina.getEstado());
    }

    @Test
    public void testSemCreditos(){
        assertFalse(maquina.despejarCafe());
        assertEquals(MaquinaEstadoLigada.getInstance(), maquina.getEstado());
    }

    @Test
    public void testColocarCafe(){
        assertTrue(maquina.colocarCafe());
        assertEquals(MaquinaEstadoComCafe.getInstance(), maquina.getEstado());
    }
}
