import java.util.*;
public class RotateANumber {
    public static void main (String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int num=scn.nextInt();
        int k = scn.nextInt();
        //no of digit of the number
        int nod =0;
        int temp =num;
        while(temp>0)
        {
            temp=temp/10;
            nod++;
        }
        k=k%nod;

        if(k<0)
        {
            k=k+nod; //if k=-1 , nod =5 , we cam also rot it by 4 will get same result.
        }
        int div=1;
        int mul=1;
        for(int i=1;i<=nod;i++)
        {
            if(i<=k)
            {
                div=div*10;
            }
            else {
                mul=mul*10;
            }
        }
        int rem=num%div;
        int q=num/div;
        int rot=rem*mul+q;
        System.out.println(rot);

    }
}
