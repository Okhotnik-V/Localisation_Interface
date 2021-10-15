package com.company.localisation_interface.model;

import com.company.localisation_interface.ui.*;
import java.util.Scanner;

public class DefineLanguage implements DefineL {
    Lingual lingual = new Language();
    Sexual sexual = new Sex();
    Dating dating = new Date();
    Localization ua = new Ukrainian();
    Localization eng = new English();
    Localization sc = new Scottish();
    Numbered numbered = new Number();

    @Override
    public String define(String name, Scanner scanner) {
        String greeting;
        if (lingual.determine(name)){ // true - english
            System.out.println("Your location is Scotland? 1-YES,  Others-NO");
            if (numbered.digitize(scanner) == 1){ //Scottish
                if (sexual.define()){ // true - man
                    greeting = sc.getMale() + name + " " + dating.data();
                } else { //woman
                    greeting = sc.getFemale() + name + " " + dating.data();
                }
            } else { // ENG
                if (sexual.define()){ // true - man
                    greeting = eng.getMale() + name + " " + dating.data();
                } else { //woman
                    greeting = eng.getFemale() + name + " " + dating.data();
                }
            }
        } else { //UKR
            if (sexual.define()){ // true - man
                greeting = ua.getMale() + name + " " + dating.data();
            } else { //woman
                greeting = ua.getFemale() + name + " " + dating.data();
            }
        }
        return greeting;
    }
}
