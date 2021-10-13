package array;

public class SwitchArray {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6};
        int[] result = swapBorder(nums);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    public static int[] swapBorder(int[] array) {
        int temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;
        return array;
    }
}
