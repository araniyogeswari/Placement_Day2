class Bank {
    double getInterestRate() {
        return 0.0;
    }
}

class SBI extends Bank {
    @Override
    double getInterestRate() {
        return 6.5;
    }
}

class HDFC extends Bank {
    @Override
    double getInterestRate() {
        return 7.0;
    }
}

class Task_3 {
    public static void main(String[] args) {

        SBI s = new SBI();
        HDFC h = new HDFC();

        System.out.println("SBI Interest Rate: " + s.getInterestRate());
        System.out.println("HDFC Interest Rate: " + h.getInterestRate());
    }
}