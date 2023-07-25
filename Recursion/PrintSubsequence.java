import java.util.Arrays;
//This method is used to print all the subsequence of an array using recursion.
import java.util.*;
public class PrintSubsequence {
    public static void main(String args[]){
        int arr[]={3,1,2};
        ArrayList<Integer> li =new ArrayList<>();
        print_subsequences(0,arr,li,arr.length);

    }
    public static void print_subsequences(int i,int[] arr,ArrayList<Integer> li,int n){
        if(i>=n){
            System.out.println(li);
            return;
        }
        //Take condition
        li.add(arr[i]);
        print_subsequences(i+1,arr,li,n);
        //Here in order to remove the last element from an arraylist we use size-1 ,bcz we dont know the index of that element in that arraylist.
        //not take condition
        li.remove(li.size()-1);
        print_subsequences(i+1,arr,li,n);

    }

    
}
