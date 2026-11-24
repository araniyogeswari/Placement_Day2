
class Mobile {
    String brand;
    double price;

    Mobile() {
        brand = "Samsung";
        price = 25000;
    }
    void displayDetails() {
        System.out.println(brand + " and " + price);
    }
}

class Task_29 {
    public static void main(String[] args) {
        Mobile m = new Mobile();
        m.displayDetails();
    }
}
