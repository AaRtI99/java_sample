package objectsNclass;

public class Rectangle
{
    int length=2;
    int width=3;

    void insert(int l, int w){
        System.out.println("l : "+ l+" and  w : "+  w);
        System.out.println("length : "+ length+" and  width : "+  width);
        length=l;
        width=w;

        System.out.println("after :l : "+ l+" and  w : "+  w);
        System.out.println("after :length : "+ length+" and  width : "+  width);
    }
    void calculateArea(){
        System.out.println(length*width);
    }
}
 class TestRectangle{
     public static void main(String[] args)
     {
         Rectangle r1=new Rectangle();
//         Rectangle r2=new Rectangle();

         r1.insert(12,13);
//         r2.insert(13,14);
         r1.calculateArea();
//         r2.calculateArea();
     }

 }
