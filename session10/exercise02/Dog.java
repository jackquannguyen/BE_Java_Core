package vn.edu.rikkei.session10.ex02;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("| [Dog " + getName() + "] says: Woof! Woof!");
    }
}
