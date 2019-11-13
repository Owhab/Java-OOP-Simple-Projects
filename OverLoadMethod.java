class Test{

    void OverLoad(){
        System.out.println("No Parameters");
        System.out.println("\n\n");

    }
    void OverLoad(int a){
        System.out.println("The Value of a: "+a);

    }
    void OverLoad(int a, int b){
        int sum = a + b;
        int sub = a - b;
        int mul = a * b;
        double div = a / b;
        System.out.println("Summation of a and b is: "+sum);
        System.out.println("Subtraction of a to b is: "+sub);
        System.out.println("Multiplication of a and b is: "+mul);
        System.out.println("Division of a and b is: "+div);
        System.out.println("\n\n");

    }

    void OverLoad(double a, double b){
        double sum = a + b;
        double sub = a - b;
        double mul = a * b;
        double div = a / b;
        System.out.println("Summation of double a and b is: "+sum);
        System.out.println("Subtraction of double a to b is: "+sub);
        System.out.println("Multiplication of double a and b is: "+mul);
        System.out.println("Division of double a and b is: "+div);
        System.out.println("\n\n");


    }

}

public class OverLoadMethod{
    public static void main(String [] args)
    {
        Test object1 = new Test();


        // double result;


        object1.OverLoad();
        object1.OverLoad(10);
        object1.OverLoad(50, 5);
        object1.OverLoad(15.0, 5.0);
        
        
    }
}