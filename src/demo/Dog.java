package demo;

public class Dog extends Animal{
  @Override
  public void makeSound() {
    System.out.println("WOWOW");
    super.makeSound();
  }
}
