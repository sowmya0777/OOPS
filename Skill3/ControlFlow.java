package ControlFlow;
public class ControlFlow {
     public static void main(String[] args) {
         int num = 5;

         // Conditional: if-else
         if (num > 0) {
             System.out.println("Number is positive");
         } else {
             System.out.println("Number is not positive");
         }

         // Loop: for loop (print 1 to 5)
         System.out.println("For Loop:");
         for (int i = 1; i <= 4; i++) {
             System.out.println(i);
         }

         // Loop: while loop (print 1 to 3)
         System.out.println("While Loop:");
         int j = 1;
         while (j <= 3) {
             System.out.println(j);
             j++;
         }
     }
 }