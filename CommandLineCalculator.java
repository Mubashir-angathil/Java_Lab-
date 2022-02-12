public class CommandLineCalculator{
      public static void main(String[] args) {
          // Declare variables
          int a, b, sum, diff, prod, quo, rem;
          // Get command line argument values
          a = Integer.parseInt(args[0]);
          b = Integer.parseInt(args[1]);
          // Find sum, difference, product, quotient and remainder
          sum = a + b;
          diff = a - b;
          prod = a * b;
          quo = a / b;
          rem = a % b;
          // print result
          System.out.println("Sum = " + sum);
          System.out.println("Difference = " + diff);
          System.out.println("Product = " + prod);
          System.out.println("Quotient = " + quo);
          System.out.println("Remainder = " + rem);
      }
  }