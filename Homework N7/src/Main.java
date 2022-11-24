import java.util.Scanner;

public class Main {

    private static int countPositives(int[] a){
        int count = 0;
        for (int positive: a){
            if (positive > 0)
                count++;
        }
        return count;
    }

    private static int countNegatives(int[] a){
        int count = 0;
        for (int positive: a){
            if (positive < 0)
                count++;
        }
        return count;
    }

    private static int positivesSum(int[] a) {
        int count = 0;
        for (int positive : a) {
            if (positive > 0)
                count += positive;
        }
        return count;
    }

    private static int negativesSum(int[] a) {
        int count = 0;
        for (int positive : a) {
            if (positive < 0)
                count += positive;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] array = {4, -3, -7, 3, 6, 8, 9};
        System.out.println(countPositives(array));
        System.out.println(countNegatives(array));
        System.out.println(positivesSum(array));
        System.out.println(negativesSum(array));

    }
}