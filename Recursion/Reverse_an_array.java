public class Reverse_an_array {
    public static void main(String args[]){
        //Reversing an array using functional way.
        int arr[]={4,5,6,7,8,9,0,1,2};

        reverse_an_array(arr,0,arr.length);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    public static void reverse_an_array(int[] arr,int i,int n){
        if(i>=n/2){
            return;
        }
        swap(arr,i,n-i-1);
        reverse_an_array(arr,i+1,n);
    }
    public static void swap(int arr[],int l,int r){
        int temp=arr[l];
        arr[l]=arr[r];
        arr[r]=temp;
    }
}
