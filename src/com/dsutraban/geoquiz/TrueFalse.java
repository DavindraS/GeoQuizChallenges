package com.dsutraban.geoquiz;

public class TrueFalse {
	
	// Instance variables
	private int mQuestion;
	private boolean mTrueQuestion;
	
	// Class constructor
	public TrueFalse(int question, boolean trueQuestion)
	{
		mQuestion = question;
		mTrueQuestion = trueQuestion;
	}

	public int getQuestion() {
		return mQuestion;
	}

	public void setQuestion(int question) {
		mQuestion = question;
	}

	public boolean isTrueQuestion() {
		return mTrueQuestion;
	}

	public void setTrueQuestion(boolean trueQuestion) {
		mTrueQuestion = trueQuestion;
	}
}
