package com.domain.tzemati.interactivestory.model;

/**
 * Created by Aaron on 11/28/2014.
 */
public class Page {
    private int mImageId;
    private String mText;
    private Choice mChoice1, mChoice2;
    private boolean mIsFinal = false;

    public Page(int id, String text, Choice c1, Choice c2) {
        mImageId = id;
        mText = text;
        mChoice1 = c1;
        mChoice2 = c2;
    }

    public Page(int id, String text) {
        mImageId = id;
        mText = text;
        mChoice1 = null;
        mChoice2 = null;
        mIsFinal = true;
    }

    public int getImageId() {
        return mImageId;
    }

    public void setImageId(int imageId) {
        mImageId = imageId;
    }

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }

    public Choice getChoice1() {
        return mChoice1;
    }

    public void setChoice1(Choice choice1) {
        mChoice1 = choice1;
    }

    public Choice getChoice2() {
        return mChoice2;
    }

    public void setChoice2(Choice choice2) {
        mChoice2 = choice2;
    }

    public boolean isFinal() {
        return mIsFinal;
    }

    public void setFinal(boolean isFinal) {
        mIsFinal = isFinal;
    }
}
