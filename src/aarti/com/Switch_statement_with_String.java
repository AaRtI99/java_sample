package aarti.com;

public class Switch_statement_with_String
{
    public static void main(String[] args)
    {
        String levelString="Expert";
        int level=0;

        switch (levelString){
            case "beginner": level=1;
            break;
            case  "intermediate": level=2;
            break;
            case "expert" : level=3;
                break;
                default: level=0;
                break;


        }
        System.out.println("your lavel is " + level);

    }
}
