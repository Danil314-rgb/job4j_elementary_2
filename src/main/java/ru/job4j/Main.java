package ru.job4j;

public class Main {
    public static void main(String[] args) {
       /* char[] arr = {'a', 'b', 'c', 'd', 'c'};
        System.out.println(calculate(arr, 'c', 1));*/

        System.out.println(getSomeIndex("abc", 'c', 1));
        System.out.println(getSomeIndex("abcdec", 'c', 2));
        System.out.println(getSomeIndex("abx", 'c', 1));
    }

    public static int calculate(char[] array, char c, int number) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == c) {
                return i;
            }
        }
        return -1;
    }

    public static int getSomeIndex(String str, int aChar, int countEnter) {
        int firstEnterIndex = str.indexOf(aChar);
        if (firstEnterIndex == -1) {
            return -1;
        }
        if (countEnter == 1) {
            return firstEnterIndex;
        }
        int[] arrayEnterIndex = new int[countEnter];
        int enterIndex = 0;
        arrayEnterIndex[enterIndex++] = firstEnterIndex;
        for (int i = firstEnterIndex + 1; i < str.length(); i++) {
            if ((char) aChar == str.charAt(i)) {
                arrayEnterIndex[enterIndex++] = i;
            }
        }
        return arrayEnterIndex[countEnter - 1];
    }
}