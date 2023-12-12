import java.util.Scanner;

public class stringReverse {

  static int check = 0;

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    String gimp = null, pimp = "";

    gimp = input.nextLine();

    for (int i = gimp.length(); i > 0; i--) {
      pimp += gimp.charAt(i - 1);
    }

    System.out.println("\nInput: " + gimp);

    System.out.println("Lower Case: " + gimp.toLowerCase());

    caseConversion(gimp, pimp);

    System.out.println("\nUpper Case: " + gimp.toUpperCase());

    System.out.println("Reverse: " + pimp);
  }

  public static void caseConversion(String gimp, String pimp) {
    if (gimp.isEmpty()) {
      System.out.println("Empty: ");
    } else if (gimp.length() == 1) {
      System.out.println("Title Case: " + gimp.toUpperCase());
    } else if (gimp.length() > 1) {
      String[] words = gimp.split("\\s+");
      System.out.print("Title Case: ");
      for (String k : words) {
        System.out.print(k.substring(0, 1).toUpperCase() + k.substring(1) + " ");
      }
    }
  }
}
