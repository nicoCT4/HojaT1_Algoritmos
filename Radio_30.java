public interface Radio_30 {

    public static final int AM = 0;
    public static final int FM = 1;

    void setEncendido(boolean encendido);
    void setVolumen(int volumen);
    void setEstacionBanda(float emisora, int banda);
    boolean getEncendido();
    float getEstacion();
    int getBanda();
    int getVolumen();
    void guardarEstacion(float emisora, int[] banda, int idx);
    float recuperarEstacion(int idx);
}
