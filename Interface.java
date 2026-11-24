interface payment{
    void pay();
}
class UPI implements payment{
    @Override
    public void pay() {
        System.out.println("Payment done using UPI");
    }
}
class Interface {
    public static void main(String[] args) {
        UPI upi = new UPI();
        upi.pay();
    }
}