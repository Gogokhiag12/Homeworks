import java.util.Scanner;

public class Main {
    // - - - - - - - - - First Exercise - - - - - - - - -
    /*
    Function name palindrome
    Function checks if inputed word is palindrome
     */
    private static void palindrome(){
        System.out.println(" - - - - - - - - - First Exercise - - - - - - - - - ");
        String original, reverse = "";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input word: ");
        original = scanner.nextLine();
        int lenght = original.length();
        for (int i = lenght - 1; i >= 0; i--){
            reverse = reverse + original.charAt(i);
        }
        if (original.equals(reverse)){
            System.out.println("Your word is palindrome");
        }
        else
            System.out.println("Your word is not palindrome");
    }


    public static void main(String[] args) {
        palindrome();

    }
}