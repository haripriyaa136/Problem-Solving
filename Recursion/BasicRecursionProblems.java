/*  24/7/2023
Problem Solving - Recursion
Basic Problems in Recursion - Lecture 2:
1.Printing name N times using Recursion
2.Printing numbers linearly from 1 to N using Recursion.
3.Printing numbers from N to 1 using Recursion.
4.Printing 1 to N using BackTracking
5.Printing N to 1 using BackTracking
* */
public class BasicRecursionProblems {
    public static void main(String args[]){
        //Printing name N times using Recursion
        System.out.println("Output for printing my name n times");
        PrintNameNTimes(1,3);// This function call will print my name N times

        //Printing numbers linearly from 1 to n using Recursion.
        System.out.println("Output for printing numbers linearly from 1 to N");
        PrintNumbersFrom1ToN(1,3);

        //Printing numbers from N to 1 using Recursion.
        System.out.println("Output for Printing numbers linearly from N to 1");
        printNumbersFromNto1(3,3);

        //Printing 1 to N using BackTracking
        System.out.println("Output for printing numbers from 1 to n using BackTracking");
        Backtracking1ToN(3,3);

        //Printing N to 1 using BackTracking
        System.out.println("Output for Printing N to 1 using BackTracking");
        BacktrackingNTo1(1,3);
    }
    public static void PrintNameNTimes(int i,int n){
        //This method is for printing my name N times
        if(i>n){ //This is my base condition
            return ;
        }
        System.out.println("Haripriyaa");
        //In this step we can use i++; and in next line we can call like PrintNameNTimes(i,n); but we prefer calling the function by incrementing inside the parameter.
         PrintNameNTimes(i+1,n);
    }
    public static void PrintNumbersFrom1ToN(int i,int n){
        //This method is to print numbers from 1 to N using Recursion
        if(i>n){
            return;
        }
        System.out.println(i);
        PrintNumbersFrom1ToN(i+1,n);
    }

    public static void printNumbersFromNto1(int i,int n){
        //This method is to print numbers from N to 1 using Recursion
        if(i<=0){
            return;
        }
        System.out.println(i);
        printNumbersFromNto1(i-1,n);
    }
    //In Backtracking we make sure that the print statement of the last function call is executed first
    // by making the print statement comes after the function call.
    public static void Backtracking1ToN(int i,int n){
        //This method will print 1 to N using Backtracking.
        if(i<=0){
            return;
        }
        Backtracking1ToN(i-1,n);
        System.out.println(i);
    }

    public static void BacktrackingNTo1(int i,int n){
        //This method is to print numbers from N to 1 using Backtracking
        if(i>n){
            return;
        }
        BacktrackingNTo1(i+1,n);
        System.out.println(i);
    }
}


