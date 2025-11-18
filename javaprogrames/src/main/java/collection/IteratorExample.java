package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorExample {

	public static void main(String[] args) {
Set<Integer>s=new HashSet<Integer>();
s.add(20);
s.add(5);
s.add(10);
System.out.println(s);
Iterator<Integer>l=s.iterator();
while(l.hasNext()) {
System.out.println(l.next());	
}
l.remove();
System.out.println(s);
	}

}
