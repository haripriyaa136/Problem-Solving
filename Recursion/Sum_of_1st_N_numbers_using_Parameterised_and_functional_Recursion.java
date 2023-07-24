/*There are two ways in which recursion can be executed.
Parameterised and Functional way.
Parameterised way is that we carry the parameter till we print it at the end.
In functional way we will split the work into small stuffs and we will do.
Print sum of numbers till n using the both way
 */

public class Sum_of_1st_N_numbers_using_Parameterised_and_functional_Recursion {
    public static void main(String args[]){
        //parameterized way
        System.out.println("Output for sum of numbers till n using parameterized way");
        parameterised_sum(5,0);
        //functional way
        System.out.println("Output for sum of numbers till n using functional way");
        System.out.println(functional_sum(5));
    }
    public static void parameterised_sum(int i,int sum){
        //Here we can also have i=1 and we need to n in order to compare in the base condition.So we need to pass n to the function in order to avoid that we pass n as i and we decrement till 0.
        if(i<=0){
            System.out.println(sum);
            return;
        }
        parameterised_sum(i-1,sum+i);
    }
    public static int functional_sum(int n){
        if(n==0){
            return 0;
        }
        return n+ functional_sum(n-1);
    }
}
