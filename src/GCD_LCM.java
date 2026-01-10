import java.util.*;
public class GCD_LCM {
    public static void main (String[] args)
    {
        Scanner scn= new Scanner(System.in);
        int num1=scn.nextInt();
        int num2=scn.nextInt();
        int onum1=num1;
        int onum2=num2;
        while(num1 % num2!=0)
        {
            int rem=num1 % num2;
            num1=num2;
            num2=rem;
        }
        int gcm=num2;
        int lcm=(onum1 * onum2 )/gcm; //formula
        System.out.println(gcm);
        System.out.println(lcm);
    }

}
