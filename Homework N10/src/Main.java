import java.util.Arrays;
import java.util.Scanner;

public class Main {
    /*
    Function name - listIntegers
    Function replaces "alone" element by larger element between its before and after elements
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
    /*
    Function name: zeroMax
    Functions replaces all zeros by the largest odd element to the right of the zero
     */
    private static int[] zeroMax(int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 0) {
                for (int j = i + 1; j <= nums.length - 1; j++) {
                    if ( nums[j] > max && nums[j] % 2 == 1 )
                        max = nums[j];
                }
                nums[i] = max;
                max = 0;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
//        System.out.println(" - - - - - - - First Exercise - - - - - - - ");
//        listIntegers();
        System.out.println(" - - - - - - - Second Exercise - - - - - - - ");
        int[] nums = {16, 0, 3, 0, 4, 0, 6, 0, 15};
        System.out.println("Your array before changes: " + Arrays.toString(nums));
        System.out.println("Your array after changes: " + Arrays.toString(zeroMax(nums)));

        System.out.println(" - - - - - - - Third Exercise - - - - - - - ");
    }
}