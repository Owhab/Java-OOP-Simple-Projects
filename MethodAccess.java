
class Student{
    

    void Display1(){
        System.out.println("This is an Example of Non Static Method");
    }

    static void Display2(){
        System.out.println("This is an Example of Static Method");
    }


}



public class MethodAccess{
    public static void main(String [] args)
    {
        Student s1 = new Student();
        s1.Display1();

        System.out.println();

        Student s2 = new Student();
        Student.Display2();
        




    }
}