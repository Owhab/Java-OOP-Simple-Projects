//The file name of this program "OverloadingMethod.java"
// This program is about Method Overloading in Java Programing
// Author of this Program is : Abdul Owhab
class MethodOverload{
    void Test(int a, int b){
        int sum = a + b;
        int sub = a - b;
        int mul = a * b;
        double div = a / b;

        System.out.println("The Value of a: "+a);
        System.out.println("The Value of b: "+b);
        System.out.println("The Summation of a and b is: "+sum);
        System.out.println("The Subtraction of a and b is: "+sub);
        System.out.println("The Multiplication of a and b is: "+mul);
        System.out.println("The Division of a and b is: "+div);
        System.out.println("\n\n");
        

    }cd 
    void Test(double a, double b){
        double sum = a + b;
        double sub = a - b;
        double mul = a * b;
        double div = a / b;

        System.out.println("The Value of a: "+a);
        System.out.println("The Value of b: "+b);
        System.out.println("The Summation of a and b is: "+sum);
        System.out.println("The Subtraction of a and b is: "+sub);
        System.out.println("The Multiplication of a and b is: "+mul);
        System.out.println("The Division of a and b is: "+div);


    }
}

public class OverloadingMethod{
    public static void main(String []args)
    {
        MethodOverload ob1 = new MethodOverload();

        ob1.Test(20, 10);

        ob1.Test(25.20, 21.28);
        

    }
}