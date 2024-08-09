import java.util.HashMap;

public class Abbreviations {

  private HashMap<String, String> abbreviations;

  public Abbreviations() {
    this.abbreviations = new HashMap<>();
  }

  public void addAbbreviation(String abbreviation, String explanation) {
    this.abbreviations.put(abbreviation, explanation);
  }

  public boolean hasAbbreviation(String abbrevation) {
    return this.abbreviations.containsKey(abbrevation);
  }

  public String findExplanationFor(String abbrevation) {
    return this.abbreviations.get(abbrevation);
  }


  
}