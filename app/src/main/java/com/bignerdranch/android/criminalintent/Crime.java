package com.bignerdranch.android.criminalintent;

import android.text.format.DateFormat;

import java.text.FieldPosition;
import java.text.ParsePosition;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;

/**
 * Created by core on 2/7/19.
 */

public class Crime {

    private UUID mId;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;

    public Crime() {
        // Generate unique identifier
        mId = UUID.randomUUID();
        mDate = new Date();
    }

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        mDate = date;
    }

    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean solved) {
        mSolved = solved;
    }

    public String formatDate() {
        String df = DateFormat.getBestDateTimePattern(Locale.US, "EEE, MMM dd, yyyy");
        return DateFormat.format(df, mDate).toString();
   }

}
