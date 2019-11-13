class Factorial{
    int n, Result;
    int Fact(int n){
        if(n == 1) return 1;
        Result = n * Fact(n - 1);
        return Result;

    }
}

public class Recursion_Factorial{
    public static void main(String [] args){
        Factorial f = new Factorial();

        System.out.println("The Factorial of 15 is: "+f.Fact(15));

    }
}