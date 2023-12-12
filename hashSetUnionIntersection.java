import java.util.HashSet;
import java.util.Scanner;

public class hashSetUnionIntersection {

  public static int i = 0, totalHashSets = 2;
  public static boolean check = true;
  public static String gimp = null, has = null;
  public static Scanner input = new Scanner(System.in);

  public static void main(String[] args) {

    HashSet hs0 = new HashSet();
    HashSet hs1 = new HashSet();
    // HashSet hs2 = new HashSet();

    System.out.print("Enter Elements of the first HashSet to be United.\n");

    inputToHash(hs0);
    inputToHash(hs1);
    // inputToHash(hs2);

    union(hs0, hs1);
    intersection(hs0, hs1);
  }

  public static void inputToHash(HashSet hs) {
    do {
      gimp = null;
      gimp = input.nextLine();
      if (gimp.equalsIgnoreCase("done")) {
        gimp = null;
        check = false;
        i++;
        break;
      }
      hs.add(gimp);
      hs.remove("");
    } while (check == true);
    System.out.println(hs + "\n");
    if (i < totalHashSets && i > 0) {
      System.out.print("Enter Elements of HashSet " + (i + 1) + "\n");
    } else // if (i==totalHashSets)
    {
      System.out.print("Displaying Union & Intersection of  " + i + " HashSets.\n\n");
    }
    check = true;
  }

  public static void union(HashSet hs, HashSet h1) {
    HashSet h2 = new HashSet();
    h2.addAll(hs);
    h2.addAll(h1);

    System.out.println("Union: " + h2);
  }

  public static void intersection(HashSet hs, HashSet h1) {

    HashSet h2 = new HashSet();
    h2.addAll(hs);
    h2.retainAll(h1);

    System.out.println("Intersection: " + h2);
    if (h2.isEmpty()) {
      System.out.println("\nEmpty Intersection, No Similar Elements found.");
    }
  }
}
