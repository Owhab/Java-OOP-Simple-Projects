class Bike{
    boolean Power;
    int Speed;

    void Start(){
        Power = true;
        Speed = 0;


    }
    void Stop(){
        Power = false;
        Speed = 0;



    }
    void Accelerate(int newSpeed){
        Speed = newSpeed;

    }
    void PrintState(){
        System.out.println("Current State");
        System.out.println("Power: "+Power);
        System.out.println("Speed: "+Speed);

    }

}

public class ClassandObject{
    public static void main(String [] args)
    {
        Bike bike1, bike2;

        bike1 = new Bike();
        bike2 = new Bike();

        bike1.Start();
        bike2.Start();


        bike1.Accelerate(50);

        bike1.PrintState();
        bike2.PrintState();



    }
}