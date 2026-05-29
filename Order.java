public class Order {
    private Customer customer;
    private Product product;
    private Farmer farmer;
    private int quantity;
    private double total;
    private String status;

    public Order(Customer c, Product p, Farmer f, int qty) {
        this.customer = c;
        this.product = p;
        this.farmer = f;
        this.quantity = qty;
        this.total = p.calculatePrice(qty);
        this.status = "Pending";
    }

    public double getTotal() { return total; }
    public String getStatus() { return status; }
    public void setStatus(String s) { this.status = s; }
    public String getCustomerName() { return customer.getName(); }
    public String getFarmerName() { return farmer.getName(); }
    public Product getProduct() { return product; }

    public void show() {
        System.out.println("  Order: " + quantity + "x " + product.getName() + 
                          " from " + farmer.getName() + " = " + total + 
                          "Birr  [Status: " + status + "]");
    }
}