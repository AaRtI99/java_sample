package constructor;

public class ParameterizedCustructor
{
    int id;
    String name;
//creating parameterized constructor
    ParameterizedCustructor(int i, String n){
        id=i;
        name=n;

    }
    void display(){
        System.out.println(id+" "+name);
    }

    public static void main(String[] args)
    {
        ParameterizedCustructor p1=new ParameterizedCustructor(111,"riya");
        ParameterizedCustructor p2=new ParameterizedCustructor(222,"priya");

        p1.display();
        p2.display();
    }
}

