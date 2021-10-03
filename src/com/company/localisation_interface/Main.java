package com.company.localisation_interface;

import com.company.localisation_interface.model.Writer;
import com.company.localisation_interface.ui.Written;

public class Main {
    public static void main(String[] args) {
        Written written = new Writer();
        System.out.println(written.write());
    }
}
