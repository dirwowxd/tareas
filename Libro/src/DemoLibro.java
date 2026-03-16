public class DemoLibro {
    public static void main(String[] args) {
        libro mish= new libro("Los 7 pajeros elementales", "Pedro Sanchez", true, 22, 2, 2026);
        libro mish2= new libro("Los mishes encerrados en waska marina", "Martin Valenzuela", false, 10, 10, 2025);

        System.out.println("El libro "+mish.getTitulo()+"");
    }
}
