class Teacher{

    String Name, Father, Mother, District, Department, College;
    
    Teacher(String name, String father, String mother, String district, String department, String college){
        Name = name;
        Father = father;
        Mother = mother;
        District = district;
        Department = department;
        College = college;

    }
    
    void DisplayInfo(){

        System.out.println("Name of Teacher: "+Name);
        System.out.println("Father's Name: "+Father);
        System.out.println("Mother's Name: "+Mother);
        System.out.println("District Name: "+District);
        System.out.println("Name of Department: "+Department);
        System.out.println("Name of College: "+College);
        System.out.println("\n\n\n");

        
    }

}


public class StaticKeyword{
    public static void main(String [] args)
    {
        Teacher teacher1 = new Teacher("Abdul Owhab", "Md Nurul Amin", "Shamsu Naher Begum", "Noakhali", "Computer Engineering and Technology", "Lakshmipur Polytechnic Instiutute");
        teacher1.DisplayInfo();

        Teacher teacher2 = new Teacher("Golam Rahman", "Jamal Hossain", "Jahanara Begum", "Noakhali", "Civil Technology", "Lakshmipur Polytecnic Institute");
        teacher2.DisplayInfo();



        

    }
}