
class ReturnValue{

    int ReturnValueTest(int value){
        return value * value;

    }
    
}

public class TestReturningValue{
    public static void main(String [] args)
    {

        ReturnValue number1 = new ReturnValue();
        System.out.println("Square of 56: "+number1.ReturnValueTest(56));


    }
}