package sort;

/**
 * Created by lk on 2016/10/4.
 */
public class selectSort {

    public void selectSort(int a[]){

        for(int i =1;i<a.length;i++){
            int temp=a[i];
            int j;
            for(j=i-1;j>=0&&a[j]>temp;j--){
                a[j+1]=a[j];
            }
            a[j+1]=temp;
        }
    }

    public static void main(String args[]){
        System.out.println("select sort");
        int[] a={2,3,4,5,6,1,7};
        new selectSort().selectSort(a);
        for (int i :a){
            System.out.print(i);
        }

    }
}
