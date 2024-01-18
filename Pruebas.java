import static org.junit.Assert.*;
import org.junit.Test;

public class Pruebas {

    @Test
    public void testCambiarFrecuencia() {
        Radio radio = new Radio("Sony");
        radio.setEncendido(true);
        radio.cambiarFrecuencia();
        assertEquals(Radio_30.FM, radio.getBanda());
        radio.cambiarFrecuencia();
        assertEquals(Radio_30.AM, radio.getBanda());
    }
    @Test
    public void testAvanzarDial() {
        Radio radio = new Radio("Sony");
        radio.setEncendido(true);
        radio.setBanda(Radio_30.FM);
        radio.setEstacion(90.5f);
        radio.avanzarDial();
        assertEquals(90.7f, radio.getEstacion(), 0.01);
        radio.setBanda(Radio_30.AM);
        radio.setEstacion(1000);
        radio.avanzarDial();
        assertEquals(540, radio.getEstacion(), 0.01);
    }

    @Test
    public void testGuardarYRecuperarEstacion() {
        Radio radio = new Radio("Sony");
        radio.setEncendido(true);
        radio.setEstacionBanda(95.0f, Radio_30.FM);
        
        radio.guardarEstacion(radio.getEstacion(), new int[]{Radio_30.FM}, 0);
        
        radio.setEstacionBanda(102.5f, Radio_30.FM);
        
        float estacionRecuperada = radio.recuperarEstacion(0);
        
        assertEquals(95.0f, estacionRecuperada, 0.01);
    }
}