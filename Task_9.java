abstract class Animal {
    abstract void makeSound();
    
    void sleep() {
        System.out.println("Animal is sleeping");
    }
}
    class Dog extends Animal {
        @Override
        void makeSound() {
            System.out.println("Dog barks: Woof! Woof!");
        }
    }   

class Task_9 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();
        dog.sleep();
    }
}