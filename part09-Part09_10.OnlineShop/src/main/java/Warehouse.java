import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Warehouse {

    private Map<String, Integer> prices;
    private Map<String, Integer> stockAvailable;

    public Warehouse() {
        prices = new HashMap<>();
        stockAvailable = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {

        prices.put(product, price);
        stockAvailable.put(product, stock);
    }

    public int price(String product) {
        if (!prices.containsKey(product)) {
            return -99;
        }
        return prices.get(product);
    }

    public int stock(String product) {
        if (!stockAvailable.containsKey(product)) {
            return 0;
        }
        return stockAvailable.get(product);
    }

    public boolean take(String product) {
        if (stock(product) > 0) {
            stockAvailable.put(product, stock(product) - 1);
            return true;
        }
        return false;
    }

    public Set<String> products() {
        return stockAvailable.keySet();
    }

}
