class Student{
    static int count = 0;

    Student(){
        count++;

    }

    void Displainfo(){
        System.out.println("Total Student: "+count);
        
    }



}

public class StaticVariable{
    public static void main(String [] args)
    {
    Student s1 = new Student();
    s1.Displainfo();

    Student s2 = new Student();
    s2.Displainfo();

    Student s3 = new Student();
    s3.Displainfo();
    }

}


