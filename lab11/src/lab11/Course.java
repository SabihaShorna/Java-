package lab11;


public class Course {
	private String courseName;
	private String[] students;
	private int numberOfStudents;
	
	public  Course(String courseName) {
		this.courseName=courseName;
		students=new String[3];
	}
	public String getCourseName() {
		return courseName;
		
	}
	public void addStudent(String student) {
		if(numberOfStudents==students.length) {
			String[] temp = new String[numberOfStudents];
			for(int i = 0; i < numberOfStudents;i++) {
				temp[i] = students[i];
			}
			students= temp;
		}
		students[numberOfStudents++]=student;
		
		
	}

	public int getIndex(String student) {
		for(int i = 0; i < numberOfStudents;i++) {
			if(students[i].equals(student)) {
				return i;
			}
		}
		return -1;
	}
	public void dropStudent(String student) {
		int index = getIndex(student);
		if(index >= 0) {
			for(int i = index; i < numberOfStudents;i++) {
				students[i] = students[i + 1];
			}
			students[--numberOfStudents]=null;
		}
		else {
			System.out.println("Student: " + student + " was not found!!");
		}
		
	}
	
		
	
	public String[] getStudents() {
		return students;
		
	}
	public int getNumberOfStudents() {
		return numberOfStudents;
		
	}
	public void clear() {
		String[] temp = new String[3];
		students = temp;
		numberOfStudents=0;
		
		
	}

}
