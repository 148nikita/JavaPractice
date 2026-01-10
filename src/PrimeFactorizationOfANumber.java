import java.util.*;
public class PrimeFactorizationOfANumber {
    public static void main(String[] args){
        Scanner scn= new Scanner(System.in);
        int num=scn.nextInt();
        //Brute Force
//        for(int i=2;i<=num;i++)
//        {
//            while( num % i==0)
//            {
//                num=num/i;
//                System.out.println(i);
//            }
//        }
        //pq=n then p > root n and q>root...
        // these can't be together therefore run loop till root n
        // this concept doesn't work on 46, this is only num which have factor greater tha root n
        // therefore print last n number too which is 23
        // better time complexity
        for(int i=2; i*i<=num ;i++)
        {
            while ( num % i==0)
            {
                num=num/i;
                System.out.println(i);
            }
        }
        if(num !=1) // for 46 as the num is 23 now which is smaller than root 46
            //  it will come out from loop without num=1;
        {
            System.out.println(num);
        }



    }





}
