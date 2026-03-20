import java.util.Scanner;

public class Banco {
    private String nombre;
    private final Scanner sc ;

    public Banco(String nombre , Scanner scanner) {
        this.nombre = nombre;
        this.sc = scanner;
    }

    public boolean login(Usuario usuarioActivo) {
        String intentoNumeroCuenta;
        String intentoContraseña;
        String cuentaReal = usuarioActivo.getNumeroCuenta();
        String claveReal = usuarioActivo.getContraseña();

        boolean loginExitoso = false;// boolean para controlar el flujo del login, si es exitoso se cambia a true y
                                     // se sale del ciclo
        int intentos = 0; // contador de intentos para limitar el número de intentos de login

        do {
            System.out.print("ingrese numero de cuenta:");
            intentoNumeroCuenta = sc.nextLine();

            System.out.print("ingrese su contraseña:");
            intentoContraseña = sc.nextLine();

            if (intentoNumeroCuenta.equals(cuentaReal) && intentoContraseña.equals(claveReal)) {
                System.out.println("ingresando al sistema........");
                loginExitoso = true;
            } else {
                System.out.println("Credenciales incorrectas, intente de nuevo");
                intentos++;
            }

        } while (!loginExitoso && intentos < 3); // el ciclo se repetirá mientras el login no sea exitoso o se
                                                         // hayan intentado 3 veces

        if (intentos == 3) {
            System.out.println("Demasiados intentos fallidos");
        }
        return loginExitoso;
        
    }

    public void retirar(Usuario usuarioActivo) {
        System.out.print("ingrese el monto a retirar: ");
        double monto = sc.nextDouble();
        usuarioActivo.retirar(monto);
        sc.nextLine();
    }

    public void depositar(Usuario usuarioActivo) {
        System.out.print("ingrese el monto a depositar: ");
        double monto = sc.nextInt();
        usuarioActivo.depositar(monto);
        sc.nextLine();
    }

    public String getNombre(){
        return this.nombre;
    }
}
