


class Overload{

    int a, b, c;
    double d;


    void test(){
        System.out.println("There is no parametres in this method");

    }
    void test(int c){
        System.out.println("The value of c is: "+c);
    }
    void test(int a, int b, int c){
        int mul = a * b * c;
        System.out.println("The mutiplication of a, b and c is: "+mul);
    }
    void test(double d, double a){

        double multi = d * a;
        System.out.println("The Mutiplication of d and a is: "+multi);
    }
    void test(double a){
        System.out.println("The Double value of a: "+a);
    }
    }
    public class OverloadDemo{
        public static void main(String [] args){
            int i = 50;


            Overload object1 = new Overload();
            object1.test();

            Overload object2 = new Overload();
            object2.test(5);

            Overload object3 = new Overload();
            object3.test(5, 6, 7);

            Overload object4 = new Overload();
            object4.test(5.7, 4);

            Overload object5 = new Overload();
            object5.test(i);


            Overload object6 = new Overload();
            object6.test(7.8, 8.9);

            Overload object7 = new Overload();
            object7.test(7.9);

            



        

    }


}