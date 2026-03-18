import java.util.Scanner;

public class Banco {
    public static Scanner sc = new Scanner(System.in);
    public static boolean next = false;
    public static int cuentaReal = 12345;
    public static int claveReal = 2026;
    public static double saldo = 3000000;

    public static void main(String[] args) throws Exception {
        login();
        if (next) {
            menu();
        }
    }

    public static void login() {
        int numeroCuenta;
        int clave;

        boolean loginExitoso = false;// boolean para controlar el flujo del login, si es exitoso se cambia a true y
                                     // se sale del ciclo
        int intentos = 0; // contador de intentos para limitar el número de intentos de login

        do {
            System.out.print("ingrese numero de cuenta:");
            numeroCuenta = sc.nextInt();

            System.out.print("ingrese su contraseña:");
            clave = sc.nextInt();

            if (numeroCuenta == cuentaReal && clave == claveReal) {
                System.out.println("ingresando al sistema........");
                loginExitoso = true;
                next = true;
            } else {
                System.out.println("Credenciales incorrectas, intente de nuevo");
                intentos++;
            }

        } while (loginExitoso == false && intentos < 3); // el ciclo se repetirá mientras el login no sea exitoso o se
                                                         // hayan intentado 3 veces

        if (intentos == 3) {
            System.out.println("Demasiados intentos fallidos");
        }
        sc.nextLine(); // limpiar el buffer del scanner para evitar problemas con la entrada de datos
                       // en futuras operaciones
    }

    public static void menu() {
        String opcion;
        do {
            System.out.println("\n==========MENU==========");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Transferir dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Salir");
            System.out.println("========================\n");
            System.out.print("Seleccione una opción:");
            opcion = sc.nextLine();

            switch (opcion) {
                case "1":
                    consultarSaldo();
                    break;
                case "2":
                    transferirDinero();
                    break;
                case "3":
                    retirarDinero();
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

    public static void consultarSaldo() {
        System.out.println("Su saldo actual es: " + saldo);
    }

    public static void transferirDinero() {
        System.out.print("ingrese la cuenta destino:");
        int cuentaDestino = sc.nextInt();
        System.out.print("ingrese el monto a transferir:");
        double monto = sc.nextDouble();

        if (monto > saldo) {
            System.out.println("Saldo insuficiente");
        } else if (monto <= 0) {
            System.out.println("Monto no válido");
        } else {
            saldo -= monto;
            System.out.println("Transferencia exitosa a cuenta " + cuentaDestino);
        }
        sc.nextLine();
    }

    public static void retirarDinero(){
        System.out.print("ingrese el monto a retirar: ");
        double monto = sc.nextDouble();

        if (monto > saldo ) {
            System.out.println("Saldo insuficiente");
        } else if (monto <= 0) {
            System.out.println("Monto no válido");
        } else {
            saldo -= monto;
            System.out.println("Retiro exitoso");
        }
        sc.nextLine();
    }
}
