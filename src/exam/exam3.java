package exam;

/**
 * Created by lk on 16/9/6.
 */
public class exam3 {
    public static void main(String args[]){
        int [] r=new int[4];
        r[0]=2;
        r[1]=3;
        r[2]=4;
        int result[] =twoSum(r,6);
        for (int i =0;i<result.length;i++){
            System.out.print(result[i]);
        }


    }

    public static int[] twoSum(int[] numbers, int target) {
        int[] result=new int[2];
        for(int i =0;i<numbers.length-1;i++){

            for(int j =i+1;j<numbers.length;j++){
                if((numbers[i]+numbers[j]) == target){
                    result[0]=i+1;
                    result[1]=j+1;
                }
            }
        }
        return result;
    }
}
