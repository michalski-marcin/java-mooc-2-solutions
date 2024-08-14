import java.util.ArrayList;
import java.util.HashMap;

public class DictionaryOfManyTranslations {

  private HashMap<String, ArrayList<String>> translations;

  public DictionaryOfManyTranslations() {

    this.translations = new HashMap<>();
  }

  public void add(String word, String translation) {

    this.translations.putIfAbsent(word, new ArrayList<>());

    this.translations.get(word).add(translation);
  }

  public ArrayList<String> translate(String word) {
    ArrayList<String> keyTranslations = new ArrayList<>();

    if (translations.containsKey(word)) {
      keyTranslations.addAll(translations.get(word));
    }

    else {
      return keyTranslations;
    }

    return keyTranslations;

  }

  public void remove(String word) {
    translations.remove(word);
  }

}