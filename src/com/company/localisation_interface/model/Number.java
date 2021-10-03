package com.company.localisation_interface.model;

import com.company.localisation_interface.ui.Numbered;
import java.util.Scanner;

public class Number implements Numbered {

    @Override
    public int digitize(Scanner scanner) { //Number check
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
