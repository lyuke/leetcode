package xiaomi;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by lk on 2016/9/23.
 */
public class xiaomi1 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        while(in.hasNext()){
            String value=in.nextLine();
            String[] word=value.split(" ");
            String result="";
            for(int i =word.length-1;i>=1;i--){
                result+= word[i]+" ";
            }
            result+=word[0];
            System.out.print(result);
        }


    }
}
