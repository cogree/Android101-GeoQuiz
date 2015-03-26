package net.tonygreer.geoquiz;

public class TrueFalseQuestion {
    private int mQuestion;
    private boolean mTrueQuestion;

    public TrueFalseQuestion(int question, boolean trueQuestion) {
        mQuestion = question;
        mTrueQuestion = trueQuestion;
    }

    public int getQuestion() {
        return mQuestion;
    }

    public boolean isTrueQuestion() {
        return mTrueQuestion;
    }
}
