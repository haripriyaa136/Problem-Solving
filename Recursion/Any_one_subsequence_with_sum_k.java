//This will print only one subsequence with sum=k and if that is printed no other recursion calls are made.

import java.util.ArrayList;
public class Any_one_subsequence_with_sum_k {
    public static void main(String args[]){
    int arr[]={1,2,1};
    int k=2,sum=0;
    ArrayList<Integer> li=new ArrayList<>();
    printFirstSubsequenceWithSumK(0,arr,li,arr.length,sum,k);
    }
    //Technique to print only one answer:
    //1.Make the function's return type as boolean
    //2.In the condition inside that i>=n use return true statement if sum==k condition is satisfied.
    //3.In all the function call use return true statement if the function returns true.
    //at last a return false condition is specified
    public static boolean printFirstSubsequenceWithSumK(int i,int[] arr,ArrayList<Integer> li,int n,int sum,int k){
        if(i>=n){
            if(sum==k){
                System.out.println(li);
                return true;
            }
            else
            {
                return false;
            }
        }
        li.add(arr[i]);
        sum+=arr[i];
        if(printFirstSubsequenceWithSumK(i+1,arr,li,n,sum,k)==true){
            return true;
        }
        li.remove(li.size()-1);
        sum-=arr[i];
        if(printFirstSubsequenceWithSumK(i+1,arr,li,n,sum,k)==true){
            return true;
        }
        return false;
    }
}
