package com.company.localisation_interface;


import com.company.localisation_interface.model.AbstractWriter;
import com.company.localisation_interface.ui.Written;

public class Main {
    public static void main(String[] args) {
        Written written = new AbstractWriter();
        System.out.println(written.write());
    }
}
