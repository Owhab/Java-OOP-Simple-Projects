class Test{
    int a, b;
    Test(int i, int j){

        a = i;
        b = j;

    }
    void meth(Test o){
        o.a *= 2;
        o.b /= 2;

    }
}


public class ArgumentsPassing{
    public static void main(String [] args){

        Test ob = new Test(15, 20);

        System.out.println("ob.a and ob.b: "+ob.a+ " "+ob.b);

        System.out.println("Hello World");
        

    }
}