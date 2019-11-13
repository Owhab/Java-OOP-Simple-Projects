
// Here, Box defines three 
// constructor to initiate the 
// dimentions of a box various ways. 


class Box{
    double Height, Width, Depth;

    // COnstructor used when all dimensions specified. 

    Box(double h, double w, Double d){

        Height = h;
        Width = w;
        Depth = d;
    }
    // Constructor Used, when no constructor specified. 

    Box(){
        Height = -1;    // Used -1 to initiate an uninitialized Box. 
        Width = -1;
        Depth = -1;
    }
    // COnstructor used when Cube is created. 
    Box(double len){
        Height = Width = Depth = len;

    }
    // Compute and return volume. 
    double Volume(){
        return Height * Width * Depth;
    }
}
public class ConstructorOverload{
    public static void main(String [] args){

            // Create Boxes using the different Constructor. 

        Box box1 = new Box(10.0, 20.0, 15.0);
        Box box2 = new Box();
        Box box3 = new Box(7);

        double vol = box1.Volume();
        System.out.println("The Volume of box1: "+vol);

        vol = box2.Volume();
        System.out.println("The Volume of box2: "+vol);

        vol = box3.Volume();
        System.out.println("The Volume of Cube: "+vol);

    
        
    }
}