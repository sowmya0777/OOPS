package TypeCasting;

public class ExplicitTypeCasting {

 public static void main(String[] args) {
  // TODO Auto-generated method stub
  double decimalNumber = 6.69;
        int wholeNumber;
 
        // Explicit casting from double to int
        wholeNumber = (int) decimalNumber;

        System.out.println("Double value: " + decimalNumber);
        System.out.println("Integer value after casting: " + wholeNumber);
 }

}