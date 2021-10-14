package array;

import java.util.Arrays;

public class Machine {

    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int indexC = 0;
        int size = 0;
        int[] result = new int[100];
        money = money - price;
        while (money > 0) {
            while (money >= coins[indexC]) {
                money = money - coins[indexC];
                result[size] = coins[indexC];
                size++;
            }
            indexC++;
        }
        return Arrays.copyOf(result, size);
    }
}
