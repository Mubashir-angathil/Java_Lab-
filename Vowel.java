import java.io.*;
// Java Program to Delete Vowels from String
public class Vowel {
    public static void main(String args[])throws Exception {
        String str, output;
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
 
        System.out.print("Enter a String : ");
        str = bf.readLine();
         // Deleting Vowel alphabets from input
        // string using replaceAll method
        output = str.replaceAll("[AEIOUaeiou]", "");
 
        System.out.println("Output String\n" + output);
    }
}