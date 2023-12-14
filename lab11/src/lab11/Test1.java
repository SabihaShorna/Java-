package lab11;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Course cse215 = new Course("Programming Language-II");
		cse215.addStudent("A");
		cse215.addStudent("B");
		cse215.addStudent("C");
		cse215.addStudent("D");
		cse215.addStudent("E");
		
		String[] students = cse215.getStudents();
		System.out.println("Currently Enrolled Students of CSE-215:");
		for (int i = 0; i < cse215.getNumberOfStudents(); i++) {
			System.out.println(students[i]);
		}
		System.out.println();
		
		cse215.dropStudent("C");
		students = cse215.getStudents();
		System.out.println("Currently Enrolled Students of CSE-215:");
		for (int i = 0; i < cse215.getNumberOfStudents(); i++) {
			System.out.println(students[i]);
		}
		System.out.println();
		
		cse215.dropStudent("B");
		students = cse215.getStudents();
		System.out.println("Currently Enrolled Students of CSE-215:");
		for (int i = 0; i < cse215.getNumberOfStudents(); i++) {
			System.out.println(students[i]);
		}
		System.out.println();
		
	}


	}


