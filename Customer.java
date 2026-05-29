import java.util.ArrayList;

public class Customer {
    private String name;
    private double money;
    private ArrayList<Order> orders;

    public Customer(String name, double money) {
        this.name = name;
        this.money = money;
        this.orders = new ArrayList<>();
    }

    public String getName() { return name; }
    public double getMoney() { return money; }
    public ArrayList<Order> getOrders() { return orders; }
    public void addOrder(Order o) { orders.add(o); }
    public void pay(double m) { money -= m; }
}