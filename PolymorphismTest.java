class Shape{

    void Area(){
        


    }
}

class Triangle extends Shape{
    double Base;
    double Height;

    Triangle(double Base, double Height){
        this.Base = Base;
        this.Height = Height;
    }
    @Override
    void Area(){

        double result = 0.5 * Base * Height;
        System.out.println("The Area of Triangle: "+result);

    }
}

class Rectangle extends Shape{
    double Length;
    double Width;

    Rectangle(double Length, double Width){
        this.Length = Length;
        this.Width = Width;

    }
    @Override
    void Area(){
        
        double result = Length * Width;
        System.out.println("The Area of Rectangle: "+result);
    }
}

public class PolymorphismTest{
    public static void main(String [] args){

        Shape s;
        s = new Triangle(10, 20);
        s.Area();

        s = new Rectangle(15, 25);
        s.Area();

    }
}