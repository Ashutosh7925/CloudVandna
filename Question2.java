import java.util.Arrays;
import java.util.Scanner;

public class Main {
    
    public static boolean areAnagrams(String str1, String str2) {
        // Remove spaces and convert to lowercase for case insensitivity
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();
        
        // length is not same thenno need to check
        if (str1.length() != str2.length()) {
            return false;
        }
        
        // Convert strings to character arrays and sort them
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        
        // Compare sorted arrays
        return Arrays.equals(charArray1, charArray2);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine();
        
        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine();
        
        // here no need to take another variable... 
        System.out.println(areAnagrams(str1, str2));
        
        scanner.close();
    }
}