abstract class Appliance {
    void plugIn() {
        System.out.println("Appliance plugged into power");
    }
    
    abstract void operate();
}
class fan extends Appliance {
    @Override
    void operate() {
        System.out.println("Fan is spinning at high speed");
    }
}
class washingmachine extends Appliance {
    @Override
    void operate() {
        System.out.println("Washing machine is washing clothes");
    }
}
class Task_12 {
    public static void main(String[] args) {
        fan f = new fan();
        f.plugIn();
        f.operate();
        
        washingmachine wm = new washingmachine();
        wm.plugIn();
        wm.operate();
    }
}