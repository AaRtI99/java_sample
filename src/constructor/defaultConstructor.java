package constructor;

public class defaultConstructor
{
    int id;
    String name;

    void display(){
        System.out.println(id+" "+name);
    }
        public static void main(String[] args)
        {
            defaultConstructor d1= new defaultConstructor();
            defaultConstructor d2 =new defaultConstructor();

           d1.display();
           d2.display();

        }
    }


