class Computer{

    String Model, ProcessorName, Brand, CreateDate, ProductCountry;
    int Serial, Version, Generation;

Computer( String model, String processor, int serial, String brand, String createdate, String productcountry, int version, int generation){
    Model = model;
    ProcessorName = processor;
    Brand = brand;
    CreateDate = createdate;
    ProductCountry = productcountry;
    Serial = serial;
    Version = version;
    Generation = generation;
        

}
void DispalyComputerInformation(){
    System.out.println("Model Name: "+Model);
    System.out.println("Processor Name: "+ProcessorName);
    System.out.println("Serial Number: "+Serial);
    System.out.println("Brand Name: "+Brand);
    System.out.println("Create Date: "+CreateDate);
    System.out.println("Production Country: "+ProductCountry);
    System.out.println("Version: "+Version);
    System.out.println("Generation Level: "+Generation);
    System.out.println("\n\n\n");

}
}

public class LastNightProjects
{
    public static void main(String[] args)
    {
        Computer computer1 = new Computer("545545", "Core i7", 3546, "HP", "15/12/2015", "Hongkong", 3, 7);
        computer1.DispalyComputerInformation();

        Computer computer2 = new Computer("5hDFBSD", "Core i5", 5456, "ASUS", "07 January 2000", "Australia", 5, 9);
        computer2.DispalyComputerInformation();

    }
}