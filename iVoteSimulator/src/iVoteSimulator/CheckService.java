package iVoteSimulator;

public class CheckService {
	private Student[] students;
	private Question Q;
	private int A = 0, B = 0, C = 0, D = 0;
	private int right = 0, wrong = 0;
	
	public CheckService(Student[] students, Question Q) { 
		this.students = students;
		this.Q = Q;
		
		if (Q.isMultipleChoice()) // check to see if question is multiple or single choice
			checkMultiple(); 
		else 
			checkSingle();
	}
	
	public void checkMultiple() { 
		for (Student stu : students) {
			if (stu.getAnswer().compareTo("A") == 0)
				A++;
			else if (stu.getAnswer().compareTo("B") == 0)
				B++;
			else if (stu.getAnswer().compareTo("C") == 0)
				C++;
			else
				D++;
		}
		
		printInitial();
		printResults();
	}
	
	public void checkSingle() {
		for (Student stu : students) {
			if (stu.getAnswer().compareTo("True") == 0)
				right++;
			else
				wrong++;
		}
		
		printInitial();
		printResults();
	}
	
 
	
	public void printInitial() {
		System.out.println("iVote Simulation Start");
		System.out.println("Number of students who partcipated: " + students.length);
		System.out.println("Following Question:	" +Q.Example() +  "    Instruction: " + Q.question());
		System.out.println("Correct Answer:	-> " + Q.answer() + "\n");
	}
		
	public void printResults() { // displays random statistics for selected choice
		System.out.println("Students' Results Below" + "\n-----------------------");
		
		if (Q.isMultipleChoice()) {
			System.out.println("A: " + A);
			System.out.println("B: " + B);
			System.out.println("C: " + C);
			System.out.println("D: " + D);
		
		}
		
		else {
			System.out.println("True: " + right);
			System.out.println("False: " + wrong);
		}
		
	}
}
