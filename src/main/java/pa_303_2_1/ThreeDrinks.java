package pa_303_2_1;

class Item {
    double price;
    int amount;
    String name;

    Item(String name, double price, int amount) {
        this.name = name;
        this.price = price;
        this.amount = amount;
    }

    double totalPrice() {
        return price * amount;
    }
}
public class ThreeDrinks {
    private static final double SF_SALES_TAX = 0.08625;
    static Item espresso = new Item("Espresso",2.00, 3);
    static Item latte = new Item("Latte",4.50, 4);
    static Item americano = new Item("Americano",2.50, 2);

    public static void main(String[] args) {
        double subtotal = espresso.totalPrice() + latte.totalPrice() + americano.totalPrice();
        double tax = subtotal * SF_SALES_TAX;
        double totalSale = subtotal + tax;

        System.out.printf("%s x%d: $%.2f\n", espresso.name, espresso.amount, espresso.totalPrice());
        System.out.printf("%s x%d: $%.2f\n", latte.name, latte.amount, latte.totalPrice());
        System.out.printf("%s x%d: $%.2f\n", americano.name, americano.amount, americano.totalPrice());
        System.out.println("Subtotal: $" + String.format("%.2f", subtotal));
        System.out.println("Tax: $" + String.format("%.2f", tax));
        System.out.println("Total: $" + String.format("%.2f", totalSale));
    }
}

