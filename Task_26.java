interface Alert {
    void sendAlert(String message);
}
class EmailAlert implements Alert{
    public void sendAlert(String message) {
        System.out.println("Email Alert: " + message);
    }
}
class MobileAlert implements Alert{
    public void sendAlert(String message){
        System.out.println("Mobile Alert"+ message);
    }
}
class Task_26{
    public static void main(String[] args) {
        Alert a1 = new EmailAlert();
        Alert a2 = new MobileAlert();
        a1.sendAlert("Check your email for updates.");
        a2.sendAlert("You have a new message on your mobile.");
    }
}