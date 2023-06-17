import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

class Student implements Comparable<Student>{
	public String name;
	public int rollno;
	public float marks;
	
	public Student(String name, int rollno, float marks) {
		
		this.name = name;
		this.rollno = rollno;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [name: " + name + ", rollno: " + rollno + ", marks:" + marks + "]";
	}

	public String getName() {
		return name;
	}

	public int getRollno() {
		return rollno;
	}

	public float getMarks() {
		return marks;
	}

	@Override
	public int compareTo(Student s) {
		//for sorting the objects based on Name in ascending order 
		 int i = name.compareTo(s.name);
			return i;
	}
	
}
public class ComparableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> students = new LinkedList<Student>();
		students.add(new Student("Vedant",1, 78.90f));
		students.add(new Student("Rudra",3, 87.90f));
		students.add(new Student("Saundarya",5, 98.90f));
		students.add(new Student("Shivrana",2, 70.90f));
		students.add(new Student("Amrita",7, 67.90f));
		
		
		ComparableDemo c= new ComparableDemo();
		c.listDisplay(students);
		
		System.out.println("*****************\n After sorting: \n");
		Collections.sort(students);
		
		c.listDisplay(students);
		
	}
	public void listDisplay(List<Student> l) {
		ListIterator<Student> li= l.listIterator();
		while(li.hasNext()) {
			System.out.println("Elements: "+li.next());
		}
	}

}