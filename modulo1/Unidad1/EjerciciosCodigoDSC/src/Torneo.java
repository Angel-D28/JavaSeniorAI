import java.util.Scanner;

public class Torneo {
    public static Scanner sc = new Scanner(System.in);
    //public static String[] jugadores = { "Fays", "Santiago", "Sofia", "Luis", "Mario" };
    public static String[] jugadores = new String[10];

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        int opcion;
        do {
            
            System.out.println("==================================");
            System.out.println("Bienvenido al Torneo de Videojuegos");
            System.out.println("1. Crear Jugador");
            System.out.println("2. Mostrar Jugadores");
            System.out.println("3. Eliminar Jugador");
            System.out.println("4. Actualizar Jugador");
            System.out.println("5. Salir");
            System.out.println("==================================");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt(); 
            sc.nextLine(); // Limpiar el buffer del scanner después de leer un número para evitar problemas con la entrada de datos en futuras operaciones

            switch (opcion) {
                case 1:
                    crearJugador();
                    break;
                case 2:
                    mostrarJugadores();
                    break;
                case 3:
                    eliminarJugador();
                    break;
                case 4:
                    actualizarJugador();
                    break;
                case 5:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida, intente de nuevo");
                    break;
            }
        } while (opcion != 5); 
    }

    public static void crearJugador() {
        String nombre;
        do {
            System.out.print("ingrese el nombre del jugador: ");
            nombre = sc.nextLine();
            } while (nombre.isEmpty()); // el ciclo se repetirá mientras el nombre esté vacío, asegurando que se ingrese
                                    // un nombre válido
            for (int i = 0; i < jugadores.length ; i++) {
                if (jugadores[i] == null) {
                    jugadores[i] = nombre;
                    break;
                }
            }
        System.out.println("Jugador " + nombre + " creado exitosamente");
        sc.nextLine();
    }

    public static void mostrarJugadores() {
        System.out.println("Jugadores Inscritos :");
        for (int i = 0; i < jugadores.length; i++) {
            if (jugadores[i] != null) {
                System.out.println((i+1) + ". " + jugadores[i] + "\n");
            }
        }
    }

    public static void eliminarJugador() {
        System.out.print("ingrese el nombre del jugador a eliminar: ");
        String nombreEliminar = sc.nextLine().toLowerCase();
        boolean busquedaExitosa = false;
        for (int i = 0; i < jugadores.length; i++) {
            if (jugadores[i] != null) {
                if(jugadores[i].toLowerCase().equals(nombreEliminar)){
                    jugadores[i] = null;
                System.out.println("Jugador " + nombreEliminar + " eliminado exitosamente");
                busquedaExitosa = true;
                }
            }
        }
        if (!busquedaExitosa) {
            System.out.println("Jugador no encontrado");
            
        }
        sc.nextLine();
    }

    public static void actualizarJugador() {
        String nombreActualizar;
        boolean busquedaExitosa = false;
        do {
            System.out.print("ingrese el nombre del jugador a actualizar: ");
            nombreActualizar = sc.nextLine().toLowerCase();

            for (int i = 0; i < jugadores.length; i++) {
                if (jugadores[i].toLowerCase().equals(nombreActualizar)) {
                    System.out.print("ingrese el nuevo nombre del jugador: ");
                    String nuevoNombre = sc.nextLine();
                    jugadores[i] = nuevoNombre;
                    System.out.println("Jugador " + nombreActualizar + " actualizado exitosamente a " + nuevoNombre);
                    busquedaExitosa = true;
                    break;
                }
            }
            if (!busquedaExitosa) {
                System.out.println("Jugador no encontrado, intente de nuevo");
            }

        } while (!busquedaExitosa);
        sc.nextLine();
    }

}
