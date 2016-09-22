package exam;

import java.util.Scanner;

/**
 * Created by lk on 16/9/12.
 */
public class text2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] input=in.nextLine().split(" ");
        int AMinusB = Integer.valueOf(input[0]);
        int BMinusC=Integer.valueOf(input[1]);
        int AplusB=Integer.valueOf(input[2]);
        int BplusC=Integer.valueOf(input[3]);
        int A=0;
        if (isPrime((AMinusB+AplusB)/2)){
            A=(AMinusB+AplusB)/2;
        }else{
            System.out.print("No");
        }
        int B=AplusB-A;
        int C=B-BMinusC;
        int BplusC2=B+C;
        if(BplusC2 == BplusC){
            System.out.print(A);
            System.out.print(" ");
            System.out.print(B);
            System.out.print(" ");
            System.out.print(C);

        }else{
            System.out.print("No");
        }

    }

    public static boolean isPrime(double num){
        return num%1==0?true:false;
    }


}
