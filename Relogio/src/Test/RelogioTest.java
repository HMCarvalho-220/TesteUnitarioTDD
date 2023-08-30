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
    }