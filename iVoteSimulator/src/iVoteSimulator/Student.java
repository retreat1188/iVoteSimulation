package iVoteSimulator;

// represents student ID arrangement
public class Student {
	
	private String ID;
	private String answer;
	
	public Student() {
		this.ID = " ";
		this.answer = " ";
	}
	
	public void setID(String ID) {
		this.ID = ID;
	}
	
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
	public String getID() {
		return ID;
	}
	
	public String getAnswer() {
		return answer;
	}
}
