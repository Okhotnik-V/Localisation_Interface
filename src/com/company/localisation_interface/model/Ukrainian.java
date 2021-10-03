package com.company.localisation_interface.model;

import com.company.localisation_interface.ui.Localization;

public class Ukrainian implements Localization {
    String hi = "Привіт ";
    String male = "пане ";
    String female = "пані ";

    @Override
    public String getMale(){
        return hi + male;
    }
    @Override
    public String getFemale() {
        return hi + female;
    }
}
