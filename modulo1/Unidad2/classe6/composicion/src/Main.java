public class Main {
    public static void main(String[] args) {

        Order order = new Order("ORD123", 5);

        // El Order crea internamente los objetos OrderDetail
        order.addDetail("Laptop", 1);
        order.addDetail("Mouse", 2);

        order.showDetails();
    }
}