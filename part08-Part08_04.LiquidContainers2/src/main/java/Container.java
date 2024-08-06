public class Container {

    private int amountOfLiquid;

    public int contains() {
        return amountOfLiquid;
    }

    public void add(int amount) {
        if (amount > 0) {
            amountOfLiquid += amount;
            if (amountOfLiquid > 100) {
                amountOfLiquid = 100;
            }
        }
    }

    public void remove(int amount) {
        if (amount > 0) {
            amountOfLiquid -= amount;
            if (amountOfLiquid < 0) {
                amountOfLiquid = 0;
            }
        }
    }

    public String toString() {
        return amountOfLiquid + "/100";
    }
}