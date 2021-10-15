package com.company.localisation_interface.model;

import com.company.localisation_interface.ui.Localization;

public class Scottish extends English implements Localization {
    private String local = "scottish ";

    @Override
    public String getMale() {
        return super.hi + local + super.male;
    }
    @Override
    public String getFemale() {
        return super.hi + local + super.female;
    }

}
