package WrapperClasses;

public class Unboxing {

	@SuppressWarnings("removal")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Integer a=new Integer(3);    
	    int i=a.intValue();
	    int j=a;   
	    System.out.println(a+" "+i+" "+j);

	}

}