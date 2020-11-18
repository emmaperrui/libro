
/**
 * Una clase que representa objetos libro.
 * Esta clase podria formar parte de un
 * proyecto mas grande, como el de una aplicacion de
 * una biblioteca
 * 
 * @author Miguel Bayon 
 * @version 1.0
 */
public class Libro {

    private String autor;
    private String titulo;
    private int numeroPaginas;

    /**
     * Fija el autor y el titulo del libro a los dados como parametro
     */
    public Libro(String autorLibro, String tituloLibro, int paginas)
    {
        autor = autorLibro;
        titulo = tituloLibro;
        numeroPaginas = paginas;
    }
    
    /**
     * Doy nombre al autor
     */
    public String getAutor() {
        return autor;
    }
    
    /**
     * Doy t�tulo al libro
     */
    public String getTitulo() {
        return titulo;
    }
    
    /**
     * A�ado numero de paginas
     */
    public int numeroPaginas() {
        return numeroPaginas;
    }
    
    /**
     * Imprime los datos del autor
     */
    public void imprimeAutor() {
        System.out.println(autor);
    }
    
    public void imprimeTitulo() {
        System.out.println(titulo);
    }
    
    public void imprimeDetalles() {
        System.out.println("Titulo: " + titulo + ", Autor: " + autor + ", P�ginas: " + numeroPaginas);
    }
    
    public String getDetalles() {
        String detalles = "Titulo: " + titulo + ", Autor: " + autor + ", P�ginas: " + numeroPaginas;
        return detalles;
    }
}
