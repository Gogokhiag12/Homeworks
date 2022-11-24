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

    public static void main(String[] args) {
        System.out.println("- - - - - - - Second Exercise - - - - - - -");
        letters();
    }
}