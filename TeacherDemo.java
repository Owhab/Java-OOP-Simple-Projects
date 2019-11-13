class Teacher{

    String Name, Dept, Semester, Shift;
    int roll, reg, phone;

    Teacher(String name, String dept, String sem, String sh, int ro, int re, int ph){
        Name = name;
        Dept = dept;
        Semester = sem;
        Shift = sh;
        roll = ro;
        reg = re;
        phone = ph;
    }
   
    void DisplaInformation()
    {
        System.out.println("Name: "+Name);
        System.out.println("Department: "+Dept);
        System.out.println("Semester: "+Semester);
        System.out.println("Shift: "+Shift);
        System.out.println("Roll No: "+roll);
        System.out.println("Registration No: "+reg);
        System.out.println("Phone Number: "+phone);
        System.out.println("\n\n\n");

    }
}
    

    public class TeacherDemo{
    public static void main(String [] args)
    {

        Teacher teacher1 = new Teacher("Owhab", "Computer Tecnology", "Fifth", "Second", 939348, 860751, 1771176606);
        teacher1.DisplaInformation();

        Teacher teacher2 = new Teacher("Awolad", "Civil Technology", "Third", "Second", 165464, 15456, 1674455656);
        teacher2.DisplaInformation();






    }
}