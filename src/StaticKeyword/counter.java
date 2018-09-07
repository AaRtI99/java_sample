package StaticKeyword;

public class counter
{
   static int count=0;// without static keyword op will be 1 1

    counter(){
        count++;
        System.out.println(count);
    }

    public static void main(String[] args)
    {
        counter c1=new counter();
        counter c2= new counter();
    }
}
