package com.company.localisation_interface.model;

import com.company.localisation_interface.ui.Scanned;

import java.util.Scanner;

public class Scann implements Scanned {

    public String scanning (String scann, Scanner scanner){ //Check that is strictly empty or null
        if(scann != null && !scann.trim().isEmpty()) {}
        else {
            System.out.println("Error. Enter information!");
            scann = scanner.nextLine();
        }
        return scann;
    }
}
