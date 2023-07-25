//This program is an example for multiple recursion calls.
public class Fibonacci_recursion {
    public static void main(String args[]){
        System.out.println(fibonacci_recur(8));
    }
    public static int fibonacci_recur(int n){
        if(n<=1){
            return n;
        }
        //First recursion call need to be completed first, only then second will get started.
        return fibonacci_recur(n-1)+fibonacci_recur(n-2);
    }


}
