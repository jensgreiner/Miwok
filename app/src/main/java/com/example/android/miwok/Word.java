package com.example.android.miwok;

/**
 * {@link Word} represents a vocabulary word that the user wants to learn.
 * It contains a default translation and a Miwok translation and an image for that word.
 * Created by jens on 20.05.17.
 */

class Word {

    /**
     * Constant value that represents no image was provided for this word
     */
    private static final int NO_IMAGE_PROVIDED = -1;
    // private attributes
    // Default translation for the word
    private final String mDefaultTranslation;
    // Miwok translation for the word
    private final String mMiwokTranslation;
    // Image as drawable resource ID for the icon
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    // Sound as raw resource ID for the sound file
    private int mSoundResourceId;

    // Constructors

    /**
     * Creates a new Word object
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     * @param miwokTranslation   is the word in the Miwok language
     */
    public Word(String defaultTranslation, String miwokTranslation, int soundResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mSoundResourceId = soundResourceId;
    }

    /**
     * Overloaded constructor to create a Word object with an image
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     * @param miwokTranslation   is the word in the Miwok language
     * @param imageResourceId    is the image corresponding to the word
     * @param soundResourceId    is the sound file corresponding to the word
     */
    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId, int soundResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mSoundResourceId = soundResourceId;
    }

    // Getters
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public int getSoundResourceId() {
        return mSoundResourceId;
    }

    /**
     * Returns whether or not there is an image for this word.
     *
     * @return true if there is an image resource id set and false, if not
     */
    // Public methods
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

}
