public class nombre {
    //atributos
    private String primernombre;
    private String apellidoPaterno;
    private String apellidoMaterno;

    //constructor

    nombre(String primernombre, String apellidoPaterno, String apellidoMaterno) {
        this.primernombre = primernombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;

    }
    public String getPrimernombre() {
        return primernombre;
    }
    public String getApellidoPaterno() {
        return apellidoPaterno;
    }
    public String getApellidoMaterno() {
        return apellidoMaterno;
    }
    public char[] getIniciales (){
        char[] iniciales = new char[3];
        iniciales[0]=primernombre.charAt(0);
        iniciales[1]=apellidoPaterno.charAt(0);
        iniciales[2]=apellidoMaterno.charAt(0);
        return iniciales;
    }
    public String getNombreCompleto(){
        return primernombre+" "+apellidoPaterno+" "+apellidoMaterno;
    }
}
