class Student{
    
    String Name, Father, Mother, District, Group, Tech;
    double GPA;
    int SSC_Roll, SSC_Reg, Contact;


    Student(String name, String father, String mother, String district, double gpa, 
    String sscgroup, String diptech, int sscroll, int sscreg, int contact){
        Name = name;
        Father = father;
        Mother = mother;
        District = district;
        GPA = gpa;
        Group = sscgroup;
        Tech = diptech;
        SSC_Roll = sscroll;
        SSC_Reg = sscreg;
        Contact = contact;
    }

    void DisplaOutput()
    {
        System.out.println("Student's Name: "+Name);
        System.out.println("Father's Name: "+Father);
        System.out.println("Mother's Name: "+Mother);
        System.out.println("Home District: "+District);
        System.out.println("SSC GPA: "+GPA);
        System.out.println("SSC Group: "+Group);
        System.out.println("Admission Technology: "+Tech);
        System.out.println("SSC Roll No: "+SSC_Roll);
        System.out.println("SSC Registration No: "+SSC_Reg);
        System.out.println("Contact No: "+Contact);
        System.out.println("\n\n\n");


    }

}

    public class StudentDemo{

        public static void main(String [] args)
        {

            Student student1 = new Student("Abdul Owhab", "Md Nurul Amin", "Shamsu Nahar Begum", "Noakhali", 4.44, "Science", 
            "Computer Technology", 182431, 1311115949, 1771176606 );
            student1.DisplaOutput();

            Student student2 = new Student("Golam Rahman", "Md Ibrahim Khalil", "Nur Jahan", "Hatiya Noakhali", 5.00, "Science",
             "Civil Technology", 676865, 64654, 131634134);
             student2.DisplaOutput();




        }
}