interface SmartDevice {
    void connectWifi();

    default void deviceStatus() {
        System.out.println("Smart device is ready");
    }
}
class SmartTV implements SmartDevice {
    @Override
    public void connectWifi() {
        System.out.println("Smart TV connected to WiFi");
    }
}
class SmartWatch implements SmartDevice {
    @Override
    public void connectWifi() {
        System.out.println("Smart Watch connected to WiFi");
    }
}
class Task_28{
    public static void main (String [] args){
        SmartDevice a = new SmartTV();
        SmartDevice b = new SmartWatch();
        a.connectWifi();
        b.deviceStatus();
    }
}