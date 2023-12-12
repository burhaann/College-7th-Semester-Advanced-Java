import java.util.LinkedList;
import java.util.Queue;

public class QueueMethods {

  public static void main(String[] args) {
  
  Queue Naruto = new LinkedList();
  System.out.print("Peek Function : " + Naruto.peek()+"\n");
  
  //System.out.print("\nElement Function : " + Naruto.element());

  Naruto.add("First");
  Naruto.offer("2nd Entry");
  Naruto.offer("3rd Entry");
  
  System.out.print("All Enteries: "+Naruto+"\n");
  
  
  System.out.print("\nElement Function : " + Naruto.element());
  
  Naruto.poll();
  System.out.print("\nPoll Function : "+ Naruto+"\n");
  
  Naruto.remove();
  System.out.print("\nRemove Function : "+ Naruto+"\n");

  }

}
