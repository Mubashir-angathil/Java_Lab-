import java.io.*;
import java.lang.Math;
 
 class Calc{

  // Method count()
     int count(int num){
     int count=0;
     while(num!=0)
     {
         count++;
        num = num/10;}
                          
     {
     }
     return count;
     }

   // Method calc() 
    void calc(int start ,int end){ 
    
        int i,j;
    for(i=start;i<end;i++)
    {
        int sum = 0;
        int a = i;
        int b = i;

        while(a>0)
        {
            j = a % 10;
            sum += (Math.pow(j,count(i)));
            a = a/10;
        }
        if (sum==b)
         {
            System.out.println(sum);
        }

    }
   }
}
public class Amstrong{
    public static void main (String[] args)throws Exception{
    
    Calc c = new Calc();
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter a range: ");
    
    System.out.print("Begin : ");
    int start = Integer.parseInt( bf.readLine());
    System.out.print("End : ");
    int end = Integer.parseInt(bf.readLine());
    System.out.println("Amstrong numbers are :");
    c.calc(start,end);
  
   }
}