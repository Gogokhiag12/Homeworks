import java.util.Arrays;
import java.util.Scanner;

public class Main {
    /*
    Function name: listIntegers
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
    /*
    Function name: fibonacci
    Function returns fibonacci?... IDK how to describe this shit
     */
    public static void fibonacci() {
        Scanner scanner = new Scanner(System.in);
        int n1 = 0;
        int n2 = 1;
        int n3;
        System.out.print("Input fibonacci number: ");
        int count = scanner.nextInt();
        System.out.print(n1 + " " + n2);
        for (int i = 2; i < count; ++i) {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
    }

    public static void main(String[] args) {
//        System.out.println(" - - - - - - - First Exercise - - - - - - - ");
//        listIntegers();
//        System.out.println(" - - - - - - - Second Exercise - - - - - - - ");
//        int[] nums = {16, 0, 3, 0, 4, 0, 6, 0, 15};
//        System.out.println("Your array before changes: " + Arrays.toString(nums));
//        System.out.println("Your array after changes: " + Arrays.toString(zeroMax(nums)));
//        System.out.println(" - - - - - - - Third Exercise - - - - - - - ");
//        System.out.println("მესამე დავალება ვერ გავიგე... სავარაუდოდ Stackით კეთდება");
        System.out.println(" - - - - - - - Fourth Exercise - - - - - - - ");
        fibonacci();
    }
}