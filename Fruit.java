public class Fruit extends Product {
    private String type;
    private boolean fresh;

    public Fruit(String name, double price, String unit, boolean organic, int stock, String type, boolean fresh) {
        super(name, price, unit, organic, stock);
        this.type = type;
        this.fresh = fresh;
    }

    public double calculatePrice(int qty) {
        double total = super.calculatePrice(qty);
        if (isOrganic()) total *= 1.20;
        if (fresh) total *= 1.10;
        return total;
    }

    public void show() {
        super.show();
        System.out.println("    Type: " + type + " Fresh: " + (fresh ? "Yes" : "No"));
    }
}