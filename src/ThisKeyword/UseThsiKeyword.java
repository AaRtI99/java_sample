package ThisKeyword;

public class UseThsiKeyword
{
    int rollno;
    String name;
    float fee;

    UseThsiKeyword(int rollno, String name, float fee)
    {
        this.rollno = rollno;
       this.name = name;
        this.fee = fee;
    }

    void display()
    {
        System.out.println(rollno + " " + name + " " + fee);
    }
}
    class UseThsiKeyword1{
        public static void main(String[] args)
        {
            UseThsiKeyword s1=new UseThsiKeyword(111, "prince", 2000);
            UseThsiKeyword s2=new UseThsiKeyword(123,"riya", 2100);

            s1.display();
            s2.display();
        }
    }

