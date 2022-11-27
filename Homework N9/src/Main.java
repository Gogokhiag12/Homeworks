import java.security.Key;
        import java.util.HashMap;
        import java.util.Scanner;

public class Main {
    /*
    Function name - capitals
    Fuction returns countries' capitals if they are in the base
     */
    private static void capitals(){
        Scanner scanner = new Scanner(System.in);
        HashMap<String, String > countries = new HashMap<>();
        countries.put("France", "Paris");
        countries.put("Germany", "Berlin");
        countries.put("Georgia", "Tbilisi");
        countries.put("Italy", "Rome");
        countries.put("Spain", "Madrid");
        for (int i = 0; i < 100; i++) {
            System.out.println("Tell me Country And I will Tell you its capital. Click Enter To stop!");
            System.out.print("Enter Country: ");
            String country = scanner.nextLine();
            for (String countrie : countries.keySet()) {
                if (country.equals(countrie)) {
                    System.out.println("Your entered county's capital is: " + countries.get(country));
                }
            }if (country.equals(""))
                break;
        }
    }
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
        System.out.println("- - - - - - - First Exercise - - - - - - -");
        capitals();
//        System.out.println("- - - - - - - Second Exercise - - - - - - -");
//        letters();
//        System.out.println("- - - - - - - Third Exercise - - - - - - -");
//        alphabet();

    }
}