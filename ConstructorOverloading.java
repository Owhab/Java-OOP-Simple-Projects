class Student{
    String Name, Dept, Semester, Shift, Session;
    int Roll, Reg, SL;


    Student()
    {

        
    }
    Student(int sl, String name, String dept)
    {
        SL = sl;
        Name = name;
        Dept = dept;


    }
    Student(int sl, String name, int roll, int reg, String semester, String shift, String session)
    {
        SL = sl;
        Name = name;
        Roll = roll;
        Reg = reg;
        Semester = semester;
        Shift = shift;
        Session = session;

    }
    void DisplaInformation()
    {
        System.out.println("Serial No: "+SL);
        System.out.println("Name: "+Name);
        System.out.println("Roll No: "+Roll);
        System.out.println("Registration No: "+Reg);
        System.out.println("Semester: "+Semester);
        System.out.println("Shift"+Shift);
        System.out.println("Session: "+Session);
        System.out.println("\n\n\n");

    }


}



public class ConstructorOverloading{

    public static void main(String [] args)
    {
        Student student1 = new Student();
        student1.DisplaInformation();

        Student student2 = new Student(02, "Tareq Mahmud", "Physics");
        student2.DisplaInformation();

        Student student3 = new Student(03, "Abdul Owhab", 939348, 860751, "Fifth", "Second", "2017- 18");
        student3.DisplaInformation();
        
    }
}