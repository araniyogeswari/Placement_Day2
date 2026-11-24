abstract class Shape {
    abstract double calculateArea();
    
    void displayMessage() {
        System.out.println("Calculating area of the shape...");
    }
}
class Circle extends Shape {
    double radius;
    
    @Override
    double calculateArea() {
        return 3.14 * radius * radius;
    }
}
class Task_10 {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.radius = 5.0;
        circle.displayMessage();
        System.out.println("Area of the circle: " + circle.calculateArea());
    }
}