package constructor;

public class CustructorOverloading //a constructor is just like a method but without return type
                                   //Constructor overloading in Java is a technique of having more than one constructor
                                  //  with different parameter lists
    //differentiated by the compiler by the number of parameters in the list and their types.
{
    int id;
    String name;
    int age;
    //creating two argument cunstructor
    CustructorOverloading(int i, String s){
        id = i;
        name= s;
    }

    //creating three arument custructor
    CustructorOverloading(int i, String s, int a){
        id= i;
        name= s;
        age= a;

    }
    void display(){
        System.out.println(id+" "+name+" "+age);
    }

    public static void main(String[] args)
    {
        CustructorOverloading s1= new CustructorOverloading(11,"pink");
        CustructorOverloading s2=new  CustructorOverloading(22,"red", 22);
        s1.display();
        s2.display();
    }

}
