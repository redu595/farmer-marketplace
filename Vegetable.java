public class Vegetable extends Product {
    public Vegetable(String name, double price, String unit, boolean organic, int stock) {
        super(name, price, unit, organic, stock);
    }

    public double calculatePrice(int qty) {
        double total = super.calculatePrice(qty);
        if (isOrganic()) total = total * 1.15;
        return total;
    }
}