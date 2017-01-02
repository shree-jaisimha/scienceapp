package com.jaisimhas.science;

/**
 *The terms are publically accessable
 */
public class Terms {

    private String mQuestion;

    public String getmQuestion() {
        return mQuestion;
    }

    public void setmQuestion(String mQuestion) {
        this.mQuestion = mQuestion;
    }

    private String mAnswers;

    public String getmAnswers() {
        return mAnswers;
    }

    public void setmAnswers(String mAnswers) {
        this.mAnswers = mAnswers;
    }

    public Terms (String questions, String answers)
    {
        mQuestion = questions;
        mAnswers = answers;
    }


}
