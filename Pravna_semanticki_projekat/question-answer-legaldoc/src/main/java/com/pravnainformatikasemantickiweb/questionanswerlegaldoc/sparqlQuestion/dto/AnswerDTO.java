package com.pravnainformatikasemantickiweb.questionanswerlegaldoc.sparqlQuestion.dto;

import lombok.ToString;

@ToString
public class AnswerDTO {

	private String answer;
	
	
	public AnswerDTO() {
		
	}


	public String getAnswer() {
		return answer;
	}


	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
}
