package ThisKeyword;

public class ThisInvokeCurrentClassMethod
{
    void m(){
        System.out.println("hello m");

    }
    void n(){
        System.out.println("hello n");
        this.m();
    }
} class testThis{
    public static void main(String[] args)
    {
        ThisInvokeCurrentClassMethod a=new ThisInvokeCurrentClassMethod();
        a.n();
    }

        }
