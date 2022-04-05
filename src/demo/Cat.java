package demo;

public class Cat extends Animal{
  @Override
  public void makeSound() {
    System.out.println("MEOW MEOW");
    super.makeSound();
  }
  public boolean eat(String foodType){
    return true;
  }

  @Override
  public boolean mood() {
    System.out.println("hvæser");
    return false;
  }
}
