package condition;

public class Club {

    public static void main(String[] args) {
        Club.permission(true, true);
        Club.permission(true, false);
        Club.permission(false, true);
        Club.permission(false, false);
    }

    public static void permission(boolean beFriend, boolean hasMoney) {
        if (beFriend || hasMoney) {
            System.out.println("I can go to the club.");
        } else {
            System.out.println("I can't.");
        }
    }
}
