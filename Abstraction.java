abstract class Vehicle{
    abstract void start();
    void run(){
        System.out.println("Vehicle is running");
    }
}
class bike extends Vehicle{
    @Override
    void start() {
        System.out.println("Bike is starting");
    }
}
class Abstraction {
    public static void main(String[] args) {
        bike v= new bike();
        v.start();
        v.run();
    }
}