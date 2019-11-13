
class Contestant{
    String Name, Father, Mother, Country, Language, Occupation;
    int ID, Age, Level;

    Contestant(String name, int id, int level, String father, String mother, String country, String planguage, String occupation){

        Name = name;
        ID = id;
        Level = level;
        Father = father;
        Mother = mother;
        Country = country;
        Language = planguage;
        Occupation = occupation;
        
    }


    void DiplayInfo()
    {
        System.out.println("Name: "+Name);
        System.out.println("Identification No: "+ID);
        System.out.println("Level No: "+Level);
        System.out.println("Father's Name: "+Father);
        System.out.println("Mother's Name: "+Mother);
        System.out.println("Country Name: "+Country);
        System.out.println("Prepered Programing Language: "+Language);
        System.out.println("Occupation Level: "+Occupation);

        System.out.println("\n\n\n");

    }
}

public class JavaProgram
{
    public static void main(String [] args)
    {
        Contestant contestant1 = new Contestant("Abdul Owhab", 458754, 5, "Nurul Amin", "Shamsu Nahar", "Bangladesh", "Java", "Student");
        contestant1.DiplayInfo();

        Contestant contestant2 = new Contestant("Golam Rahman", 51654, 4, "Jamal Hossen", "Jahanar", "Bangladesh", "Kotlin", "Engineer" );
        contestant2.DiplayInfo();

        
    }
}