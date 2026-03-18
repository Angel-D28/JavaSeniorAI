public class Libro {
    private String titulo;
    private String autor ;
    private String ISBN;
    private int precio;

    public Libro (String titulo , String autor, String ISBN, int precio){
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.precio = precio;
    }

    public String getTitulo(){
        return this.titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getAutor(){
        return this.autor;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public String getISNB(){
        return this.ISBN;
    }

    public void setISBN(String ISBN){
        this.ISBN = ISBN;
    }

    public int getPrecio(){
        return precio;
    }

    public void setPrecio(int precio){
        this.precio = precio;
    }
}
