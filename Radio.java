/**
 * Clase Radio
 * Javier Benítez - 23405
 * Nicolás Concuá - 23197
 * Fernando Hernández - 23645
 * Fernando Rueda - 23748
 * Esta clase implementa la interfaz Radio_30 y proporciona una implementación para las funcionalidades de una radio.
 * Fecha de creación: [14/01/2024]
 * Fecha de última modificación: [15/01/2024]
 */
public class Radio implements Radio_30 {
    private boolean encendido;
    private String marca;
    private int banda;
    private float estacion;
    private int volumen;
    private boolean apagado;

    // Arreglo para guardar las estaciones
    private float[] estacionesGuardadas = new float[12];

    public float obtenerEstacionActual() {
        return estacion;
    }
    
    /**
     * Constructor para crear una nueva radio con la marca.
     * 
     * @param marca La marca del radio.
     */
    public Radio(String marca) {
        this.marca = marca;
    }

    /**
     * Cambia la frecuencia de la radi entre AM y FM.
     */
    public void cambiarFrecuencia() {
        if (banda == AM) {
            banda = FM;
            System.out.println("Frecuencia cambiada a FM");
        } else {
            banda = AM;
            System.out.println("Frecuencia cambiada a AM");
        }
    }

    /**
     * Avanza el dial de la radio al siguiente valor, dependiendo si está en FM o AM.
     */
    public void avanzarDial() {
        if (banda == FM) {
            estacion += 0.2;
            if (estacion > 107.9) {
                estacion = 87.9f;
            }
        } else {
            estacion += 10;
            if (estacion > 1610) {
                estacion = 530;
            }
        }
        System.out.println("Dial avanzado a " + estacion);
    }

    // Métodos sobreescritos de la interfaz Radio_30.
    @Override
    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

    @Override
    public boolean getEncendido() {
        return encendido;
    }

    @Override
    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    @Override
    public int getVolumen() {
        return volumen;
    }

    @Override
    public void setEstacionBanda(float emisora, int banda) {
        this.estacion = emisora;
        this.banda = banda;
    }

    @Override
    public float getEstacion() {
        return estacion;
    }

    @Override
    public int getBanda() {
        return banda;
    }

    @Override
    public void guardarEstacion(float emisora, int[] banda, int idx) {
        // Verifica que el índice esté en el rango válido
        if (idx >= 0 && idx < 12) {
            // Guarda la estación actual en el botón especificado
            estacionesGuardadas[idx] = emisora;
            System.out.println("Estación actual guardada en el botón " + (idx + 1));
        } else {
            System.out.println("Índice no válido. Debe estar entre 0 y 11.");
        }
    }
    

    @Override
    public float recuperarEstacion(int idx) {
        // Verifica que el índice esté en el rango válido
        if (idx >= 0 && idx < 12) {
            // Recupera la estación guardada en el botón especificado
            float estacionRecuperada = estacionesGuardadas[idx];
            System.out.println("Estación recuperada del botón " + (idx + 1));
            return estacionRecuperada;
        } else {
            System.out.println("Índice no válido. Debe estar entre 0 y 11.");
            return 0.0f;
        }
    }

    /**
     * Establece la marca de la radio.
     * 
     * @param marca La nueva marca de la radio.
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * Obtiene la marca de la radio.
     * 
     * @return La marca de la radio.
     */
    public String getMarca() {
        return marca;
    }

    public void setBanda(int banda) {
        this.banda = banda;
    }

    public void setEstacion(float estacion) {
        this.estacion = estacion;
    }

    public void setApagado(boolean apagado) {
        this.apagado = apagado;
    }

    /**
     * Obtiene el estado actual de la radio.
     * 
     * @return true si la radio está apagada, false en caso contrario.
     */
    public boolean getApagado() {
        return apagado;
    }
}
