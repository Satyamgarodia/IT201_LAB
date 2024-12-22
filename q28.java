package it201;

public class q28 {
    static int[] getArray() {
        return new int[]{10, 20, 30, 40, 50};
    }

    public static void main(String[] args) {
        int[] array = getArray();
        System.out.println("Returned array elements are:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
