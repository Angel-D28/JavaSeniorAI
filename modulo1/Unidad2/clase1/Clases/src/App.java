public class App {
    public static void main(String[] args) throws Exception {
        Libro libro1 = new Libro("Cien años de soledad",
                "Gabriel Garcia Marquez", "3059098204", 10000);// Esto se llama instanciar la clase
                                                               // o sacar un objeto de ella

        System.out.println("\tlibro: " + libro1.getTitulo() + "\n\tAutor: " + libro1.getAutor() + "\n\tISNB: "
                + libro1.getISNB() + "\n\tPrecio: " + libro1.getPrecio());

    }
}
