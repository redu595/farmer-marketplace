public class Main {
    public static void main(String[] args) {
        Marketplace market = new Marketplace("Green Farm Marketplace");

        // CREATE FARMERS
        Farmer f1 = new Farmer("Tadesse Bekele", "Addis Ababa");
        Farmer f2 = new Farmer("Mekdes Abera", "Hawassa");

        // ADD PRODUCTS
        f1.addProduct(new Vegetable("Teff", 5.00, "kg", true, 100));
        f1.addProduct(new Vegetable("Lentils", 3.00, "kg", true, 80));
        f2.addProduct(new Fruit("Mango", 4.00, "kg", true, 50, "Tropical", true));
        f2.addProduct(new Fruit("Banana", 2.50, "kg", false, 60, "Tropical", true));

        // REGISTER FARMERS
        market.addFarmer(f1);
        market.addFarmer(f2);

        // CREATE CUSTOMER
        Customer customer = new Customer("Seble Samuel", 100);

        // SHOW AVAILABLE PRODUCTS
        market.showProducts();

        // PLACE ORDERS
        market.buy(customer, (Vegetable) f1.getProducts().get(0), f1, 5);
        market.buy(customer, (Fruit) f2.getProducts().get(0), f2, 3);
        market.buy(customer, (Vegetable) f1.getProducts().get(1), f1, 4);

        // SHOW BEFORE DELIVERY
        System.out.println("\n===== BEFORE DELIVERY =====");
        market.showOrders(customer);

        // DELIVER ORDERS
        System.out.println("\n===== DELIVERING ORDERS =====");
        for (Order o : customer.getOrders()) {
            market.deliver(o);
        }

        // SHOW AFTER DELIVERY
        System.out.println("\n===== AFTER DELIVERY =====");
        market.showOrders(customer);
    }
}