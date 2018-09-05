package objectsNclass;

public class studentMethod// object and class initialize through method
{


    int rollno;
    String name;
  void insertRecord(int r, String n)// method created
  {
      rollno=r;
      name=n;
  }
  void displayInformation()// method created
  {
      System.out.println(rollno+" "+name);
  }

}
class studentMethod2
{
    public static void main(String[] args)
    {
        studentMethod s1= new studentMethod();// refernce variable
        studentMethod s2=new studentMethod();

        s1.insertRecord(12,"riya");// initialize through method
        s2.insertRecord(13,"priya");

        s1.displayInformation();// initialize through method
        s2.displayInformation();


    }
}
