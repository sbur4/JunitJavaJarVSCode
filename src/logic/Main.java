package logic;

public class Main {

    public static void main(String[] args) {
    }

    public static int findMax(int arr[]) {
        // int max = 0; // for fail test
        int max = arr[0]; // for pass test
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i])
                max = arr[i];
        }
        return max;
    }

    public static int findMin(int arr[]) {
        // int max = 0; // for fail test
        int min = arr[0]; // for pass test
        for (int i = 1; i < arr.length; i++) {
            if (min < arr[i])
                min = arr[i];
        }
        return min;
    }

}