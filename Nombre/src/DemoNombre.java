import java.util.Arrays;

public class DemoNombre {
    public static void main(String[] args) {
    nombre mish = new nombre("Vicente", "Sepulveda","Jaque");
        System.out.println("El primer nombre es: "+mish.getPrimernombre());
        System.out.println("El apellido Paterno es: "+mish.getApellidoPaterno());
        System.out.println("El apellido Materno es: "+mish.getApellidoMaterno());
        System.out.println("El nombre completo es: "+mish.getNombreCompleto());
        System.out.println("Las iniciales de este nombre son: "+ Arrays.toString(mish.getIniciales()));
    }
}
