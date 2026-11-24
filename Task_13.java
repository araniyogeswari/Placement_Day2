 interface  Notification {
   abstract void sendNotification();
 }
class EmailNotification implements Notification {
    @Override
    public void sendNotification() {
        System.out.println("Sending notification via Email");
    }
}
class smsnotification implements Notification {
    @Override
    public void sendNotification() {
        System.out.println("Sending notification via SMS");
    }
}
class Task_13 {
    public static void main(String[] args) {
        Notification n1 = new EmailNotification();
        Notification n2 = new smsnotification();
        n1.sendNotification();
        n2.sendNotification();
    }
}