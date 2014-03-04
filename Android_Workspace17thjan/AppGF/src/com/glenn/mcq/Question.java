package com.glenn.mcq;

import java.util.ArrayList;

public class Question {
	private String question;
	private String correctAnswer;
	ArrayList<String> answers = new ArrayList<String>();
	
	
	public Question(String question, String correctAnswer, ArrayList<String> answers) {
		this.question = question;
		this.correctAnswer = correctAnswer;
		this.answers = answers;
	}
	
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getCorrectAnswer() {
		return correctAnswer;
	}
	public void setCorrectAnswer(String correctAnswer) {
		this.correctAnswer = correctAnswer;
	}

	public ArrayList<String> getAnswers() {
		return answers;
	}

	public void setAnswers(ArrayList<String> answers) {
		this.answers = answers;
	}
}
