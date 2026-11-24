interface PaymentGateway{
    abstract void makePayment();
}
class GooglePay implements PaymentGateway{
   public void makePayment(){
        System.out.println("Payment done in gpay");
    }
}
class PhonePay implements PaymentGateway{
   public void makePayment(){
        System.out.println("Payment done in phonepe");
    }
}
class Task_25{
    public static void main(String[] args) {
        PaymentGateway p1 = new GooglePay();
        PaymentGateway p2 = new PhonePay();
        p1.makePayment();
        p2.makePayment();
    }
}