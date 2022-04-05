package demo;

public class Cat extends Animal{
  @Override
  public void makeSound() {
    System.out.println("MEOW MEOW");
    super.makeSound();
  }
}
