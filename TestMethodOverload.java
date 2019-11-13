class TestOverload{
    void Test(){
        System.out.println("There is no parameter");
        System.out.println("\n\n");
    }
    void Test(int a){
        System.out.println("The Square of a: "+a * a);

    }
    void Test(int a, int b){
        int sum = a + b;
        int sub = a - b;
        int mul = a * b;
        double div = a / b;
        
        System.out.println("The summation of a and b is:"+sum);
        System.out.println("The Subtratcion of a to b is: "+sub);
        System.out.println("The Multiplication of a and b is: "+mul);
        System.out.println("The Division of a and b is: "+div);
    }
    void Test(double a, double b){
        double sum = a + b;
        double sub = a - b;
        double mul = a * b;
        double div = a / b;
        
        System.out.println("The summation of a and b is:"+sum);
        System.out.println("The Subtratcion of a to b is: "+sub);
        System.out.println("The Multiplication of a and b is: "+mul);
        System.out.println("The Division of a and b is: "+div);
    }
}

public class TestMethodOverload{
    public static void main(String [] args){
        
        TestOverload ob1 = new TestOverload();

        ob1.Test();
        ob1.Test(4);
        ob1.Test(5, 8);



        
    }
}