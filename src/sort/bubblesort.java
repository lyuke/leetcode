package sort;

/**
 * Created by lk on 2016/10/1.
 */
public class bubblesort {

    public void bubble(int a[]){
        for(int i =0;i<a.length-1;i++){
            for (int j=1;j<a.length-i;j++){
                if (a[j-1]>a[j]){
                    int temp=a[j-1];
                    a[j-1]=a[j];
                    a[j]=temp;
                }
            }
        }
    }



    public static void main(String args[]){
        int[] a={2,3,4,5,6,1,7};
        new bubblesort().bubble(a);
        for (int i :a){
            System.out.print(i);
        }

    }
}
