package com.example.android.miwok;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * {@link WordAdapter} is an {@link ArrayAdapter} that can provide the layout for each list
 * based on a data source, which is a list of {@link Word} objects.
 * Based on {@see <a href="https://github.com/udacity/ud839_CustomAdapter_Example">Github:ud839_CustomAdapter_Example</a>}
 * Created by jens on 20.05.17.
 */

class WordAdapter extends ArrayAdapter<Word> {


    /**
     * Creates a new WordAdapter as a custom extension of ArrayAdapter class
     *
     * @param context The current context. Used to inflate the layout file.
     * @param words   A List of AndroidFlavor objects to display in a list
     */
    WordAdapter(Activity context, ArrayList<Word> words) {
        super(context, 0, words);
    }

    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position    The position in the list of data that should be displayed in the
     *                    list item view.
     * @param convertView The recycled view to populate.
     * @param parent      The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        // View could be null when the Activity is called first time
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Word} object located at this position in the list
        Word currentWord = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID default_text_view
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        // Get the default word from the current Word object and
        // set this text on the name TextView
        if (currentWord != null) {
            defaultTextView.setText(currentWord.getDefaultTranslation());
        }

        // Find the TextView named miwok_text_view and then set the corresponding text from current Word object
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        if (currentWord != null) {
            miwokTextView.setText(currentWord.getMiwokTranslation());
        }

        // Find the ImageView named image and then set the corresponding image from current Word object
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        if (currentWord != null) {
            if (currentWord.getmImageResourceId() == 0) {
                imageView.setVisibility(View.GONE);
            } else {
                imageView.setVisibility(View.VISIBLE);
                imageView.setImageResource(currentWord.getmImageResourceId());
            }
        }

        return listItemView;
    }
}
