package exam;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by lk on 16/9/13.
 */
public class baidu1 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        ArrayList<String> s=new ArrayList<String>();
        while (in.hasNextLine()){
            String value = in.nextLine();
            s.add(value);

        }
        for (String str:s){
            System.out.println(reverseColor(str));
        }

    }
    public static String reverseColor(String str){

        char [] temp=str.toCharArray();
        ArrayList<Integer> arr=new ArrayList<Integer>();

        for(int i=1;i<temp.length;i++){
            int j=0;
            if(temp[i]>=48 && temp[i]<=57){
                j=63-Integer.valueOf(temp[i]);
            }else{
                j='F'-temp[i];
            }
            arr.add(j);

        }
        String result="#";
        for(int k=0;k<arr.size();k++){
            if(arr.get(k)>=10 && arr.get(k)<=16){
                result+=(char)(arr.get(k)-10+'A');

            }else {
                result+=String.valueOf(arr.get(k));
            }
        }

        return result;
    }



}
