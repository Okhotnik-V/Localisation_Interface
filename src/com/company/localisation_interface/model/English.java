package com.company.localisation_interface.model;

import com.company.localisation_interface.ui.Dating;
import com.company.localisation_interface.ui.Localized;
import com.company.localisation_interface.ui.Sexual;
import com.company.localisation_interface.ui.Verbal;

import java.util.Scanner;

public class English implements Verbal {

    Sexual SEX = new Sex();
    Dating TIME = new Date();

    @Override
    public int localize (String name){
        Scanner scanner = new Scanner(System.in);
        Localized locality = new Scottish();
        System.out.println("Do you live in Scotland? 1-Yes 2-No");
        int local = scanner.nextInt();
        if (local == 1){
            locality.locality(name);
        }
        else {
        anglicize(name);
        }
        return local;
    }

    public Boolean anglicize (String name){
        if (SEX.define(TIME.data()) == true) {
            System.out.println("Hello Sir " + name + " " + TIME.data());
        }
        else {
            System.out.println("Hello Miss " + name + " " + TIME.data());
        }
        return SEX.define(TIME.data());
    }

}
