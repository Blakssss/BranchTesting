package demo;

public class Main {

    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        new Dog().makeSound();
        new Cat().makeSound();
        dog.eat("fish");
        cat.eat("beef");

    }
}
