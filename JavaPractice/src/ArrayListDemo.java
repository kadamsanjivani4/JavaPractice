import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		a.add("Sanjivani");
		a.add("Amrita");
		a.add(1, "Sachin");
		a.add("Piya");
		a.add("Shambhu");
		System.out.println("Elements: ");
		ListIterator<String> li= a.listIterator();
		while(li.hasNext()) {
			System.out.print(" "+li.next());
		}
		System.out.println("Performing operations on ArrayList: ");
		System.out.println("Sachin Element available: "+a.contains("Sachin"));
		System.out.println("Index of  Sanjivani: "+a.indexOf("Sanjivani"));
		System.out.println("Replacing Shambhu with Shiv: "+a.set(a.indexOf("Shambhu"), "Shiv"));
		li= a.listIterator();
		while(li.hasNext()) {
			System.out.print(" "+li.next());
		}
		
		

	}

}
