package StaticKeyword;

 class StaticMethod
{
    static int cube(int x){
       return x*x*x;
   }

    public static void main(String[] args)
    {
      int result=StaticMethod.cube(7);

        System.out.println(result);
    }


}
