public class CustomTacoBox implements TacoBox {

  private int tacos;

  public CustomTacoBox(int amountOfTacos) {
    this.tacos = amountOfTacos;
  }

  @Override
    public int tacosRemaining() {
      return tacos;
    }

    @Override
    public void eat() {
      tacos--;
    }
}