import java.io.*;
public class Fibonacci{
    public static void main(String[] args)throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
      
        System.out.println("\n\nPrint fibonacci series with in a range:");
        System.out.println("________________________________________\n");
        System.out.print("Enter the count :");
        int count = Integer.parseInt( bf.readLine());
        int i=0,num1=0,num2=1,sum=0;
        System.out.print(" "+num1+" "+num2); //print first two digit 
        for(i=3;i<=count;i++){
            sum=num1+num2;
            num1=num2;
            num2=sum;
          System.out.print(" "+sum);
          if(i==count){System.out.println("\n__________________________________________");}
        }
             
    }
}