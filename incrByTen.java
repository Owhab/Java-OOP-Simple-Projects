
class Test{
    int a;
    
    Test(int i){
        a = i;

    }

    Test returnOb(){
        Test temp = new Test(a + 10);
        return temp;


    }


}



public class incrByTen{
    public static void main(String [] args)
    {
        Test object1 = new Test(2);
        Test object2;
        object2 = object1.returnOb();

        System.out.println("Object1.a: "+object1.a);
        System.out.println("Object2.a: "+object2.a);

        object2 = object2.returnOb();

        System.out.println("Object2.a after second increase :"+object2.a);
        





    }
}