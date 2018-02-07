package com.mdhskv.md.mediapp.model;

import java.io.Serializable;

import org.hibernate.validator.constraints.NotBlank;


public class QuestionAnswer implements Serializable{
  private static final long serialVersionUID = 1L;
  @NotBlank
  private String questionId;
  private String question;
  
  private String answer;
  
  private SecurityAnswerDataInfo answerFormat;
  private String questionDesc;
  private String questionErrMsg;
  
  /**
	 * @return the answerFormat
	 */
	public SecurityAnswerDataInfo getAnswerFormat() {
		return answerFormat;
	}
	/**
	 * @param answerFormat the answerFormat to set
	 */
	public void setAnswerFormat(SecurityAnswerDataInfo answerFormat) {
		this.answerFormat = answerFormat;
	}
	/**
	 * @return the questionDesc
	 */
	public String getQuestionDesc() {
		return questionDesc;
	}
	/**
	 * @param questionDesc the questionDesc to set
	 */
	public void setQuestionDesc(String questionDesc) {
		this.questionDesc = questionDesc;
	}
	/**
	 * @return the questionErrMsg
	 */
	public String getQuestionErrMsg() {
		return questionErrMsg;
	}
	/**
	 * @param questionErrMsg the questionErrMsg to set
	 */
	public void setQuestionErrMsg(String questionErrMsg) {
		this.questionErrMsg = questionErrMsg;
	}
	/**
   * @return the id
   */
  public String getQuestionId() {
    return questionId;
  }
  /**
   * @param id the id to set
   */
  public void setQuestionId(String id) {
    this.questionId = id;
  }
  /**
   * @return the question
   */
  public String getQuestion() {
    return question;
  }
  /**
   * @param question the question to set
   */
  public void setQuestion(String question) {
    this.question = question;
  }
  /**
   * @return the answer
   */
  public String getAnswer() {
    return answer;
  }
  /**
   * @param answer the answer to set
   */
  public void setAnswer(String answer) {
    this.answer = answer;
  }
}
