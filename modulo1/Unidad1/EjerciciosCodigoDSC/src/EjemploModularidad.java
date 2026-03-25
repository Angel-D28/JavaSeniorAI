import java.util.Scanner;

public class EjemploModularidad {

    final static int precioMinimo = 100000;
    final static int descuento = 10;

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        int precio = leerPrecio();
        int valorDescuento = calcularDescuento(precio, descuento);
        int total = calcularTotal(valorDescuento, precio);
        imprimirInformcion(total, descuento, precio, valorDescuento);

    }

    public static int leerPrecio() {
        System.out.print("Ingrese Precio del producto: ");
        int precio = sc.nextInt();
        return precio;
    }

    public static int calcularDescuento(int precio, int porcentajeDescuento) {
        int descuento = 0;
        if (precio > precioMinimo) {
            descuento = (porcentajeDescuento * precio) / 100;
        }
        return descuento;
    }

    public static int calcularTotal(int valorDescuento, int precio) {
        return precio - valorDescuento;
    }

    public static void imprimirInformcion(int precioFinal, int porcentajeDescuento, int precioOriginal,
            int descuento) {
                if (descuento > 0) {
                    System.out.println("\tSubtotal: " + precioOriginal + "\n\tSu porcentaje de descuento es: " + porcentajeDescuento
                + "%\n\tEl valor del descuento es: " + descuento + "\n\tPrecio Final: " + precioFinal);
                }else{
                System.out.println("\tSubtotal: " + precioOriginal + "\n\tSu porcentaje de descuento es: 0%\n\tEl valor del descuento es: " + descuento + "\n\tPrecio Final: " + precioFinal);
                }
            }

}
