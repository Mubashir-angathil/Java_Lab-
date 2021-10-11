import java.io.*;

class Calc{
    int num , rev,sum=0,f=0;
//Constructure     
    Calc()
    {
        System.out.println("____Sum of digit & reverse of number____");
        System.out.print("Enter a number : ");
    }

 // Method for Calc
    void sumRev (int num){
        while (num>0){
            rev=num%10;
            sum+=rev;
            f=f*10+rev;
            num/=10;
        }
        System.out.println("Sum of the number is : "+sum+"\nReverse of the number is : "+f);
    } 
}
//Main 
public class SumOfDigit{
    public static void main(String args[])throws Exception{
        Calc c=new Calc();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bf.readLine());
        c.sumRev(num);
    }
} 