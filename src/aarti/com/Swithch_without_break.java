package aarti.com;

public class Swithch_without_break
{
    public static void main(String[] args)
    {
        int number=30;
        switch (number){
            case 10:
                System.out.println("10");
            case 20:
                System.out.println("20");
            case 30:
                System.out.println("30");
                default:
                    System.out.println("not in 10, 20 0r 30");
        }
    }
}
