package com.company.localisation_interface.model;

import com.company.localisation_interface.ui.Determinative;
import com.company.localisation_interface.ui.Verbal;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Language implements Determinative {
    @Override
    public boolean determine() {
        Scanner scanner = new Scanner(System.in);
        Verbal english = new English();
        Verbal ukrainian = new Ukrainian();
        System.out.println("Hi what's your name?");
        String name = scanner.nextLine();
        Pattern pattern = Pattern.compile("[" + "a-z A-Z" + "\\d" +  "\\s" + "\\p{Punct}" + "]" + "*");
        Matcher matcher = pattern.matcher(name);
        boolean result = matcher.matches();
        if (result == true) {
            english.localize(name);
        }
        else {
            ukrainian.localize(name);
        }
        return result;
    }
}
