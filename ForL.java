import java.util.ArrayList;

public class ForL{
public static void main(String[]args){
// prepare an object for ArrayList
  // Load String instead of Integers 
  // Iterate them using for each loop
  ArrayList<String> a = new ArrayList<>();
  a.add("Mani");
  a.add("Sai");
  //Iterator i = a.iterator();
  //while(i.hasNext())
 // {
  //  System.out.println(i.next());
  //}

  for(String j:a){
    System.out.println(j);
  }
}
}
