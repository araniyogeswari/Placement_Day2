abstract class Delivery {
    void acceptOrder() {
        System.out.println("Delivery accepted");
    }
    abstract void deliverProduct();
}
class FoodDelivery extends Delivery {
    @Override
    void deliverProduct() {
        System.out.println("Food order delivered");
    }
}
class ParcelDelivery extends Delivery {
    @Override
    void deliverProduct() {
        System.out.println("Parcel delivered Successfully");
    }
}
class Task_24 {
    public static void main(String[] args) {
        FoodDelivery fd = new FoodDelivery();
        ParcelDelivery pd = new ParcelDelivery();
        fd.acceptOrder();
        fd.deliverProduct();
        pd.acceptOrder();
        pd.deliverProduct();
    }
}
