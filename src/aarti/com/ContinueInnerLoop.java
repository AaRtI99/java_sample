package aarti.com;

public class ContinueInnerLoop
{
    public static void main(String[] args)
    {
        //outer loop
        for (int i=1; i<=3; i++){
            //inner loop
            for (int j=1; j<=3; j++){
             //   for (int k=1; k<=3; k++){
                if (i==4&& j==4){
                    continue;
                }System.out.println(i+""+j);
            }

        }
    }
}
