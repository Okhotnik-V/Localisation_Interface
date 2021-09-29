package com.company.localisation_interface.model;

import com.company.localisation_interface.ui.*;

import java.util.Scanner;

public class AbstractWriter implements Written {
    Lingual lingual = new Language();
    Sexual sexual = new Sex();
    Dating dating = new Date();
    Localization ua = new Ukrainian();
    Localization eng = new English();
    Localization sc = new Scottish();
    Scanner scanner = new Scanner(System.in);

    @Override
    public String write () {
        System.out.println("Hi what's your name?");
        String name = scanning(scanner.nextLine());
        return define(name);
    }

    private String define (String name){
        String greeting;
        if (lingual.determine(name)){ // true - english
            System.out.println("Your location is Scotland? 1-YES,  Others-NO");

            if (digitize(scanner) == 1){ //Scottish
                if (sexual.define()){ // true - man
                    greeting = sc.getMale() + name + " " + dating.data();
                }
                else { //woman
                    greeting = sc.getFemale() + name + " " + dating.data();
                }
            }

            else { // ENG

                if (sexual.define()){ // true - man
                    greeting = eng.getMale() + name + " " + dating.data();
                }
                else { //woman
                    greeting = eng.getFemale() + name + " " + dating.data();
                }
            }
        }

        else { //UKR
            if (sexual.define()){ // true - man
                greeting = ua.getMale() + name + " " + dating.data();
            }
            else { //woman
                greeting = ua.getFemale() + name + " " + dating.data();
            }
        }
        return greeting;
    }

    private String scanning (String scann){ //Check that is strictly empty or null
        if(scann != null && !scann.trim().isEmpty()) {}
        else {
            System.out.println("Error. Enter information!");
            scann = scanner.nextLine();
        }
        return scann;
    }

    private  int digitize (Scanner scanner) { //Number check
        int number;
        if (scanner.hasNextInt()) {
            number = scanner.nextInt();
        } else {
            System.out.println("Incorrect information, please enter a number.");
            scanner.nextLine();
            number = digitize(scanner);
        }
        return number;
    }

}


