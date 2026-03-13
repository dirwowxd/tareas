public class lampara {
    private String marca;
    private int potencia;
    private boolean encendida;

    //constructor

    public lampara(String marca, int potencia) {
        this.marca = marca;
        this.potencia = potencia;
        this.encendida = false;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public int getPotencia() {
        return potencia;
    }
    public boolean estaEncendida() {
        return encendida;
    }
    public void encender() {
        encendida = true;
    }
    public void apagar() {
        encendida = false;
    }
}
