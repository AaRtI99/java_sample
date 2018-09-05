package aarti.com;

public class If_else_if_statement
{
    public static void main(String[] args)
    {
        int marks=55;
        if (marks<50){
            System.out.println("fail...");
        }else if (marks>50 && marks<60){
            System.out.println("D grade..");
        }else if (marks>60 && marks<70){
            System.out.println("c grade..");
        }else if (marks>70 && marks<80){
            System.out.println("B grade..");
        }else {
        System.out.println("invalid");
    }
}}
