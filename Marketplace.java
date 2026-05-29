import java.util.ArrayList;

public class Marketplace {
    private String name;
    private ArrayList<Farmer> farmers;
    private ArrayList<Order> orders;

    public Marketplace(String name) {
        this.name = name;
        this.farmers = new ArrayList<>();
        this.orders = new ArrayList<>();
    }

    public void addFarmer(Farmer f) { farmers.add(f); }

    public void buy(Customer c, Product p, Farmer f, int qty) {
        Order o = new Order(c, p, f, qty);
        orders.add(o);
        c.addOrder(o);
        c.pay(o.getTotal());
    }

    public void deliver(Order o) {
        o.setStatus("Delivered");
        System.out.println("\n>> DELIVERY: " + o.getFarmerName() + " delivered to " + o.getCustomerName());
    }

    public void showProducts() {
        System.out.println("\n=== " + name + " ===");
        for (Farmer f : farmers) {
            f.displayProducts();
        }
    }

    public void showOrders(Customer c) {
        System.out.println("\n=== " + c.getName() + "'s Orders ===");
        for (Order o : c.getOrders()) {
            o.show();
        }
        System.out.println("Balance: " + c.getMoney() + "Birr");
    }
}