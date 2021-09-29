package com.company.localisation_interface.model;


import com.company.localisation_interface.ui.Localization;

public class English implements Localization {

    private String male = "Hello Sir ";
    private String female = "Hello Miss ";
    public String sc_male = "Hello scotish Sir ";
    public String sc_female = "Hello scotish Miss ";

    public String getMale (){
        return male;
    }

    public String getFemale (){
        return female;
    }

}
