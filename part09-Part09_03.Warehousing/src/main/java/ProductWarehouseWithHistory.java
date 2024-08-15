import java.util.ArrayList;

public class ProductWarehouseWithHistory extends ProductWarehouse {

  private double initialBalance;
  private ChangeHistory history;

  public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {

    super(productName, capacity);
    this.initialBalance = initialBalance;
    this.history = new ChangeHistory();
    addToWarehouse(initialBalance);
    
  }

  
    public void addToWarehouse(double amount) {

      super.addToWarehouse(amount);
      history.add(getBalance());
      
    }

  
  public double takeFromWarehouse(double amount) {

    double num = super.takeFromWarehouse(amount);
    history.add(getBalance());
    return num;
    
  }

  public void printAnalysis() {
    System.out.println("Product: " + getName());
    System.out.println("History: " + history);
    System.out.println("Largest amount of product: " + history.maxValue());
    System.out.println("Smallest amount of product: " + history.minValue());
    System.out.println("Average: " + history.average());
  }

  public String history() {
   return this.history.toString(); 
  }

  
}