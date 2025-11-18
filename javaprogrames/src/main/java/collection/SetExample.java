package collection;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
Set<Integer>s1=new HashSet<Integer>();
Set<Integer>s2=new HashSet<Integer>();
s1.add(5);
s1.add(10);
s1.add(2);
s2.add(20);
s2.add(15);
s2.add(12);
System.out.println(s1);
System.out.println(s2);
s1.addAll(s2);
System.out.println(s1);
System.out.println(s2);
System.out.println(s1.size());
System.out.println(s1.isEmpty());
System.out.println(s1.contains(10));
System.out.println(s1.containsAll(s2));
s1.remove(2);
System.out.println(s1);
s1.removeAll(s2);
System.out.println(s1);
s1.clear();
System.out.println(s1);
	}

}
