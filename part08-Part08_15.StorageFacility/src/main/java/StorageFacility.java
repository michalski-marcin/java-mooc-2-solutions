import java.util.HashMap;
import java.util.ArrayList;

public class StorageFacility {

  private HashMap<String, ArrayList<String>> storage;

  public StorageFacility() {
    this.storage = new HashMap<>();
  }

  public void add(String unit, String item) {

    this.storage.putIfAbsent(unit, new ArrayList<>());

    this.storage.get(unit).add(item);
  }

  public void remove(String unit, String item) {
    if (this.storage.containsKey(unit)) {
      this.storage.get(unit).remove(item);
    }

    if (this.storage.get(unit).isEmpty()) {
      this.storage.remove(unit);
    }

  }

  public ArrayList<String> storageUnits() {
    ArrayList<String> storageUnits = new ArrayList<>(storage.keySet());
    return storageUnits;
  }

  public ArrayList<String> contents(String storageUnit) {
    ArrayList<String> content = new ArrayList<>();

    if (storage.containsKey(storageUnit)) {
      content.addAll(storage.get(storageUnit));
    }

    else {
      return content;
    }

    return content;
  }

}