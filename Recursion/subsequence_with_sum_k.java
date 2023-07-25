//Subsequence with sum equals to k
// to print all the subsequence as we used in last program, here we use sum variable that we will pass through the function.
//we will add the sum and subtract the sum wherever I am adding and removing the element from the arraylist.
import java.util.ArrayList;
public class subsequence_with_sum_k {
    public static void main(String args[]){
        int arr[]={1,2,1};
        ArrayList<Integer> li =new ArrayList<>();
        int k=2,sum=0;
        print_subsequence_with_sum_K(0,arr,li,arr.length,k,sum);
    }
    public static void print_subsequence_with_sum_K(int i,int[] arr,ArrayList<Integer> li,int n,int k,int sum){
        if(i>=n){
            if(sum==k){
                System.out.println(li);
            }
            return;
        }
        li.add(arr[i]);
        sum+=arr[i];
        print_subsequence_with_sum_K(i+1,arr,li,n,k,sum);
        li.remove(li.size()-1);
        sum-=arr[i];
        print_subsequence_with_sum_K(i+1,arr,li,n,k,sum);
    }

}
