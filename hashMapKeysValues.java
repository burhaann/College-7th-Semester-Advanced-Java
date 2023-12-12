import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class hashMapKeysValues {

  public static void main(String[] args) {
  
  HashMap m = new HashMap();
  Scanner input = new Scanner(System.in);
  boolean check=true;
  String gimp=null;
  Double pimp=null;

  m.put("Fazil", new Integer(64));
  m.put("Faizan", new Integer(420));
  m.put("Suham", new Double(420.65));
  
  Set s = m.entrySet();
  Iterator i = s.iterator();

  while(i.hasNext()) {
  Map.Entry me = (Map.Entry)i.next();
  System.out.print(me.getKey() + ": ");
  System.out.println(me.getValue());
  }
  
  do
  {
  gimp=input.nextLine();
  if (gimp.equalsIgnoreCase("done"))
  {
    check=false;
    break;
  }
  try {
  pimp=Double.parseDouble(input.nextLine());
} catch (NumberFormatException e) {
  System.out.println("\nSecond Value must be numerical.\nNumber couldn't be parsed to Integer or Double.");
  break;
  }
  m.put(gimp,new Double(pimp));
  System.out.print("Add Another entry :\n");
  }while(check==true);
  
    
  i = s.iterator();
  System.out.println();
  
  while(i.hasNext()) {
  Map.Entry me = (Map.Entry)i.next();
  System.out.print(me.getKey() + ": ");
  System.out.println(me.getValue());
  
    
    }

  }

}
