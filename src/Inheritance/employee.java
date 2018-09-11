package Inheritance;

public class employee//Is-A relationship
{
    float salary=40000;
}

class programer extends employee{
    int bonus=10000;

    public static void main(String[] args)
    {
        programer p1=new programer();
        System.out.println("programer salary:"+ p1.salary);
        System.out.println("programer bonus :"+p1.bonus);
    }

}
