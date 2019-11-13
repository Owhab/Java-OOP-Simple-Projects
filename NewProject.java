class Teacher{ 
    String Name, Dept, District, Father, Mother;
    int SL, Roll, Reg;
    double Phone;

Teacher(int sl, String name, int roll, double phone)
{
    SL = sl; 
    Name = name;
    Roll = roll;
    Phone = phone;
}
Teacher(int sl, String name, String father, String mother, int roll, int reg, String dist, double phone){
    SL = sl;
    Name = name;
    Father = father;
    Mother = mother;
    Roll = roll;
    Reg = reg;
    District = dist;
    Phone = phone;

}
    void DisplayInfo(){
        System.out.println("Serial: "+SL);
        System.out.println("Name of Teacher: "+Name);
        System.out.println("Father's Name: "+Father);
        System.out.println("Moter's Name: "+Mother);
        System.out.println("Roll No: "+Roll);
        System.out.println("Registration No: "+Reg);
        System.out.println("Home District: "+District);
        System.out.println("Phone Number: "+Phone);
        System.out.println("\n\n\n");

    }


}


public class NewProject{
    public static void main(String [] args)
    {
        Teacher teacher1 = new Teacher(01, "Abdul Owhab", "Nurul AMin", "Shamsu Nahar", 939348, 860751, "Noakhali", 0.1771176606);
        teacher1.DisplayInfo();

        Teacher teacher2 = new Teacher(2, "Atikur Rahman", "Babul AKter", "Taslima Begum", 939354, 860767, "Noakhali", 0.1781773188);
        teacher2.DisplayInfo();

        Teacher teacher3 = new Teacher(3, "Zakir Hossain", 3754, 0.13587385);
        teacher3.DisplayInfo();

        






    }
}