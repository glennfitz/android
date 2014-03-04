package com.glenn.mcq;

import java.util.ArrayList;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		QuestionHandler handler = new QuestionHandler();
		ArrayList<Question> questions = handler.get10RandQuestions();
		
		for (Question question : questions) {
			System.out.println("Question : " + question.getQuestion());
			System.out.println("Correct Answer : " + question.getCorrectAnswer());
			System.out.println("1) " + question.getAnswers().get(0));
			System.out.println("2) " + question.getAnswers().get(1));
			System.out.println("3) " + question.getAnswers().get(2));
			System.out.println("-----");
		}
		
	
	}

}
