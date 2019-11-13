class Student{

    String Name, Department, Semester, Shift, Institute;
    int Serial, Roll, Reg, Phone;

    Student(int serial, String name, int roll, int reg, String semester, String shift, String ins){

        Serial = serial;
        Name = name;
        Roll = roll;
        Reg = reg;
        Semester = semester;
        Shift = shift;
        Institute = ins;


    }
    void DisplayInfo(){
        System.out.println("Serial: "+Serial);
        System.out.println("Name of Student: "+Name);
        System.out.println("Roll No: "+Roll);
        System.out.println("Registration No: "+Reg);
        System.out.println("Semester: "+Semester);
        System.out.println("Shift: "+Shift);
        System.out.println("Institute Name: "+Institute);
        System.out.println("\n\n\n");


    }

}
public class ConstructorConcept{
    public static void main(String [] a)
    {
        Student student1 = new Student(01, "Abdul Owhab", 939348, 860751, "Fifth", "Second", "Lakshmipur Polytechnic Institute");
        student1.DisplayInfo();

        Student student2 = new Student(02, "Rakib Hossen Hridoy", 939349, 860752, "Fifth", "Second", "Lakshmipur Polytechnic Institute");
        student2.DisplayInfo();

        
        


    }
}