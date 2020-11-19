
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
    private int vecesPrestado;
    private boolean esLibroDeTexto;

    /**
     * Fija el autor y el titulo del libro a los dados como parametro
     */
    public Libro(String autorLibro, String tituloLibro, int paginas, boolean esLibroDeTexto)
    {
        autor = autorLibro;
        titulo = tituloLibro;
        numeroPaginas = paginas;
        numeroReferencia = "";
        vecesPrestado = 0;
        esLibroDeTexto = true;
    }
    
    /**
     * Doy nombre al autor
     */
    public String getAutor() {
        return autor;
    }
    
    /**
     * Doy título al libro
     */
    public String getTitulo() {
        return titulo;
    }
    
    /**
     * Añado numero de paginas
     */
    public int numeroPaginas() {
        return numeroPaginas;
    }
    
    /**
     * Añado numero de referencia
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
     * Numero de veces prestado
     */
    public int getVecesPrestado() {
        return vecesPrestado;
    }
    
    /**
     * Incremento de numero de veces prestado
     */
    public void prestar() {
        vecesPrestado++;
    }
    
    /**
     * Añado boolean para saber si es libro de texto o no
     */
    public boolean esLibroDeTexto () {
        return esLibroDeTexto;
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
       String detalles = "Titulo: " + titulo + ", Autor: " + autor + ", Páginas: " + numeroPaginas + ", Numero de veces prestado: " + vecesPrestado; 
       if (!"".equals(numeroReferencia)) {
           System.out.println("Numero de referencia: " + numeroReferencia);
        }
       else {
           System.out.println("Numero de referencia: ZZZ");
        }
       if (!esLibroDeTexto) {
           System.out.println("Se está usando como libro de texto");
        }
       else {
           System.out.println("No se está usando como libro de texto");
       }
        return detalles;
    }  
}
