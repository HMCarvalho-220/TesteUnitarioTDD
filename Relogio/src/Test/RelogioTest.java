package Test;

import Main.Relogio;
import org.junit.Test;
import static org.junit.Assert.*;

public class RelogioTest {

    @Test
    public void testReiniciarMeiaNoite() {
        Relogio relogio = new Relogio(17, 30, 0);


        assertNotEquals("00:00:00", relogio.horaFormato24());

        relogio.reiniciarMeiaNoite();


        assertEquals("00:00:00", relogio.horaFormato24());
    }
    @Test
    public void testDefinirTempo(){
        Relogio relogio = new Relogio(10, 6, 0);
        assertNotEquals("14:07:20", relogio.horaFormato24());
        relogio.definirTempo(14, 7, 20);
        assertEquals("14:07:20", relogio.horaFormato24());
    }
    @Test
    public void testMarcarIntervalo(){
        Relogio relogio = new Relogio(17, 30, 0);
        assertNotEquals("03:13:10", relogio.marcarIntervalo(6, 2, 20, 5, 15, 30));
        assertEquals("03:13:10", relogio.marcarIntervalo(2, 2, 20, 5, 15, 30));


    }
}