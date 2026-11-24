
abstract class Payment {
    double amount;

    Payment(double amount) {
        this.amount = amount;
        System.out.println("Constructor called");
    }

    void showAmount() {
        System.out.println("Payment Amount: ₹" + amount);
    }

    abstract void processpayment();
}

class UPIpayment extends Payment {

    UPIpayment(double amount) {
        super(amount);
    }

    @Override
    void processpayment() {
        System.out.println("Payment Done");
    }
}

class Task_23 {
    public static void main(String[] args) {
        UPIpayment upi = new UPIpayment(1000);
        upi.showAmount();
        upi.processpayment();
    }
}
