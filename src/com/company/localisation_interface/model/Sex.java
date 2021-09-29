package com.company.localisation_interface.model;

import com.company.localisation_interface.ui.Dating;
import com.company.localisation_interface.ui.Sexual;


public class Sex  implements Sexual {

    public boolean define () {
        Dating dating = new Date();
        String data = dating.data();
        data = data.substring(data.length() - 1);
        int date_3 = Integer.parseInt(data);
        boolean man = date_3 % 2 == 0 ;
        return man;

    }
}
