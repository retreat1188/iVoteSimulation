package iVoteSimulator;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
 
public class SimulationDriver {

	private static Random r = new Random();
	private static Student students[];
	private static Question Q;
	
	
	// main method
	public static void main(String[] args) {
		students = createStudents();
		
		int num = r.nextInt((100-1)+1) + 1;
		
		// multiple choice or single choice
		if (num % 2 == 0) {
			Q = new MultipleChoiceQuestion();
			multiple();
		}
		else {
			Q = new SingleChoiceQuestion();
			single();
		}
		
		CheckService v = new CheckService(students, Q);
	}
	
	private static void multiple() { // answers for multiple choice
		String answers[] = {"A", "B", "C", "D"};
		Q.setQuestion("Pick the right multiple choice answer.");
		int index = r.nextInt(4);
		Q.setAnswer(answers[index]); // setter for answer
		
		for (Student stu : students) { // assigning answer for student
			index = r.nextInt(4);
			stu.setAnswer(answers[index]);
		}
	}
	
	private static void single() { // output for single choice
		Q.setQuestion("Determine if the following is true or false.");
		Q.setAnswer("True");
		
		int index = 0;
		for (Student stu: students) {
			index = r.nextInt(3);
			if (index % 2 == 0)
				stu.setAnswer("True");
			else
				stu.setAnswer("False");
		}
	}
	
	// generate number of student users
	private static Student[] createStudents() {
		int numOfStudents = r.nextInt(200-20) + 20; // generate between 20 - 200 students
		
		Student students[] = new Student[numOfStudents];
		for (int i = 0; i < numOfStudents; i++) { // initiates student objects
			students[i] = new Student();
			
		}
		
		List<String> users = new ArrayList<>(); // maintains student ID
		
		for (Student stu : students) { //traverse array and assign each student a user name
			stu.setID(Integer.toString(r.nextInt(100)));
			while (users.contains(stu.getID())) { // make sure there are no duplicates
				stu.setID(Integer.toString(r.nextInt(9999-1000) + 1000));
			}
			
			users.add(stu.getID());
		}
		
		return students;
	}
}
