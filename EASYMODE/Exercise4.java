import java.util.Scanner;

public class Exercise4 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Exercise4 exercise4 = new Exercise4();

        System.out.println("Escribe un número: ");
        int number = scanner.nextInt();

        System.out.println("¿Es un palíndromo?: " + exercise4.isPalindrome(number));
        scanner.close();

    }

    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        String original = String.valueOf(x);
        String reverse = new StringBuilder(original).reverse().toString();
        int reverseInt = Integer.parseInt(reverse);
        // long reverseLong = Long.parseLong(reverse);

        if (x == reverseInt) {
            return true;
        } else {
            return false;
        }

    }
}
