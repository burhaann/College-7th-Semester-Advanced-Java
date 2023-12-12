import java.util.Scanner;

public class oneLineCalculator {

  public static String inputString, str1, str2, mid;
  public static Scanner input = new Scanner(System.in);

  public static int num1 = 0, num2 = 0, ans = 0, count = 0;
  public static int i = 0, j = 0, k = 0;
  public static boolean conn = true;

  public static void main(String[] args) {

    do {

      gettinginput();
      calculator();

      try {
        System.out.print("\n\nWana Try Again?\n\n");
        mid = input.nextLine();
        if (mid.equalsIgnoreCase("exit")) {

          System.exit(0);
        }
        if (mid.equalsIgnoreCase("no")) {
          conn = false;
          mid=null;
          break;
        }

      } catch (Exception e) {
        System.out.println("\nException: " + e + "\n");
        // break;
      }

    } while (conn = true);
  } // main function

  public static void gettinginput() {
    System.out.print("Enter Number1 Operator Number2   (NoWhiteSpaces)\nFor Example:\n25+2\n\n");
    inputString = input.nextLine();

    k = inputString.length();
    mid = inputString;
    if (mid.equalsIgnoreCase("exit")) {

      System.exit(0);
    }
    System.out.println("You Entered: \n" + inputString);
  }

  public static void calculator() {
    for (i = 0; i < k; i++) {
      j = inputString.charAt(i);

      if (count == 0) {

        if (j == ' ') {
          str1 = inputString.substring(0, i);
          System.out.println("\nSpace Detected After: " + str1 + "\nPlease Try Again");
          count++;
        }
        if (j == '+' || j == '-' || j == '*' || j == '/') {
          System.out.println("Operator Detected at index " + i);
          str1 = inputString.substring(0, i);
          str2 = inputString.substring(i + 1, k);
          try {
            num1 = Integer.parseInt(str1);
          } catch (NumberFormatException e) {
            System.out.println("\nFirst Number cannot be parsed to Integer.");
            break;
          }
          try {
            num2 = Integer.parseInt(str2);
          } catch (NumberFormatException e) {
            System.out.println("\nSecond Number cannot be parsed to Integer.");
            break;
          }

          System.out.print("\nNumber1: " + str1 + "\nNumber2: " + str2 + "\nOperator: ");
          switch (j) {
            case '+':
              {
                ans = num1 + num2;
                System.out.print("Addition\n\nAnswer: " + ans + "\n");
                break;
              }
            case '-':
              {
                ans = num1 - num2;
                System.out.print("Subtraction\n\nAnswer: " + ans + "\n");
                break;
              }
            case '*':
              {
                ans = num1 * num2;
                System.out.print("Multiplication\n\nAnswer: " + ans + "\n");
                break;
              }
            case '/':
              {
                ans = num1 / num2;
                System.out.print("Division\n\nAnswer: " + ans + "\n");
                break;
              }
          } // switch case
        } // if checking operators
      } // if count
    } // for loop
  }
}
