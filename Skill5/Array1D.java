package Arrays;
public class Array1D
{

    public static void main(String[] args) 
    {
        int[] marks = {85, 90, 75, 88};

        for (int i = 0; i < marks.length; i++) 
        {
            System.out.println("Mark " + (i + 1) + ": " + marks[i]);
        }
    }
}