package com.company.localisation_interface.model;

import com.company.localisation_interface.ui.Localization;

public class English implements Localization {
    public String hi = "Hello ";
    public String male = "Sir ";
    public String female = "Miss ";

    @Override
    public String getMale(){
        return hi + male;
    }
    @Override
    public String getFemale(){
        return hi + female;
    }
}
