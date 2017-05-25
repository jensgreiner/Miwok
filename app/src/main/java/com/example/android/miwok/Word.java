package com.example.android.miwok;

/**
 * {@link Word} represents a vocabulary word that the user wants to learn.
 * It contains a default translation and a Miwok translation and an image for that word.
 * Created by jens on 20.05.17.
 */

class Word {

    // private attributes
    // Default translation for the word
    private final String mDefaultTranslation;
    // Miwok translation for the word
    private final String mMiwokTranslation;

    // Image as drawable resource ID for the icon
    private int mImageResourceId;

    // Constructors

    /**
     * Creates a new Word object
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     * @param miwokTranslation   is the word in the Miwok language
     */
    public Word(String defaultTranslation, String miwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    /**
     * Overloaded constructor to create a Word object with an image
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     * @param miwokTranslation   is the word in the Miwok language
     * @param imageResourceId    is the image corresponding to the word
     */
    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
    }

    // Getters
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }
}
