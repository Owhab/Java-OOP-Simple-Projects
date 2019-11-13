
class ReturningValue{


    int ReturningValu(int value){

        return value * value;


    }
}


public class ReturnValue{
    public static void main(String [] args)
    {

        ReturningValue number1 = new ReturningValue();

        System.out.println("Square of 5 : "+number1.ReturningValu(5));

        ReturningValue number2 = new ReturningValue();
        System.out.println("Square of 468786: "+number2.ReturningValu(468756));

        ReturningValue number3 = new ReturningValue();
        System.out.println("Square of 54: "+number3.ReturningValu(54));






    }
}
