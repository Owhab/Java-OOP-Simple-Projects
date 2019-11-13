class Factorial{
    int n, result;

    int Fact(int n){
        if(n == 1)
        return 1;
        else 
        return result;
        result = n * fact(n - 1);

            
    }
}

public class Recursion-Factorial{
    public static void main(String [] args)
    {
        Factorial f = new Factorial();

        System.out.println("The Factorial of 3 is: "+f.Fact(3));


    }
}