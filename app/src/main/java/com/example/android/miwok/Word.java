package com.example.android.miwok;

/**
 * {@link Word} represents a vocabulary word that the user wants to learn.
 * It contains a default translation and a Miwok translation for that word.
 * Created by jens on 20.05.17.
 */

class Word {

    // private attributes
    // Default translation for the word
    private final String mDefaultTranslation;
    // Miwok translation for the word
    private final String mMiwokTranslation;

    // Constructors

    /**
     * Create a new Word object
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     * @param miwokTranslation   is the word in the Miwok language
     */
    Word(String defaultTranslation, String miwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    // Getters
    String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    String getMiwokTranslation() {
        return mMiwokTranslation;
    }
}
