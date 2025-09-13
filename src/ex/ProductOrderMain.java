package ex;

public class ProductOrderMain {

    public static void main(String[] args) {

        ProductOrder[] orders = new ProductOrder[3];
        orders[0] = createOrder("tofu", 2000, 3);
        orders[1] = createOrder("kimchi", 2000, 3);
        orders[2] = createOrder("coke", 2000, 3);
        
        printOrders(orders);
        System.out.println("getTotalAmount(orders) = " + getTotalAmount(orders));
    }

    static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder order = new ProductOrder();
        order.productName = productName;
        order.price = price;
        order.quantity = quantity;
        return order;
    }

    static void printOrders(ProductOrder[] orders) {
        for (ProductOrder p : orders) {
            System.out.println("상품명: " + p.productName + ", 가격: " + p.price + ", 수량: " + p.quantity);
        }
    }

    static int getTotalAmount(ProductOrder[] orders) {
        int totalAmount = 0;
        for (ProductOrder order : orders) {
            totalAmount += order.price * order.quantity;
        }
        return totalAmount;
    }
}
