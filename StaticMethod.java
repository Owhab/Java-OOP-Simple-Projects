class StaticmethodDemo{

    void Owhab(){
        System.out.println("This is an example of Non- Static Method");

    }
    static void Owhab2(){
        System.out.println("This is an example of Static Method");
    }



}
public class StaticMethod{
    public static void main(String [] args)
    {
        StaticmethodDemo s1 = new StaticmethodDemo();

        s1.Owhab();
        StaticmethodDemo.Owhab2();
        


    }
}