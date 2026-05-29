import java.util.ArrayList;

public class Farmer {
    private String name;
    private String location;
    private ArrayList<Product> products;

    public Farmer(String name, String location) {
        this.name = name;
        this.location = location;
        this.products = new ArrayList<>();
    }

    public String getName() { return name; }
    public ArrayList<Product> getProducts() { return products; }
    public void addProduct(Product p) { products.add(p); }

    public void displayProducts() {
        System.out.println(name + " from " + location + ":");
        for (Product p : products) {
            p.show();
        }
    }
}