import java.util.ArrayList;
import java.util.ListIterator;

class person1{

  String name;
  int age;
  public person1(String name, int age) {
    this.name = name;
    this.age = age;
  }
  void display(){
    System.out.println("NAME "+name+" AGE "+age);
  }
  
}
public class Dynamic{
public static void main(String[]args){
// Create an Object for ArrayList
  // Load person class Objects in it
  // Iterate it by using List Iterator
  // print the values by using while Loop
  ArrayList<person1> personList = new ArrayList<>();

        // Load Person objects into the ArrayList
        personList.add(new person1("Mani", 22));
        personList.add(new person1("Sai", 22));
        personList.add(new person1("sri", 18));

        // Iterate over the ArrayList using a ListIterator and a while loop
        ListIterator<person1> listIterator = personList.listIterator();
        while (listIterator.hasNext()) {
            // Get the next Person object
            person1 person = listIterator.next();
            // Print Person details
            person.display();
        }
  
}
}
