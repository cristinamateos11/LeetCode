import java.util.Arrays;
import java.util.Scanner;

public class Exercise2 {
    
    /**
     * Given two strings, return true if secondString is an anagram of firstString, and false otherwise
     * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
     * 
     * Example 1:
     * Input: firstString = "anagram", secondString = "nagaram"
     * Output: true
     * 
     * Example 2:
     * Input: firstString = "cat", secondString = "car"
     * Output: false
     * 
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the First String: ");
        String firstString = scanner.nextLine();

        System.out.println("Enter the Second String: ");
        String secondString = scanner.nextLine();

        Exercise2 exercise2 = new Exercise2();
        System.out.println("Is an Anagram: " + exercise2.isAnagram(firstString, secondString));

        scanner.close();
    }

    /**
     * Método que verifica si 2 cadenas son anagramas
     * 
     * @param firstString La primera cadena para comparar.
     * @param secondString La segunda cadena para comparar.
     * @return {@code true} si las cadenas son anagramas entre sí, {@code false} en caso contrario.
     */
    public boolean isAnagram(String firstString, String secondString) {
        if (firstString.length() != secondString.length()) {
            return false;
        }

        // convertimos las cadenas en un array de caracteres separados
        char[] firstStringArray = firstString.toCharArray();
        char[] secondStringArray = secondString.toCharArray();

        // los ordenamos por orden alfabetico
        Arrays.sort(firstStringArray);
        Arrays.sort(secondStringArray);

        // comparamos los arrays ya ordenados
        return Arrays.equals(firstStringArray, secondStringArray);
    }
}
