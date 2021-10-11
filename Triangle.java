import java.io.*;
import java.lang.Math;
class Calc{
 // Function to check whether triangle is Equilateral,Isosceles or Scalene
    void calc(int s1 ,int s2 , int s3)
    {
        if(s1 == s2 && s2 == s3)
        {
            System.out.println("Triangle is Equilateral !!");
        }else if ( s1 == s2 || s2 == s3 || s3 == s1)
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
    {    
         Calc c = new Calc();
         BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
         System.out.print("Enter first side of triangle : ");
         int s1=Integer.parseInt(bf.readLine()); 
         System.out.print("Enter second side of triangle: ");
         int s2=Integer.parseInt(bf.readLine()); 
         System.out.print("Enter third side of triangle : ");
         int s3=Integer.parseInt(bf.readLine());
         c.calc(s1,s2,s3);
         c.area(s1,s2,s3);
    }
}