import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {
        Libro libro1 = new Libro("Cien años de soledad",
                "Gabriel Garcia Marquez", "3059098204", 10000);// Esto se llama instanciar la clase
                                                               // o sacar un objeto de ella
        Vuelo vuelo1 = new Vuelo("Armenia" , "Bogotá" , LocalDate.now(),15);

        System.out.println(libro1);
        System.out.println(vuelo1);

    }
}
