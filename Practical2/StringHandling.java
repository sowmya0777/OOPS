package StringHandling;

 public class StringHandling {
     public static void main(String[] args) {
         String str1 = "Hello";
         String str2 = "World";

         // Concatenation
         String combined = str1 + " " + str2;
         System.out.println("Concatenated String: " + combined);

         // Length of string
         System.out.println("Length of str1: " + str1.length());

         // Convert to Upper and Lower case
         System.out.println("Uppercase: " + combined.toUpperCase());
         System.out.println("Lowercase: " + combined.toLowerCase());

         // Character at position
         System.out.println("Character at index 1 in str1: " + str1.charAt(1));

         // Substring
         System.out.println("Substring of combined (0-5): " + combined.substring(0, 5));

         // Compare strings
         System.out.println("Are str1 and str2 equal? " + str1.equals(str2));
     }
 }
