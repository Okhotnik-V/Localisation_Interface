package com.company.localisation_interface.model;

import com.company.localisation_interface.ui.Localized;

public class Scottish extends English implements Localized {

    public int locality (String name){
        if (SEX.define(TIME.data()) == true) {
            System.out.println("Hello scotish Sir " + name + " " + TIME.data());
        }
        else {
            System.out.println("Hello scotish Miss " + name + " " + TIME.data());
        }
        return 0;
    }
}
