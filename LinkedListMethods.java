import java.util.*;

public class LinkedListMethods {

  public static void main(String[] args) {

    LinkedList ls = new LinkedList();

    Scanner input = new Scanner(System.in);
    String gimp = null;
    int i = 0;
    boolean check = true;
    System.out.println("Enter Processes:\nOnce finished type \"DONE\"\n");

    do {
      gimp = input.nextLine();
      ls.add(gimp);
      if (gimp.equalsIgnoreCase("done")) {
        check = false;
        break;
      }
      i++;
    } while (check == true);
    ls.removeLast();
    //ls.remove("");
    System.out.println(ls);

    // System.out.println("\u0000C");

  }
}
