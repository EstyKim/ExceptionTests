package identity;
import java.util.HashMap;
import java.util.Map.Entry;



public class StudentEntry {
	//three main variables necessary to store student information.
	int studentId;
	static String name;
	static int[] grades = {12, 11, 10, 5, 7, 12};
	static int gradeValue = 0;
	
	//Constructor to ensure the values of the names and IDs don't change.
private StudentEntry(int studentId, String name) {
	this.studentId = studentId;
}
public StudentEntry(int grades) {
}
public static void main(String args[]) {
	//creating a HashMap to add the Student IDs and Names.
	final HashMap<Integer, String>  identity = new HashMap<>();
	identity.put(1234534, "Kimmy");
	identity.put(3456789,  "Constance");
	identity.put(5678902,  "Joseph");
	identity.put(1987653, "Alison");
	identity.put(1234095,  "Jacob");
	identity.put(8976448, "Joseph");
	
	//removing a student
	identity.remove(1234095);

	//using a forLoop to print out the ID numbers and Names of the students.
	for(Entry<Integer, String> entry : identity.entrySet()){
		
		//Use if statements to assign grades to the students based on their IDs.
		if(entry.getKey() == 3456789){
			gradeValue = grades[0];
		}
		if(entry.getKey() == 5678902) {
			gradeValue = grades[1];
		}
		if(entry.getKey() == 8976448) {
			gradeValue = grades[2];
		}
		if(entry.getKey() == 1234095) {
			gradeValue = grades[3];
		}
		if(entry.getKey() == 1987653) {
			gradeValue = grades[4];
		}
		if(entry.getKey() == 1234534) {
			gradeValue = grades[5];
		}
		//print all students, their IDs and Grades.
        System.out.println("Student with ID Number : " + entry.getKey() + " is called " + entry.getValue() + " and is in grade " + gradeValue);
        System.out.println();
        
        //Finding the grade of a particular student.
        if(gradeValue == 10) {
            System.out.println("The student " + entry.getValue() + " is in grade " + gradeValue);
            }
	}
	
	
	    }
	
		}

	
	


    

	
      	
    
	




	
