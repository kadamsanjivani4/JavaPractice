import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class Stud<K, V>{
	int rollno;
	String name;
	float marks;
	private K key;
	public K getKey() {
		return key;
	}
	
	public V getValue() {
		return value;
	}
	
	private V value;
	public Stud (K k1, V v1) {
		key = k1;
		value = v1;
	}
	@Override
	public String toString() {
		return "Student [key=" + key + ", value=" + value + "]";
	}

	Stud(int r, String n, float m){
		rollno = r;
		name = n;
		marks = m;
		System.out.println("Object initialised");
	}
	
}
public class ComparatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Comparator <Stud<Integer,String>> crollno = new Comparator<Stud<Integer,String>>(){
			
			public int compare (Stud<Integer,String> obj1, Stud<Integer,String> obj2) {
				if (obj1.getKey() < obj2.getKey())
					return -1;
				else if (obj1.getKey() > obj2.getKey())
					return +1;
				else
					return 0;
			}
		};
		
Comparator <Stud<Integer,String>> cvalue = new Comparator<Stud<Integer,String>>(){
			
			public int compare (Stud<Integer,String> obj1, Stud<Integer,String> obj2) {
				int i= obj1.getValue().compareTo(obj2.getValue());
					return i;
			}
		};
		
		Set<Stud<Integer,String>> set = new TreeSet<>(crollno);
		set.add(new Stud<Integer,String>(4,"ZZZ"));
		set.add(new Stud<Integer,String>(1,"One"));
		set.add(new Stud<Integer,String>(2,"Two"));
		set.add(new Stud<Integer,String>(3,"Three"));
		
		for(Stud<Integer, String> ele:set) {
			System.out.println(ele);
		}
		
	}

}
