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