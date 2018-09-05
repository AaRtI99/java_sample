package objectsNclass;

public class student//example of initializing objet through referance variable
{
    int id;
    String name;
}

class Student1{

    public static void main(String[] args)
    {
        student s1= new student();
        s1.id=101;
        s1.name="tpoint";

        System.out.println(s1.id+ " " +s1.name);


    }
}
