package vn.edu.rikkei.session10.ex02;

public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog("Rex");
        Cat cat = new Cat("Mimi");

        System.out.println("+-------------------------------------------------------+");
        System.out.println("|             MÔ PHỎNG HÀNH VI SINH HỌC RIKKEI        |");
        System.out.println("+-------------------------------------------------------+");

        dog.makeSound();
        cat.makeSound();

        System.out.println("+-------------------------------------------------------+");
    }
}
