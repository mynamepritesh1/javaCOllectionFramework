package Collection;

import java.util.Comparator;
import java.util.Objects;

public class Student implements Comparable<Student>{
   
	
	String  name;
	int rollNo;
	
	
	public Student(String name, int rollNo) {
		this.name = name;
		this.rollNo = rollNo;
		
		
		
		
	}


	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNo=" + rollNo + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(rollNo);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return rollNo == other.rollNo;
	}




//	@Override
//	public int compareTO(Student o1, Student o2) {
//		// TODO Auto-generated method stub
//		return this.name.compareTo(o2.name);
//	}


	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.rollNo;
	}
	
	public static Comparator<Student> NameComparator = new Comparator<Student>() {

		@Override
		public int compare(Student o1, Student o2) {
			
			return o1.name.compareTo(o2.name);
		}
		
		
	};
	
	
	

	

}
