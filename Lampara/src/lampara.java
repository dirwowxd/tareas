public class lampara {
    private String marca;
    private int potencia;
    private boolean encendida;

    //constructor

    public lampara(String marca, int potencia) {
        this.marca = marca;
        this.potencia = potencia;
        this.encendida = false; //aunque no este como parametro en el constructor lo añadi porque estaba como requisito en el ejercicio de que debe estar apagado al principio
    }
    public String getMarca() { // obtiene el nombre de la marca
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }//cambia el nombre de la marca con un setter
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
