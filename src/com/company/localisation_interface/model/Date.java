package com.company.localisation_interface.model;

import com.company.localisation_interface.ui.Dating;

import java.sql.Timestamp;

public class Date implements Dating {

    @Override
    public String data (){
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        String date = timestamp.toString();
        return date;
    }
}
