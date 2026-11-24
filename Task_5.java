class UserRegistration {

    void register(String name, int userId) {

        System.out.println("Registered user: " + name +

                           " with ID: " + userId);

    }

    void register(int userId, String name) {

        System.out.println("Registered ID: " + userId +

                           " for user: " + name);

    }

}

public class Task_5 {

    public static void main(String[] args) {

        UserRegistration user = new UserRegistration();

        user.register("Arani", 101);

        user.register(102, "Yogeswari");

    }

}
