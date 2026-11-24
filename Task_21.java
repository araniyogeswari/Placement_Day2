abstract class Vehicle {
    abstract void start();

    void run() {
        System.out.println("Vehicle is running");
    }
}

class Bike extends Vehicle {
    @Override
    void start() {
        System.out.println("Bike is starting");
    }
}

class Task_21 {
    public static void main(String[] args) {
        Bike v = new Bike();

        v.start();
        v.run();
    }
}