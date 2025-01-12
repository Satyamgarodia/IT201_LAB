package riyab;
// take user input if required

public class q5a {
    static int[] getArray() {
        return new int[] { 10, 20, 30, 40, 50 };
    }

    public static void main(String[] args) {
        int[] array = getArray();
        System.out.println("Returned array elements are:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
