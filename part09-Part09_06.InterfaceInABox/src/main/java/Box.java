import java.util.ArrayList;

public class Box implements Packable {

    private double maxCapacity;
    private ArrayList<Packable> items;

    public Box(double maxCapacity) {
        this.maxCapacity = maxCapacity;
        this.items = new ArrayList<>();
    }

    public void add(Packable item) {

        double tempTotalWeight = this.weight() + item.weight();

        if (item == this) {
            System.out.println("Can't pack itself");
            return;
        }

        if (tempTotalWeight <= this.maxCapacity) {
            items.add(item);
        }

    }

    @Override
    public double weight() {
        double weight = 0;

        for (Packable item : this.items) {
            weight += item.weight();
        }

        return weight;
    }

    @Override
    public String toString() {
        return String.format("Box: " + this.items.size() + " items, total weight " + this.weight() + " kg");
    }

}
