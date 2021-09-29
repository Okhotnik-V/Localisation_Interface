package com.company.localisation_interface.model;

import com.company.localisation_interface.ui.Localization;

public class Ukrainian implements Localization {
    String male = "Привіт пане ";
    String female = "Привіт пані ";

    public String getMale (){
        return male;
    }

    public String getFemale (){
        return female;
    }
}
