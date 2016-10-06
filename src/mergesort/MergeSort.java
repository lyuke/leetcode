package mergesort;

/**
 * Created by lk on 2016/10/6.
 */
public class MergeSort {



    public void merge(int data[],int left,int center,int right){
        int[] tempArr=new int[data.length];
        int mid=center+1;

        int third=left;
        int temp=left;

        while (left<=center && mid<=right){
            if(data[left]<=data[mid]){
                tempArr[third++]=data[left++];
            }else {
                tempArr[third++]=data[mid++];
            }
        }
        while (mid <= right){
            tempArr[third++]=data[mid++];
        }
        while (left <= center){
            tempArr[third++]=data[left++];
        }

        while (temp <= right) {
            data[temp] = tempArr[temp++];
        }


    }


    public void sort(int[] data,int left,int right){
        if(left<right){
            int center=(left+right)/2;
            sort(data,left,center);
            sort(data,center+1,right);
            merge(data,left,center,right);
        }
    }


    public void mergesort(int[] data){
        sort(data,0,data.length-1);
    }



    public static void main(String[] args){
        int a[]={49,38,65,97,76,13,27,49,78,34,12,64,5,4,62,99,98,54,56,17,18,23,34,15,35,25,53,51};
        new MergeSort().mergesort(a);
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+",");
        }
    }
}
