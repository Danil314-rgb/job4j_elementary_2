package condition;

public class Cinema {

    public static void main(String[] args) {
        access(17);
        access(18);
        access(23);
    }

    public static void access(int age) {
        System.out.println("The age of the customer is : " + age);
        if (age >= 18) {
            System.out.println("Welcome to the cinema.");
        } else {
            System.out.println("It is not for you.");
        }
    }
}
