public class Product {
    private String name;
    private double price;
    private String unit;
    private boolean organic;
    private int stock;

    public Product(String name, double price, String unit, boolean organic, int stock) {
        this.name = name;
        this.price = price;
        this.unit = unit;
        this.organic = organic;
        this.stock = stock;
    }

    public String getName() { return name; }
    public double getPrice() { return price; }
    public boolean isOrganic() { return organic; }
    public int getStock() { return stock; }

    public double calculatePrice(int qty) {
        return price * qty;
    }

    public void show() {
        System.out.println("  " + name + " " + price + "Birr/" + unit);
    }
}