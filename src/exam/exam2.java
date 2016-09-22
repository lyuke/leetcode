package exam;

import java.util.Scanner;

/**
 * Created by lk on 16/9/6.
 */
public class exam2 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String string = in.nextLine();
        System.out.print(parserString(string));

    }


    public static String parserString(String s){
        StringBuilder result=new StringBuilder();
        char[] strs =s.toCharArray();
        for(int i =0;i<strs.length;i++){
            if (strs[i]>='A' && strs[i]<='Z'){
                result.append(strs[i]);
            }
        }
        return result.toString();
    }
}
