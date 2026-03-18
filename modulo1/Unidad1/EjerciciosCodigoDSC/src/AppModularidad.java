import java.util.Scanner;

public class AppModularidad {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        String nombre = leerNombre(sc);
        byte edad = leerEdad(sc);
        boolean validacion = validacionEdad(sc, edad);
        String mensaje = generarMensaje(validacion, nombre);
        mostrarMensaje(mensaje);
    }

    public static String leerNombre(Scanner lector) {
        System.out.print("ingrese su nombre: ");
        String nombre = lector.nextLine();
        return nombre;
    }

    public static byte leerEdad(Scanner lector){
        System.out.print("ingrese su edad: ");
        byte edad = lector.nextByte();
        lector.nextLine();
        return edad;
        
    }

    public static boolean validacionEdad(Scanner lector, byte edad){
        if(edad >= 18){ 
            return true;
        }else{
            return false;
        }
    }

    public static String generarMensaje (boolean validacionEdad , String nombre){
        String mensaje;
        if (validacionEdad) {
            mensaje = "Bienvenido " + nombre +" Ingreso Exitoso"; 
        }else{
            mensaje = "Lo sentimos " + nombre + " no eres mayor de edad";
        }
        return mensaje;
    }

    public static void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}
