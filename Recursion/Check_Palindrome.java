public class Check_Palindrome {
    public static void main(String args[]) {
        //Check if an array is palindrome or not using Recursion
        System.out.println("Checking for Palindrome or Not");
        int nums[]={66,77,22,77,66};
        System.out.println(palindrome_recur(nums,0,nums.length));
    }
        public static boolean palindrome_recur(int arr[],int a,int n){
            if(arr[a]!=arr[n-a-1]){
                return false;
            }
            if(a>=n-a-1){
                //If this condition reaches then it is a palindrome.Bcz all elements are checked from first to mid.
                return true;
            }
            return palindrome_recur(arr,a+1,n);
        }
}
