import java.util.Scanner;

public class MissingNumber {
    public static int findMissingNumber(int[] arr) {
        int n = arr.length + 1; // Calculate the total number of elements
        int sum = (n * (n + 1)) / 2; // Calculate the sum of all numbers from 1 to n
        int arrSum = 0; // Calculate the sum of the elements in the array

        for (int num : arr) {
            arrSum += num;
        }

        return sum - arrSum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n - 1];

        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < n - 1; i++) {
            arr[i] = scanner.nextInt();
        }

        int missingNumber = findMissingNumber(arr);
        System.out.println("Missing number: " + missingNumber);

        scanner.close();
    }
}