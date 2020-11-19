
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
    private String numeroReferencia;

    /**
     * Fija el autor y el titulo del libro a los dados como parametro
     */
    public Libro(String autorLibro, String tituloLibro, int paginas)
    {
        autor = autorLibro;
        titulo = tituloLibro;
        numeroPaginas = paginas;
        numeroReferencia = "";
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
     * A�ado numero de referencia
     */
    public String getNumeroReferencia() {
        return numeroReferencia;
    }
    
    /**
     * Fijo numero de referencia
     */
    public void setNumeroReferencia(String numero) {
        if (numero.length() >= 3) {
            numeroReferencia = numero;
        }
        else {
            System.out.println("El numero de referencia tiene que tener al menos 3 caracteres");
        }
    }
    
     /**
     * Imprime los datos del autor
     */
    public void imprimeAutor() {
        System.out.println(autor);
    }
    
    /**
     * Imprime los datos del titulo
     */
    public void imprimeTitulo() {
        System.out.println(titulo);
    }
    
    /**
     * Imprime los detalles
     */
    public void imprimeDetalles() {
        System.out.println(getDetalles());
    }
    
    public String getDetalles() {
        String detalles = "Titulo: " + titulo + ", Autor: " + autor + ", P�ginas: " + numeroPaginas;
        if (!"".equals(numeroReferencia)) {
            System.out.println("Numero de referencia: " + numeroReferencia);
        }
        else {
            System.out.println("Numero de referencia: ZZZ");
        }
        return detalles;
    }
    
}
