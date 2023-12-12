import java.util.Scanner;

public class sahilEvenOdd {

  static String gimp = null;
  static Scanner input = new Scanner(System.in);
  static int length = 0;

  public static void main(String[] args) {

    System.out.print("Enter Some Name: ");
    gimp = input.nextLine();
    length = gimp.length();
    System.out.print("Length: " + length + "  Mid Point:" + length / 2 + "\n\n");

    evenOdd();
  }

  public static void evenOdd() {

    if (length % 2 == 0) {
      System.out.print("Even: \n");
      pattern(true);
    } else {
      System.out.print("Odd: \n");
      pattern(false);
    }
  }

  public static void pattern(Boolean Even) {
    int mid = (length / 2);
    if (Even == true) {
      for (int j = 0; j < length; j++) {
        if (j < mid -1) {
          char pimp = gimp.charAt(j);
          for (int m = 0; m < mid-1; m++) {
            System.out.print("  ");
          }
          System.out.print(pimp+" "+pimp+ "\n");
        } else if (j == mid - 1) {
          for (int m = 0; m < length; m++) {
            char pimp = gimp.charAt(m);
            System.out.print(pimp + " ");
          }
          System.out.print("\n");
        } else if (j == mid) {
          for (int m = 0; m < length; m++) {
            char pimp = gimp.charAt(m);
            System.out.print(pimp + " ");
          }
          System.out.print("\n");
        } else if (j > mid) {
          char pimp = gimp.charAt(j);
          for (int m = 0; m < mid-1; m++) {
            System.out.print("  ");
          }
          System.out.print(pimp+" "+pimp+ "\n");
        }
      }
    }

    if (Even == false) {
      for (int j = 0; j < length; j++) {
        if (j < mid) {

          char pimp = gimp.charAt(j);
          for (int m = 0; m < mid; m++) {
            System.out.print("  ");
          }
          System.out.print(pimp + "\n");
        }

        if (j == mid) {

          for (int m = 0; m < length; m++) {
            char pimp = gimp.charAt(m);
            System.out.print(pimp + " ");
          }
          System.out.print("\n");
        }

        if (j > mid) {

          char pimp = gimp.charAt(j);
          for (int m = 0; m < mid; m++) {
            System.out.print("  ");
          }
          System.out.print(pimp + "\n");
        }
      }
    }
  }
}
