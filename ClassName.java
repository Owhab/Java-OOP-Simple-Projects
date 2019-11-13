class Member{

    String Name, Father, Mother, District, Religion, Country, Hobby;
    int Roll, Registration;
    double Phone, Result;

    Member(String name, int roll, int reg, String father, String mother, String religion, String district, String country, String hobby, double result, double phone){
        Name = name;
        Roll = roll;
        Registration = reg;
        Father = father;
        Mother = mother;
        Religion = religion;
        District = district;
        Country = country;
        Hobby = hobby;
        Phone = phone;
        Result = result;


        }

        Member(String name, int roll, int reg, String father, String mother, String religion, String district, String country, String hobby, double phone){
        
        Name = name;
        Roll = roll;
        Registration = reg;
        Father = father;
        Mother = mother;
        Religion = religion;
        District = district;
        Country = country;
        Hobby = hobby;
        Phone = phone;


        }
        Member(String name, int roll, int reg, String father, String mother, String religion, String district, String country, String hobby){
        Name = name;
        Roll = roll;
        Registration = reg;
        Father = father;
        Mother = mother;
        Religion = religion;
        District = district;
        Country = country;
        Hobby = hobby;

        }
        Member(String name, int roll, int reg, String father, String mother, String religion, String district, String country){
        Name = name;
        Roll = roll;
        Registration = reg;
        Father = father;
        Mother = mother;
        Religion = religion;
        District = district;
        Country = country;

        }


        Member(String name, int roll, int reg, String father, String mother, String religion, String district){
        Name = name;
        Roll = roll;
        Registration = reg;
        Father = father;
        Mother = mother;
        Religion = religion;
        District = district;

        }
        Member(String name, int roll, int reg, String father, String mother, String religion){
        Name = name;
        Roll = roll;
        Registration = reg;
        Father = father;
        Mother = mother;
        Religion = religion;
        

        }

        Member(String name, int roll, int reg, String father, String mother){
        Name = name;
        Roll = roll;
        Registration = reg;
        Father = father;
        Mother = mother;
        }

        Member(String name, int roll, int reg, String father){
        Name = name;
        Roll = roll;
        Registration = reg;
        Father = father;
        
        }

        Member(String name, int roll, int reg){
        Name = name;
        Roll = roll;
        Registration = reg;
        
        
        }
        

        Member(String name, int roll){
        Name = name;
        Roll = roll;
        
        
        }
        Member(String name){
        Name = name;
        
        
        }
        Member(){
        
        
        }

        





        void DisplayInformation(){

            System.out.println("Member's Name: "+Name);
            System.out.println("Roll No: "+Roll);
            System.out.println("Registration No: "+Registration);
            System.out.println("Father's Name: "+Father);
            System.out.println("Mother's Name: "+Mother);
            System.out.println("Religion Name: "+Religion);
            System.out.println("District Name: "+District);
            System.out.println("Country Name: "+Country);
            System.out.println("Hobby: "+Hobby);
            System.out.println("SSC Result: "+Result);
            System.out.println("Contact No: "+Phone);
            System.out.println("\n\n\n");



    }


}


public class ClassName{
    public static void main(String [] args)
    {
        Member member1 = new Member("Abdul Owhab", 939348, 860751, "Md Nurul Amin", "Shamsu Nahar Begum", "Islam", "Noakhali", "Bangldesh", "Programing", 4.44, 0.1771176606);
        member1.DisplayInformation();

        Member member2 = new Member();
        member2.DisplayInformation();

        Member member3 = new Member("Rasel Khan", 56465, 465464, "Md Jamal");
        member3.DisplayInformation();

    }
}