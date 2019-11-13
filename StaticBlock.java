class StaticBlockTest{
    static int Roll;
    static String Name;
    static double Number;


    static{
        Roll = 939348;
        Name = "Abdul Owhab";
        Number = 0.1771176606;

    }

    static void DisplayInfo(){
        System.out.println("Roll No: "+Roll);
        System.out.println("Name: "+Name);
        System.out.println("Contact Number: "+Number);

    }

}


public class StaticBlock{
    public static void main(String [] args)
    {
        StaticBlockTest.DisplayInfo();


    }
}