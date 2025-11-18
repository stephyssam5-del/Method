package collection;

import java.util.LinkedList;
import java.util.List;

public class ListExample {
public static void main(String[] args) {
List<String>l=new LinkedList<String>();
l.add("Mango");
l.add("Apple");
l.add("Grapes");
l.add("Pappaya");
System.out.println(l);
System.out.println(l.get(2));
l.set(1, "Pineapple");
System.out.println(l);
System.out.println(l.size());
System.out.println(l.isEmpty());
l.remove(0);
System.out.println(l);
System.out.println(l.contains("Pappaya"));
System.out.println(l.indexOf("Grapes"));
l.add("Pineapple");
System.out.println(l);
System.out.println(l.lastIndexOf("Pineapple"));

}



}
