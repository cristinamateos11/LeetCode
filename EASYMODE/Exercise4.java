import java.util.Scanner;

public class Exercise4 {
    

    /**
     * Given an integer x, return true if x is a palindrome, and false otherwise.
     * 
     * Example 1:
     * Input: x = 121
     * Output: true
     * Explanation: 121 reads as 121 from left to right and from right to left
     * 
     * Example 2:
     * Input x = -121
     * Output: false
     * Explanation: -121 reads as 121-
     * 
     * @param args
     */
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

        // convertimos el numero en una cadena de caracteres
        String original = String.valueOf(x);

        // revertimos la cadena
        String reverse = new StringBuilder(original).reverse().toString();
        
        // convertimos la cadena invertida en un numero
        int reverseInt = Integer.parseInt(reverse);
        // long reverseLong = Long.parseLong(reverse);

        if (x == reverseInt) {
            return true;
        } else {
            return false;
        }

    }
}
