package src.home_work.LEC28.reflection;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Іван");
        User user2 = new User("Iван");

        try {
            CyrillicValidator.validate(user1);
            System.out.println("User 1 validation passed.");
        } catch (IllegalArgumentException e) {
            System.out.println("User 1 validation failed: " + e.getMessage());
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }

        try {
            CyrillicValidator.validate(user2);
            System.out.println("User 2 validation passed.");
        } catch (IllegalArgumentException e) {
            System.out.println("User 2 validation failed: " + e.getMessage());
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
