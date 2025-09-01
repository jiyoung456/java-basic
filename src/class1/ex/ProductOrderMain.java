package class1.ex;

public class ProductOrderMain {

    public static void main(String[] args) {
        ProductOrder tofu = new ProductOrder();
        tofu.productName = "두부";
        tofu.price = 2000;
        tofu.quantity = 2;

        ProductOrder kimchi = new ProductOrder();
        kimchi.productName = "김치";
        kimchi.price = 5000;
        kimchi.quantity = 1;

        ProductOrder coke = new ProductOrder();
        coke.productName = "콜라";
        coke.price = 1500;
        coke.quantity = 2;

        ProductOrder[] products = {tofu, kimchi, coke};

        int totlaPrice = 0;

        for (ProductOrder p : products) {
            System.out.println("상품명: " + p.productName + ", 가격: " + p.price + ", 수량: " + p.quantity);
            totlaPrice += p.price * p.quantity;
        }
        System.out.println("총 결제금액: " + totlaPrice);
    }
}
