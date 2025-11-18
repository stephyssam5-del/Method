package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterate {

	public static void main(String[] args) {
		ArrayList<String>a=new ArrayList<String>();
		a.add("Violet");
		a.add("Red");
		a.add("Blue");
		a.add("Black");
		System.out.println(a);
		Iterator<String>l=a.iterator();
		while(l.hasNext()) {
		System.out.println(l.next());	
		}
		l.remove();
		System.out.println(a);

	}

}
