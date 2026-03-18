import java.util.Scanner;

public class ejemplosFunciones {

    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception{
         
        //System.out.print("ingrese el nombre que quiere saludar: ");
        //String nombre = sc.nextLine();
        //saludar(nombre);

        //imprimirMensajeNveces("Mensaje que quiere repetir", 5);
        int miNumero = 30;
        cambiarValor(miNumero);
        System.out.println(miNumero);
    }

    public static int cambiarValor(int numero){
        numero = 10;
        return numero;
    }

    public static void saludar(String nombre){
        System.out.println("Hola " + nombre);
    }

    public static void imprimirMensajeNveces(String mensaje, int  veces){
        for (int i = 0; i < veces; i++) {
            System.out.println(mensaje);
        }
    }
}
