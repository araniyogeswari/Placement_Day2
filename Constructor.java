class Car{
    Car(){
        System.out.println("Car is created");
    }
    Car(int a){
        System.out.println("Car is created with parameter: " + a);
    }
}
class Constructor {
    public static void main(String[] args) {
         new Car();
       new Car(10);
    }
}