import java.util.*;

public class BenjaminBulbs {

    public static void main (String[] args) {
        Scanner scn= new Scanner(System.in);
        int n= scn.nextInt();
        //by factor... normal number has even  no of factors but perfect sqaure num like
        // 1,4,9,16 have odd number of factors that's why will be on

        for(int i=1; i*i<=n;i++)
        {
            System.out.println(i*i);
        }


    }
}
