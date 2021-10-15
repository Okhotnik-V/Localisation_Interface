package com.company.localisation_interface.model;

import com.company.localisation_interface.ui.*;

import java.util.Scanner;

public class Writer implements Written {
    Scanned scanned = new Scann();
    DefineL defineL = new DefineLanguage();
    Scanner scanner = new Scanner(System.in);

    @Override
    public String write() {
        System.out.println("Hi what's your name?");
        String name = scanned.scanning(scanner.nextLine(), scanner);
        return defineL.define(name,scanner);
    }

}


