package ThisKeyword;

public class This2//this: to pass as an argument in the method
{
    void m(This2 obj){
        System.out.println("method is invoked");
    }
    void p(){
        m(this);
}

    public static void main(String[] args)
    {
        This2 s1=new This2();
        s1.p();
    }
}
