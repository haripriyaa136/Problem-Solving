//This program is to count the number of subsequence with sum equals k
//For all the problem where we need to count the number of subsequence use this technique.
//here we use return 1 and return 0, where ever the condition satisfies.
public class Count_Subsequence_with_sum_K {
    public static void main(String args[]) {
        int arr[]={1,2,1};
        System.out.println(countSubsequence(0,arr,0,2,arr.length));
    }

    public static int countSubsequence(int i, int[] arr, int sum, int k, int n) {
        if (i >= n) {
            if (sum == k) {
                //If condition satisfied return 1
                return 1;
            } else {
                //If condition not satisfied return 0;
                return 0;
            }
        }
        sum+=arr[i];
        //we will collect the values in l and r variable and at last add l and r and we return them.
        int l=countSubsequence(i+1,arr,sum,k,n);
        sum-=arr[i];
        int r=countSubsequence(i+1,arr,sum,k,n);
        return l+r;
    }
}