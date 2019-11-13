class Test{
    int a;

    Test(int i){
        a = i;

    }
    Test returnObject(){
        Test temp = new Test(a + 10);
        return temp;

    }
}

public class incrByTenTest{
    public static void main(String [] args)
    {

        Test object1 = new Test(2);
        Test object2;

        object2 = object1.returnObject();

        System.out.println("Object1.a: "+object1.a);
        System.out.println("Object2.a: "+object2.a);

    }
}