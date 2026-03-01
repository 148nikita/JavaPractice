
import java.util.*;

public class PythagoreanTriplet {
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();

        //Largest Number
        if(((a*a) + (b*b) == (c*c))|| ((a*a) + (c*c) == (b*b)) || ((c*c) + (b*b) == a*a))
        {
            System.out.println("Yes it is a pythagorean triplets");
        }
        else {
            System.out.println("No it is not a pythagorean triplets");
        }
        //System.out .println(max);

    }
}








