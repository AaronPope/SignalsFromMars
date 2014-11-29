package com.domain.tzemati.interactivestory.model;

/**
 * Created by Aaron on 11/28/2014.
 */
public class Choice {
    private String mText;
    private int mNextPage;

    public Choice(String text, int page) {
        mText = text;
        mNextPage = page;
    }

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }

    public int getNextPage() {
        return mNextPage;
    }

    public void setNextPage(int nextPage) {
        mNextPage = nextPage;
    }
}
