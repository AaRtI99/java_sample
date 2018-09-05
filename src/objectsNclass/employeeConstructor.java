package objectsNclass;

 class employeeConstructor
{
    int id;
    String name;
    float sal;

    void inser(int i, String n, float s)
    {
        id = i;
        name = n;
        sal = s;
    }

    void display()
    {
        System.out.println(id + " " + name + " " + sal);
    }
}
      class TestEmplyee
    {
        public static void main(String[] args)
        {
            employeeConstructor e1 = new employeeConstructor();
            employeeConstructor e2 = new employeeConstructor();
            employeeConstructor e3 = new employeeConstructor();

            e1.inser(123,"rikey", 1200);
            e2.inser(124, "riya", 1300);
            e3.inser(125, "tiya",1500);

            e1.display();
            e2.display();
            e3.display();
        }

    }









