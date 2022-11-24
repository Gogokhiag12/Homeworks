import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {
    // - - - - - - - - - First Exercise - - - - - - - - -
    /*
    Function name - palindrome
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

    //  - - - - - - - - - Second Exercise - - - - - - - - -
    /*
    Function name - anagram
    Function checks if inputed words are anagrams
     */
    private static void anagram(){
        System.out.println(" - - - - - - - - - Second Exercise - - - - - - - - -");
        String firstWord, secondWord = "";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input first word: ");
        firstWord = scanner.nextLine();
        System.out.print("Input second word: ");
        secondWord = scanner.nextLine();
        if (firstWord.length() == secondWord.length()){
            System.out.println("Your words are anagrams");
        }
        else
            System.out.println("Your words are not anagrams");
    }


    public static void main(String[] args) {
        palindrome();
        anagram();
        System.out.println(" - - - - - - - - - Third Exercise - - - - - - - - - ");
        Rectangle rectangle = new Rectangle(6, 8);
        rectangle.printData();

    }
}