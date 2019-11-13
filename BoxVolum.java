class Box{
    double height, width, depth;

    Box(double height, double width, double depth){
        this.height = height;
        this.width = width;
        this.depth = depth;

    }
    void displayVol(){
        double vol = height * width * depth;
        System.out.println("Volum is: "+vol);

    }

}
public class BoxVolum{
    public static void main(String [] args)
    {
        Box box1 = new Box(10, 10, 10);
        box1.displayVol();

        Box box2 = new Box(20, 30, 10);
        box2.displayVol();


    }
}