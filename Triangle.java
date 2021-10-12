import java.io.*;
import java.lang.Math;

class Test{
 // Function to check whether triangle is Equilateral,Isosceles or Scalene
    void calc(int s1 ,int s2 , int s3)
    {
        if(s1 == s2 && s2 == s3)
        {
            System.out.println("Triangle is Equilateral !!");
        }else if (  s1 == s2 || s2 == s3 || s3 == s1)
        {
            System.out.println("Triangle is Isosceles !! ");
        }else{
            System.out.println("Triangle is Scalene !! ");
        }
        
    }
// Function to calculate area of a triangle
    void area(int s1,int s2,int s3)
    {
         int s = (s1 + s2 + s3) / 2; 
        System.out.println("Area of the Triangle : "+(Math.sqrt(s*(s-s1)*(s-s2)*(s-s3))));    
    }
}
public class Triangle{
    public static void main(String[] args)throws Exception
    {    int big,count;
         Test c = new Test();
         BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
         System.out.print("Enter first side of triangle : ");
         int s1=Integer.parseInt(bf.readLine()); 
         System.out.print("Enter second side of triangle: ");
         int s2=Integer.parseInt(bf.readLine()); 
         System.out.print("Enter third side of triangle : ");
         int s3=Integer.parseInt(bf.readLine());
         if(s1>s2&&s1>s3){
             big=s1;
             count=s2+s3;
         }else if(s2>s3)
         {
             big=s2;
             count=s1+s3;
         }else{
             big=s3;
             count=s1+s2;
         }
         if(big<count)
         {
         c.calc(s1,s2,s3);
         c.area(s1,s2,s3);
         }else{
             System.out.println("A triangle is valid if sum of its two sides is greater than the third side!!");
             System.out.println("Cant't form Triangle!!");
         }
    }
}