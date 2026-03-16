import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class libro {
    private String titulo;
    private String autor;
    private LocalDate fechaPublicacion;
    private boolean prestado;

    //constructor

    public libro(String titulo, String autor, boolean prestado, int dia, int mes, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.prestado = prestado;
        this.fechaPublicacion = LocalDate.now();

    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;

    }
    public LocalDate getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(LocalDate fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }
    public boolean isPrestado() {
        return prestado;
    }
    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }
    public int getAntiguedadAnios(){
        return Period.between(this.fechaPublicacion, LocalDate.now()).getYears();
    }
    public String getFechaFormateada(){
        return DateTimeFormatter.ofPattern("dd/MM/yyyy").format(this.fechaPublicacion);
    }
    public String toString(){
        String isPrestado = this.prestado ? "Prestado" : "Disponible";
        return "Libro: "+ getTitulo()+ "| Antiguedad: "+ getAntiguedadAnios() +" años | Estado: "+ isPrestado;
    }
}
