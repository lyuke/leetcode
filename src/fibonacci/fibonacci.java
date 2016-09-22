package fibonacci;

import java.util.Scanner;

/**
 * Created by lk on 16/9/12.
 */
public class fibonacci {

    public static void main(String args[]){
        Scanner in =new Scanner(System.in);
        int value=in.nextInt();
        System.out.print(fibonacci(value));


    }

    public static  int fibonacci(int n){
        int result=0;
        if (n<2){
            return 1;
        }
        int one=1;
        int last=1;
        int lastToNext=1;
        for (int i=2;i<n;i++){
            result=last+lastToNext;
            lastToNext=last;
            last=result;
        }

        return result;
    }

}
