import java.util.Scanner;

public class App {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        Banco davi = new Banco("Davivienda" , sc);
        Usuario usuario1 = new Usuario("Angel Diaz", 20000, "123456", "2026");

        boolean acceso = davi.login(usuario1);

        if (acceso) {
            menu(usuario1 , davi);
        }
    }

    

    public static void menu(Usuario usuarioActivo , Banco banco) {
        String opcion;
        do {
            System.out.println("\n==========MENU==========");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Salir");
            System.out.println("========================\n");
            System.out.print("Seleccione una opción:");
            opcion = sc.nextLine();

            switch (opcion) {
                case "1":
                    System.out.println("saldo actual: " + usuarioActivo.getSaldo());
                    break;
                case "2":
                    banco.depositar(usuarioActivo);
                    break;
                case "3":
                    banco.retirar(usuarioActivo);
                    break;
                case "4":
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }

        } while (!opcion.equals("4")); // el ciclo se repetirá mientras la opción seleccionada no sea 4 para salir del
                                       // sistema

        sc.nextLine();
    }
}
