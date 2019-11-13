class Test{
    int a, b;
    Test(int i, int j){
        a = i;
        b = j;
    }

    boolean equalTo(Test o){
        if(o.a == a && o.b == b) return true;
        else return false;
    }
}

public class ObjectAsParameter{
    public static void main(String [] args )
    {

        Test object1 = new Test(100, 50);
        Test object2 = new Test(100, 50);
        Test object3 = new Test(15, 20);
        Test object4 = new Test(15, 20);


        System.out.println("Object1 = Object2: "+object1.equalTo(object2));
        System.out.println("Object1 = Object3: "+object1.equalTo(object3));
        System.out.println("Object3 = Object4: "+object3.equalTo(object4));
        


    }
}