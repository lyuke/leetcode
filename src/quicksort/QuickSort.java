package quicksort;

/**
 * Created by lk on 16/9/12.
 */
public class QuickSort {

    public void quicksort(int data[],int start,int end){
        if (start == end){
            return ;
        }

        int index=partition(data, start, end);
        if(index>start) {
            quicksort(data, start, index-1);
        }
        if (index<end){
            quicksort(data,index+1,end);
        }

    }

    public int partition(int data[],int left,int right){
        int i=left;
        int j=right;
        int tmp;
        int pivot=data[(left+right)/2];

        while (i<=j) {

            while (data[i] < pivot) {
                i++;
            }
            while (data[j] > pivot) {
                j--;
            }
            if (i <= j) {
                tmp = data[i];
                data[i] = data[j];
                data[j] = tmp;
                i++;
                j--;
            }

        }

        return i;
    }






    public static void main(String[] args){
        QuickSort q=new QuickSort();
        int[] data={1,5,4,2,5,7,8};
        q.quicksort(data,0,data.length-1);
        for (int i=0;i<data.length;i++){
            System.out.print(data[i]);
        }

    }

}
