package Inheritance;

public class Animal//single inheritance
{
    void eat(){
        System.out.println("eating.....");
    }
}
class dog extends Animal{
    void bark(){
        System.out.println("barking....");
    }
}
   class TestInheritance{
       public static void main(String[] args)
       {
           dog d1=new dog();
           d1.bark();
           d1.eat();

       }
   }
