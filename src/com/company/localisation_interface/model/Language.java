package com.company.localisation_interface.model;

import com.company.localisation_interface.ui.Lingual;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Language implements Lingual {

    @Override
    public boolean determine(String name) {
        Pattern pattern = Pattern.compile("[" + "a-z A-Z" + "\\d" +  "\\s" + "\\p{Punct}" + "]" + "*");
        Matcher matcher = pattern.matcher(name);
        boolean result = matcher.matches();
        return result;
    }
}
