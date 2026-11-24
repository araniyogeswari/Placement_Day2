class Car{
    String brand;
    int year;
    Car(){
        brand = "Toyota";
        year = 2024;
    }
    void displayDetails(){
        System.out.println("Brand: " + brand + ", Year: " + year);
    }
}
class Task_17 {
    public static void main (String[]args){
        Car c = new Car();
        c.displayDetails();
    }
}