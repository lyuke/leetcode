package exam;

import java.util.Scanner;

/**
 * Created by lk on 16/9/12.
 */
public class test4 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int input=in.nextInt();
        int count=0;
        for (int i=1;i<Math.sqrt(input);i++){
            double temp=Math.sqrt(input-i*i);
            if (isPrime(temp)){
                count+=4;
            }

        }

        if(isPrime(Math.sqrt(input))){
            count+=4;
        }
        System.out.println(count);


    }
    public static boolean isPrime(double num){
        return num%1==0?true:false;
    }


}
