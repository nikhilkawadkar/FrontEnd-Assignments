package SpringCore_2nd_que;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Question {
	
	int questionId;
	String question;
	List<String> questionList;
	Set<String> questionSet;
	Map<Integer, String> questionMap;
	
	public Question(int questionId, String question, List<String> questionList, Set<String> questionSet,
			Map<Integer, String> questionMap) {
		super();
		this.questionId = questionId;
		this.question = question;
		this.questionList = questionList;
		this.questionSet = questionSet;
		this.questionMap = questionMap;
	}

	public int getQuestionId() {
		return questionId;
	}

	public String getQuestion() {
		return question;
	}

	public List<String> getQuestionList() {
		return questionList;
	}

	public Set<String> getQuestionSet() {
		return questionSet;
	}

	public Map<Integer, String> getQuestionMap() {
		return questionMap;
	}
	
	
}
