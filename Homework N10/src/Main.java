import java.util.Arrays;
import java.util.Scanner;

public class Main {
    /*
    Function name - listIntegers
    Function changes "alone" element with higher element between its before and after elements
     */
    private static void listIntegers() {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements you want to store: ");
        n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the elements of the array: ");
            array[i] = scanner.nextInt();
        }
        System.out.println("Your array before changes is: " + Arrays.toString(array));
        for (int l = 0; l < n; l++) {
            if (l != array.length - 1 && l != 0) {
                if (array[l] != array[l - 1] && array[l] != array[l + 1]) {
                    array[l] = Math.max(array[l - 1], array[l + 1]);
                }
            }
        }
        System.out.println("Your array after changes is: " + Arrays.toString(array));
    }

    public static void main(String[] args) {
        System.out.println(" - - - - - - - First Exercise - - - - - - - ");
        listIntegers();
        System.out.println(" - - - - - - - Second Exercise - - - - - - - ");
        System.out.println(" - - - - - - - Third Exercise - - - - - - - ");
    }
}