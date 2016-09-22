package exam;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by lk on 16/9/10.
 */
public class test1 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int N=Integer.valueOf(in.nextLine());
        for(int i=0;i<N;i++){
            String [] temp=in.nextLine().split(",");
            ArrayList<Integer> arr=new ArrayList<Integer>();
            for(int j=0;j<temp.length;j++){
                arr.add(Integer.valueOf(temp[j]));
            }

            System.out.println(parseValue(arr));

        }
    }
    public static int parseValue(ArrayList<Integer> a){
        int maxValue=0;
        for(int i=a.size()-1;i>0;i=i-2){
            maxValue+=a.get(i);
        }
        return maxValue;
    }

    }

