package com.dan.builditbigger.backend;

import com.dan.builtitbigger.javajokes.Joker;

/**
 * The object model for the data we are sending through endpoints
 */
public class GCEJoker {

    private String mJoke;

    public GCEJoker() {
        mJoke = new Joker().getJoke();
    }

    public String getJoke() {
        return mJoke;
    }

}