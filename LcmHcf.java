import java.io.*;
public class LcmHcf{
   
    public static void main(String args[])throws Exception{
        int  t, n1Temp, n2Temp, lcm, gcd;
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter First number : ");
        int num1= Integer.parseInt(bf.readLine());
        System.out.print("Enter Second number : ");
        int num2= Integer.parseInt(bf.readLine());

        n1Temp = num1;
        n2Temp = num2;
 
        while (n2Temp != 0) {
            t = n2Temp;
            n2Temp = n1Temp % n2Temp;
            n1Temp = t;
        }
 
        gcd = n1Temp;
 
        /*
         * GCD(a, b) * LCM(a, b) = a*b
         */
        lcm = (num1 * num2) / gcd;
        System.out.println("n1t : " +n1Temp);
        System.out.println("n2t : " +n2Temp);
        System.out.println("n1  : " +num1);
        System.out.println("n2  : " +num2);
        System.out.println("LCM = " + lcm);
        System.out.println("HCF = " + gcd);
    }
}
    

