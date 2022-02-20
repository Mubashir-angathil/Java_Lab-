import java.util.Scanner;

public class Anagram {
    static String strTwo;

    public static void arrangeStrting(String format) {
        int i, j;
        char[] temp1 = new char[20];
        for (i = 0; i < format.length(); i++) {
            for (j = 0; j < strTwo.length(); j++) {
                if (format.charAt(i) == strTwo.charAt(j)) {
                    temp1[i] = strTwo.charAt(j);
                    break;
                }
            }
        }
        for (i = 0; i < 5; i++) {
            System.out.print(temp1[i]);
        }
    }

    public static void main(String[] args) {
        String strOne, Format;
        int lenOne, lenTwo, i, j, found = 0, not_found = 0;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the First String: ");
        strOne = scan.nextLine();
        strOne=strOne.toUpperCase();
        Format = strOne;
        System.out.print("Enter the Second String: ");
        strTwo = scan.nextLine();
        strTwo=strTwo.toUpperCase();
        lenOne = strOne.length();
        lenTwo = strTwo.length();

        if (lenOne == lenTwo) {
            for (i = 0; i < lenOne; i++) {
                found = 0;
                for (j = 0; j < lenOne; j++) {
                    if (strOne.charAt(i) == strTwo.charAt(j)) {
                        found = 1;
                        break;
                    }
                }
                if (found == 0) {
                    not_found = 1;
                    break;
                }
            }
            if (not_found == 1)
                System.out.println("\nStrings are not Anagram");
            else {
                System.out.println("\nStrings are Anagram");
                arrangeStrting(Format);
            }
        }

        else
            System.out.println("\nLength of Strings Mismatched!");
    }
}