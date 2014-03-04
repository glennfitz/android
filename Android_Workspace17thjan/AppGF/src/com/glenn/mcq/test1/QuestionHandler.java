package com.glenn.mcq.test1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;


public class QuestionHandler {
	ArrayList<Question> allQuestions = new ArrayList<Question>();
	ArrayList<Question> displayQuestions = new ArrayList<Question>();
	
	public QuestionHandler() {
		init100Questions();
		
	}
	/*
	 * 
	 */
	private void init100Questions(){
		ArrayList <String> arrayList = new ArrayList<String>();
		arrayList.add("correct1");
		arrayList.add("fanswer1");
		arrayList.add("sanswer1");
		Collections.shuffle(arrayList);
		allQuestions.add(new Question("Question1", "correct1", arrayList));
		arrayList =  new ArrayList<String>();
		arrayList.add("correct2");
		arrayList.add("fanswer2");
		arrayList.add("sanswer2");
		Collections.shuffle(arrayList);
		allQuestions.add(new Question("Question2", "correct2", arrayList));
		arrayList =  new ArrayList<String>();
		arrayList.add("correct3");
		arrayList.add("fanswer3");
		arrayList.add("sanswer3");
		Collections.shuffle(arrayList);
		allQuestions.add(new Question("Question3", "correct3", arrayList));
		arrayList =  new ArrayList<String>();
		arrayList.add("correct4");
		arrayList.add("fanswer4");
		arrayList.add("sanswer4");
		Collections.shuffle(arrayList);
		allQuestions.add(new Question("Question4", "correct4", arrayList));
		arrayList =  new ArrayList<String>();
		arrayList.add("correct5");
		arrayList.add("fanswer5");
		arrayList.add("sanswer5");
		Collections.shuffle(arrayList);
		allQuestions.add(new Question("Question5", "correct5", arrayList));
		arrayList =  new ArrayList<String>();
		arrayList.add("correct6");
		arrayList.add("fanswer6");
		arrayList.add("sanswer6");
		Collections.shuffle(arrayList);
		allQuestions.add(new Question("Question6", "correct6", arrayList));
		arrayList =  new ArrayList<String>();
		arrayList.add("correct7");
		arrayList.add("fanswer7");
		arrayList.add("sanswer7");
		Collections.shuffle(arrayList);
		allQuestions.add(new Question("Question7", "correct7", arrayList));
		arrayList =  new ArrayList<String>();
		arrayList.add("correct8");
		arrayList.add("fanswer8");
		arrayList.add("sanswer8");
		Collections.shuffle(arrayList);
		allQuestions.add(new Question("Question8", "correct8", arrayList));
		arrayList =  new ArrayList<String>();
		arrayList.add("correct9");
		arrayList.add("fanswer9");
		arrayList.add("sanswer9");
		Collections.shuffle(arrayList);
		allQuestions.add(new Question("Question9", "correct9", arrayList));
		arrayList =  new ArrayList<String>();
		arrayList.add("correct10");
		arrayList.add("fanswer10");
		arrayList.add("sanswer10");
		Collections.shuffle(arrayList);
		allQuestions.add(new Question("Question10", "correct10", arrayList));
		arrayList =  new ArrayList<String>();
		arrayList.add("correct11");
		arrayList.add("fanswer11");
		arrayList.add("sanswer11");
		Collections.shuffle(arrayList);
		allQuestions.add(new Question("Question11", "correct11", arrayList));
		arrayList =  new ArrayList<String>();
		arrayList.add("correct12");
		arrayList.add("fanswer12");
		arrayList.add("sanswer12");
		Collections.shuffle(arrayList);
		allQuestions.add(new Question("Question12", "correct12", arrayList));
		arrayList =  new ArrayList<String>();
		arrayList.add("correct13");
		arrayList.add("fanswer13");
		arrayList.add("sanswer13");
		Collections.shuffle(arrayList);
		allQuestions.add(new Question("Question13", "correct13", arrayList));
		arrayList =  new ArrayList<String>();
		arrayList.add("correct14");
		arrayList.add("fanswer14");
		arrayList.add("sanswer14");
		Collections.shuffle(arrayList);
		allQuestions.add(new Question("Question14", "correct14", arrayList));
		arrayList =  new ArrayList<String>();
		arrayList.add("correct15");
		arrayList.add("fanswer15");
		arrayList.add("sanswer15");
		Collections.shuffle(arrayList);
		allQuestions.add(new Question("Question15", "correct15", arrayList));
		arrayList =  new ArrayList<String>();
		arrayList.add("correct16");
		arrayList.add("fanswer16");
		arrayList.add("sanswer16");
		Collections.shuffle(arrayList);
		allQuestions.add(new Question("Question16", "correct16", arrayList));
		arrayList =  new ArrayList<String>();
		arrayList.add("correct17");
		arrayList.add("fanswer17");
		arrayList.add("sanswer17");
		Collections.shuffle(arrayList);
		allQuestions.add(new Question("Question17", "correct17", arrayList));
		arrayList =  new ArrayList<String>();
		arrayList.add("correct18");
		arrayList.add("fanswer18");
		arrayList.add("sanswer18");
		Collections.shuffle(arrayList);
		allQuestions.add(new Question("Question18", "correct18", arrayList));
		arrayList =  new ArrayList<String>();
		arrayList.add("correct19");
		arrayList.add("fanswer19");
		arrayList.add("sanswer19");
		Collections.shuffle(arrayList);
		allQuestions.add(new Question("Question19", "correct19", arrayList));
		arrayList =  new ArrayList<String>();
		arrayList.add("correct20");
		arrayList.add("fanswer20");
		arrayList.add("sanswer20");
		Collections.shuffle(arrayList);
		allQuestions.add(new Question("Question20", "correct20", arrayList));
		arrayList =  new ArrayList<String>();
	
	}
	/*
	 * 
	 */
	public ArrayList<Question> get10RandQuestions(){
		int num;
		int max = 19;
		for(int i=0;i<=9;i++) {
			num = 0 + (int)(Math.random() * ((max - 0) + 1));
			displayQuestions.add(allQuestions.get(num));
			max--;
		}
		return displayQuestions;
	}
	
}
