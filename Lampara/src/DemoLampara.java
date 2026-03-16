
public class DemoLampara {
    public static void main(String[] args) {
    lampara mish= new lampara("toyota", 100);
    lampara mish2 = new lampara("motorola", 50);

        System.out.println("la lampara de la marca "+mish.getMarca()+" esta encendida? :"+ mish.estaEncendida());
        System.out.println("encendiendo....");
        //llame a mish.encender eso hace que el boolean cambie de false a true
        mish.encender();
        System.out.println("la lampara de la marca "+mish.getMarca()+" esta encendida? :"+ mish.estaEncendida());
        System.out.println("la potencia de la lampara es: "+mish.getPotencia()); //muestra la potencia de la lampara que se agrego al inicio del codigo
        System.out.println("apagando lampara...");
        mish.apagar(); //se apaga la lampara
        System.out.println("la lampara de la marca "+mish.getMarca()+" esta encendida? :"+ mish.estaEncendida()); //aqui muestra si esta apagada la lampara o encendida

        System.out.println("Cambiando marca de la lampara...");
        mish.setMarca("Samsung"); //ocupe setMarca para cambiar el nombre de la marca
        System.out.println("Marca nueva: "+mish.getMarca()); //revisa si se cambio el nombre de la marca
        System.out.println("-----------------------------------------------------");

        System.out.println("la lampara de la marca "+mish2.getMarca()+ " esta  encendida? :"+ mish2.estaEncendida());
        System.out.println("encendiendo....");
        mish2.encender();
        System.out.println("la lampara de la marca "+mish2.getMarca()+ " esta  encendida? :"+ mish2.estaEncendida());
        System.out.println("la potencia de la lampara es: "+mish.getPotencia());
        System.out.println("apagando lampara...");
        mish2.apagar();
        System.out.println("la lampara de la marca "+mish2.getMarca()+ " esta  encendida? :"+ mish2.estaEncendida());
        System.out.println("Cambiando marca de la lampara...");
        mish2.setMarca("xiaomi");
        System.out.println("marca nueva "+mish2.getMarca());
        System.out.println("hola");
    }
}
