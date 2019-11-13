
class Student{
    int ID, Roll, Reg;
    static String Department = "Computer Technology";
    static String Institute = "Lakshmipur Polytechnic Institute";
    String Name, Father, Mother, District;

    Student(int id, String name, int roll, int reg,  String father, String mother, String district){

        ID = id;
        Name = name;
        Roll = roll;
        Reg = reg;
        Father = father;
        Mother = mother;
        District = district;



    }

    void DisplayInfo(){
        System.out.println("Id No: "+ID);
        System.out.println("Name: "+Name);
        System.out.println("Roll: "+Roll);
        System.out.println("Reg: "+Reg);
        System.out.println("Department Name: "+Department);
        System.out.println("Father's Name: "+Father);
        System.out.println("Mother's Name: "+Mother);
        System.out.println("District Name: "+District);
        System.out.println("Institute Name: "+Institute);

        System.out.println("\n\n");


    }



}


public class StaticKeywordDemo{
    public static void main(String [] args)
    {
        Student s1 = new Student(01, "Abdul Owhab", 939348, 860751, "Nurul AMin", "Shamsu Nahar Begum", "Noakhali");
        s1.DisplayInfo();

        Student s2 = new Student(02, "Atikur Rahman", 939354, 860759, "Babul Akter", "Taslima Begum", "Noakhali");
        s2.DisplayInfo();




    }
}