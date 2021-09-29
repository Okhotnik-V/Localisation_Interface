package com.company.localisation_interface.model;

import com.company.localisation_interface.ui.Localization;

public class Scottish extends English implements Localization {


    @Override
    public String getMale() {
        return super.sc_male;
    }

    @Override
    public String getFemale() {
        return super.sc_female;
    }


}
