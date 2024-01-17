/**
 * Interface Radio_30
 * Javier Benítez - 23405
 * Nicolás Concuá - 23197
 * Fernando Hernández - 23645
 * Fernando Rueda - 23748
 * Esta interfaz define las operaciones necesarias para el manejo de una radio
 * La interfaz incluye métodos para controlar el estado de encendido, el volumen, la estación y la banda (AM o FM), también para guardar y recuperar estaciones.
 * Fecha de creación: [14/01/2024]
 * Fecha de última modificación: [14/01/2024]
 */
public interface Radio_30 {

    /**Constante para la banda AM. */
    public static final int AM = 0;

    /**Constante para la banda FM. */
    public static final int FM = 1;

    /**
     * Establece el estado de encendido de la radio.
     * 
     * @param encendido Estado de encendido de la radio, donde true indica que está encendida.
     */
    void setEncendido(boolean encendido);

    /**
     * Establece el volumen de la radio.
     * 
     * @param volumen El nivel de volumen deseado.
     */
    void setVolumen(int volumen);

    /**
     * Establece la estación y la banda de la radio.
     * 
     * @param emisora La frecuencia de la estación a sintonizar.
     * @param banda La banda en la que se encuentra la estación, puede ser AM o FM.
     */
    void setEstacionBanda(float emisora, int banda);

    /**
     * Devuelve el estado de encendido de la radio.
     * 
     * @return true si la radio está encendida, false en caso contrario.
     */
    boolean getEncendido();

    /**
     * Devuelve la estación actual de la radio.
     * 
     * @return La frecuencia de la estación actual.
     */
    float getEstacion();

    /**
     * Devuelve la banda actual de la radio
     * 
     * @return El valor que representa la banda actual, AM o FM
     */
    int getBanda();

    /**
     * Devuelve el nivel actual de volumen de la radio.
     * 
     * @return El nivel de volumen actual.
     */
    int getVolumen();

    /**
     * Guarda la estación actual en una de las posiciones de memoria.
     * 
     * @param emisora La frecuencia de la estación a guardar.
     * @param banda El arreglo de bandas.
     * @param idx El índice en el cual guardar la estación.
     */
    void guardarEstacion(float emisora, int[] banda, int idx);

    /**
     * Recupera una estación guardada en una posición de memoria específica.
     * 
     * @param idx El índice de la estación a recuperar.
     * @return La frecuencia de la estación guardada en el índice especificado.
     */
    float recuperarEstacion(int idx);
}
