import java.security.Key;
        import java.util.HashMap;
        import java.util.Scanner;

public class Main {

    /*
    Function name - letters
    Fuction returns Upper letters
     */
    private static void letters(){
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        while (i < 100){
            System.out.println("Enter # to stop; ");
            System.out.print("Enter letter: ");
            String letter = scanner.nextLine();
            if (letter.equals("#")){
                break;
            }
            System.out.println(letter + " -> " + letter.toUpperCase());
            i++;
        }
    }
    /*
    Function name - alphabet
    Fuction returns inputed letter's number in alphabet
     */
    private static void alphabet(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input Letter: ");
        char letter = scanner.next().charAt(0);
        int alphabet = letter - 'a';
        System.out.print("Your letter is " + (alphabet + 1) + " in alphabet");
    }

    public static void main(String[] args) {
//        System.out.println("- - - - - - - Second Exercise - - - - - - -");
//        letters();
        System.out.println("- - - - - - - Third Exercise - - - - - - -");
        alphabet();

    }
}