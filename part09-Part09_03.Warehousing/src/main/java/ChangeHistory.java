import java.util.ArrayList;

public class ChangeHistory {

  private ArrayList<Double> history;

  public ChangeHistory() {
    this.history = new ArrayList<>();
  }

  public void add(double status) {
    this.history.add(status);
  }

  public void clear() {
    this.history.clear();
  }

  public double maxValue() {
    
    double maxValue = 0.0;
    for (double value : this.history) {
      if (value > maxValue) {
        maxValue = value;
      }
    }
    return maxValue;
  }

  public double minValue() {
    double minValue = 0.0;
    if (!this.history.isEmpty()) {
      minValue = this.history.get(0);
      for (double value : this.history) {
        if (value < minValue) {
          minValue = value;
        }
      }
    }
    return minValue;
  }

  public double average() {

    double sum = 0;

    for (double value : this.history) {
      sum += value;
    }
    return sum / this.history.size();
  }

  public String toString() {
    return this.history.toString();
  }
}