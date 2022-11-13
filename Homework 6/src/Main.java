public class Main {
    private static int countAverage(int[] a){
        int sum = 0;
        for (int each: a){
            sum += each;
        }
        System.out.println("Tqveni shemoyvanili ricxvebis jamia: " + sum);
        System.out.print("am ricxvebis sashualoa: ");
        return sum / a.length;
    }

    private static int findIndex(int[] a, int toFind){
        int index = -1;
        for (int i = 0; i < a.length; i++){
            if (a[i] == toFind){
                System.out.print("Tqvens mier shemoyvanili ricxvi masivshia da misi indexia: ");
                index = i;
            }
        }
        return index;
    }

    private static int min(int[] a){
        int min = a[0];
        for (int i: a){
            if (i < min){
                min = i;
            }
        }
        System.out.print("masivshi mocemul ricxvebshi umciresia: ");
        return min;
    }

    private static int max (int[] a){
        int max = a[0];
        for (int i: a){
            if (i > max){
                max = i;
            }
        }
        System.out.print("masivshi mocemul ricxvebshi udidesia: ");
        return max;
    }

    public static void main(String[] args) {
        System.out.println("- - - D A V A L E B A 1 - - -");
        System.out.println(countAverage(new int[]{1, 2, 3, 4, 5}));
        System.out.println("- - - D A V A L E B A 2 - - -");
        System.out.println(findIndex(new int[]{1, 2, 3, 4, 5}, 5));
        System.out.println("- - - D A V A L E B A 3 - - -");
        System.out.println(min(new int[]{7, 4, 3, 14, 6}));
        System.out.println("- - - D A V A L E B A 4 - - -");
        System.out.println(max(new int[]{4, 7, 3, 14, 6}));
    }
}