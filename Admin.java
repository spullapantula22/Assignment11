import java.util.*;
public class Admin {
	public static HashMap<Key, Student> processStudents(List<Student> students) {
		//implement
		
		HashMap<Key, Student> student = new HashMap<Key, Student>();
		
		for(Student s: students) {
			
			Key k = new Key(s.getFirstName(), s.getLastName());
			student.put(k, s);
		}
		
		return student;
	}
	public static double computeAverageGPA(HashMap<Key,Student> maps){
		//implements
		double total = 0;
		double studentCount = 0;
		
		for(Student s: maps.values()) {
			
			total += s.getGpa();
			studentCount++;
		}
		return total/studentCount;	 		  
}
}
