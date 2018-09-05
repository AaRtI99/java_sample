package aarti.com;

public class Switch_statement
{
    public static void main(String[] args)
    {
        int month=4;
        String monthString="";

        switch (month) {
            case 1:
                monthString = "1-jan";
                break;
            case 2:
                monthString = "2-fab";
                break;
            case 3:
                monthString = "3-mar";
                break;
            case 4:
                monthString = "4-apr";
                break;
            case 5:
                monthString = "5-may";
                break;
            case 6:
                monthString = "6-jun";
                break;
            case 7:
                monthString = "7-jul";
                break;
            case 8:
                monthString = "8-aug";
                break;
            default:
                System.out.println("invalid month!");
        }
        System.out.println(monthString);


        }
    }

