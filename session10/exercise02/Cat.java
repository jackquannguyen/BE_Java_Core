package vn.edu.rikkei.session10.ex02;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("| [Cat " + getName() + "] says: Meow! Meow!");
    }
}
