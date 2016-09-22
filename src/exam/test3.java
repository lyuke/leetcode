package exam;

import java.util.Scanner;

/**
 * Created by lk on 16/9/12.
 */
public class test3 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        String[] input=in.nextLine().split(" ");
        int result=reverseWord(input[0])+reverseWord(input[1]);
        int realresult=reverseWord(String.valueOf(result));
        System.out.println(realresult);
    }

    public static int reverseWord(String str){
        int result=0;
        char[] temp=str.toCharArray();
        char [] num=new char[temp.length];
        String w="";
        for (int i=temp.length-1;i>=0;i--){
            w+=temp[i];
        }
        result=Integer.valueOf(w.toString());
        return result;
    }

}
