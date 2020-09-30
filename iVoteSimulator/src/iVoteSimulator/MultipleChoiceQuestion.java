package iVoteSimulator;

// displays random multiple choice questions
public class MultipleChoiceQuestion implements Question {
	private String Q = "default";
	private String a = "Which of the choices is the most important OO design principles?";
	private String Ans = "default";
	
	public String question() {
		return Q;
	}
	
	public String Example() {
		return a;
	}
	public String answer() {
		return Ans;
	}
	
	public void setQuestion(String Q) {
		this.Q = Q;
	}
	
	public void setAnswer(String Ans) {
		this.Ans = Ans;
	}
	
	public boolean isMultipleChoice() {
		return true;
	}
	
	public boolean isSingleChoice() {
		return false;
	}
}
