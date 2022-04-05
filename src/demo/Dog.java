package demo;

public class Dog extends Animal{
  @Override
  public void makeSound() {
    System.out.println("WOWOW");
    super.makeSound();
  }

  @Override
  public boolean eat(String foodType) {
    return true;
  }

  @Override
  public boolean mood() {
    System.out.println("Logrer");
    return true;
  }
}
