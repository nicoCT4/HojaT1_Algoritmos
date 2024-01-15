public class Radio implements Radio_30 {
    private boolean encendido;
    private String marca;
    private int banda;
    private float estacion;
    private int volumen;
    private boolean apagado;

    public Radio(String args) {

    }
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

    }

    @Override
    public float recuperarEstacion(int idx) {
        return 0.0f;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setBanda(int banda) {
        this.banda = banda;
    }

    public void setEstacion(float estacion) {
        this.estacion = estacion;
    }

    public void setApagado(boolean  apagado) {
        this.apagado = apagado;
    }

    public boolean getApagado() {
        return apagado;
    }
}