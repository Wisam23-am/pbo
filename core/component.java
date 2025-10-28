package src.core;

// Abstract class untuk semua komponen PC
public abstract class Component {
    protected String name;
    protected double price;

    public Component(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + " ($" + price + ")";
    }
}
