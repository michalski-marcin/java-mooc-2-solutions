import java.util.ArrayList;

public class Herd implements Movable {

  private ArrayList<Movable> herd;

  public Herd () {
    herd = new ArrayList<>();
  }


  public void addToHerd(Movable movable) {
    herd.add(movable);
  }

  public String toString() {
    StringBuilder sb = new StringBuilder();
    for (Movable organism : herd) {
      sb.append(organism.toString()).append("\n");
    }
    
    return sb.toString();
  }

  public void move(int dx, int dy) {
    for (Movable organism : herd) {
      organism.move(dx, dy);
    }
  }

}