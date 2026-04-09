public class Order {
    private String orderId;
    private OrderDetail[] details;
    private int count;

    public Order(String orderId, int maxDetails) {
        this.orderId = orderId;
        this.details = new OrderDetail[maxDetails];
        this.count = 0;
    }

    public void addDetail(String product, int quantity) {
        if (count < details.length) {
            // El Order crea internamente los detalles
            details[count] = new OrderDetail(product, quantity);
            count++;
        } else {
            System.out.println("No possible to add more details to the order.");
        }
    }

    public  void showDetails(){
        System.out.println("Details for Order " + orderId + ":");
        for (int i = 0; i < count; i++) {
              System.out.println("- " + details[i].getProductName() +
                               " | Quantity: " + details[i].getQuantity());
        }
    }
    
}
