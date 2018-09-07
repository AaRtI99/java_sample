package StaticKeyword;
 class StaticVariable
 {
     int rollno;//instance variable
     String name;
     static String collage = "ABIT";//static variable

     //constructor

     StaticVariable(int r, String n)
     {
         rollno = r;
         name = n;

     }
     //method to display the value

     void display()
     {
         System.out.println(rollno + " " + name + " " + collage);
     }
 }
    //test class to show the value of objects
    class  StaticVariable1
    {
        public static void main(String[] args)
        {
            StaticVariable s1=new StaticVariable(11, "riya");
            StaticVariable s2=new StaticVariable(12," tiya");

            // we can change the collage variable by using

            //StaticVariable.collage="CBIT";
            s1.display();
            s2.display();



        }
    }


