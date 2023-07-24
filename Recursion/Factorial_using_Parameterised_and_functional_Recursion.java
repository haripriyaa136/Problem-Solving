public class Factorial_using_Parameterised_and_functional_Recursion {
    public static void main(String args[]){
        //factorial using parameterised way.
        System.out.println("Factorial using parameterised way");
        fact_parameterised(5,1);

        //factorial using functional way.
        System.out.println("Factorial using functional way");
        System.out.println(fact_functional(5));
    }
    public static void fact_parameterised(int n,int fact){
        if(n==1){
            System.out.println(fact);
            return;
        }
        fact_parameterised(n-1,fact*n);
    }
    public static int fact_functional(int n){
        if(n==1){
            return 1;
        }
        return n*fact_functional(n-1);
    }
}
