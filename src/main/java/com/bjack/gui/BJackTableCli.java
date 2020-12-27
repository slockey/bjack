package com.bjack.gui;

import java.util.Scanner;

public class BJackTableCli {

    public String getUserTextAction() {
        // TODO: harden this code
        Scanner scanner = new Scanner(System.in);
        boolean gotInput = false;
        String result = null;
        do {
            try {
                if (scanner.hasNext()) {
                    result = scanner.next();
                    gotInput = true;
                }
            } catch (Exception e) {
                // Issue with the scanner...
                System.out.println(String.format("Failed to get user input: %s", e.getMessage()));
                
            }
        } while (!gotInput);
        scanner.close();
        return result;
    }

    public void printTableState() {
        System.out.println("Print table state");
    }

}
