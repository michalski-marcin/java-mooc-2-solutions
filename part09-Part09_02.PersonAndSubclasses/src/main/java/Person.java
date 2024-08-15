import java.util.ArrayList;

public class Person {

  private ArrayList<String> personDetails;

  public Person(String name, String address) {

    this.personDetails = new ArrayList<>();
    this.personDetails.add(name);
    this.personDetails.add(address);

  }

  public String toString() {
    return String.format("%s\n  %s", this.personDetails.get(0), this.personDetails.get(1));
  }
}