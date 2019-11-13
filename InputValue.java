import java.util.*;


class InputValue{
    public static void main(String [] args)
    {   
        Scanner in = new Scanner(System.in);

        int a, b, sum, sub, mul;

        System.out.print("Please enter the value of a: ");
        a = in.nextInt();

        System.out.print("Please enter the value of b: ");
        b = in.nextInt();


        sum = a + b;
        System.out.println("Summation is: "+sum);

        sub = a - b;
        System.out.println("Subtraction is: "+sub);

        mul = a * b;
        System.out.println("Multiplication is: "+mul);
        





    }
}