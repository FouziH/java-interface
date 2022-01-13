public class Store {
    String productType;

    public Store(String product) {
        productType = product;
    }
    
    public static void main(String[] args) {

        Store lemonadeStand = new Store("lemonade");

        System.out.println(lemonadeStand.productType);

    }
}
