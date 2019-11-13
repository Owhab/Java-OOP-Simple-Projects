class Student{
    String Name, Department, Semester, District, SSC_group;
    int Roll, Reg, Phone;

    Student(String n, int roll, int reg, String sscgroup, String department, String semester, String district, int phone ){

        Name = n;
        Roll = roll;
        Reg = reg;
        SSC_group = sscgroup;
        Department = department;
        Semester = semester;
        District = district;
        Phone = phone;
    }

        void DisplayInformation(){
            System.out.println("Name: "+Name);
            System.out.println("Roll No: "+Roll);
            System.out.println("Registration No: "+Reg);
            System.out.println("SSC Group: "+SSC_group);
            System.out.println("Department: "+Department);
            System.out.println("Semester: "+Semester);
            System.out.println("Home District: "+District);
            System.out.println("Contact No: "+Phone);

            System.out.println("\n\n\n");


        }
   
}

public class NewProjects
{
    public static void main(String [] args)
    {
        System.out.println("Hello Java Programmers");

        Student student1 = new Student("Abdul Owhab", 939348, 860751, "Science", "Computer Engineering", "Fifth Semester", "Noakhali", 1771176606);
        student1.DisplayInformation();

        Student student2 = new Student("Sazzadur Rahman", 939353, 8605465, "Science", "Computer Engineering", "Fifth Semester", "Lakshmipur", 17346546);
        student2.DisplayInformation();

        Student student3 = new Student("Atikur Rahman", 939354, 860515, "Science", "Computer Engineering", "Fifth Semester", "Noakhali", 1781773188);
        student3.DisplayInformation();

        Student student4 = new Student("Tushar Dey", 9356685, 15545, "Science", "Management", "Sixth Semester", "Noakhali", 541546545);
        student4.DisplayInformation();


        




        }

}