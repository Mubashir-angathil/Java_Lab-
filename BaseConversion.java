import java.util.Scanner;

public class BaseConversion {
    // Function to print binary number
    static void printBinary(int[] binary, int id) {
        // Iteration over array
        System.out.print("Equivalent Binary Number of a Given Integer Number = ");
        for (int i = id - 1; i >= 0; i--)
            System.out.print(binary[i] + "");
    }

    // Function converting decimal to binary
    public static void decimalToBinary(int num) {
        // Creating and assigning binary array size
        int[] binary = new int[35];
        int id = 0;

        // Number should be positive
        while (num > 0) {
            binary[id++] = num % 2;
            num = num / 2;
        }

        // Print Binary
        printBinary(binary, id);
    }

    //Function converting decimal to Octal
    public static void decimalToOctal(int num){
        int i,j;
        int[] octalNumber ;
        octalNumber = new int[10];
        for(i = 0; num > 0; i++)
        {
            octalNumber[i] = num % 8;
            num = num / 8;
        }
        
        System.out.print("\n Equivalent Octal Number of a Given Integer Number =  ");
        for(j = i - 1; j >= 0; j--)  
        {
            System.out.print(octalNumber[j]);
        }
    }
    
    //Function converting decimal to HexaDecimal
    public static void decimalToHexaDecimal(int num){
           // For storing remainder
     int rem;
        
     // For storing result
     String str2=""; 
 
     // Digits in hexadecimal number system
     char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
 
     while(num>0)
     {
       rem=num%16; 
       str2=hex[rem]+str2; 
       num=num/16;
     }
     System.out.println("\nEquivalent HexaDecimal Number of a Given Integer Number = "+str2);
  
    }
    // Main Driver Code
    public static void main(String[] args) {
        // Entered number to be convert into binary
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Integer :");
        int num =sc.nextInt();

        // Calling Our Above Function
        decimalToBinary(num);
        decimalToOctal(num);
        decimalToHexaDecimal(num);
    }
}
