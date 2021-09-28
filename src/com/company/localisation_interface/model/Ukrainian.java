package com.company.localisation_interface.model;

import com.company.localisation_interface.ui.Dating;
import com.company.localisation_interface.ui.Sexual;
import com.company.localisation_interface.ui.Verbal;

public class Ukrainian implements Verbal {

    @Override
    public int localize (String name){
        int local = 1;
        ukrainianize(name);
        return local;
    }

    public int ukrainianize (String name){
        Sexual sex = new Sex();
        Dating time = new Date();
        if (sex.define(time.data()) == true) {
            System.out.println("Привіт пане " + name + " " + time.data());
        }
        else {
            System.out.println("Привіт пані " + name + " " + time.data());
        }
        return 0;
    }
}
