package com.pluralsight;
import java.util.*;
import java.io.*;
//The file pathing confuses me greatly.
public class BedtimeStories {
//Give them the menu
    public static void main(String[] args) {
        Scanner selected = new Scanner(System.in);
        int option;
        FileInputStream fis = null;
        String input;
        System.out.println("Pick a story: ");
        selected.nextLine();
        System.out.println("1. Mary had a little lamb?: ");
        System.out.println("2. Goldilocks?: ");
        System.out.println("3. Hansel and Gretel?: ");
        option = selected.nextInt();
//Hook it up Jamie, first one is shortest
        if (option == 1) {

            try {
                fis = new FileInputStream("src/main/resources/Mary.txt");
                Scanner selection = new Scanner(fis);
                while (selection.hasNextLine()) {
                    input = selection.nextLine();
                    System.out.println(input);
                }
                selection.close();
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);

            }
            //Goldilocks next
        } else if (option == 2) {

            try {
                fis = new FileInputStream("src/main/resources/Goldilocks.txt");
                Scanner selection = new Scanner(fis);

                while (selection.hasNextLine()) {
                    input = selection.nextLine();
                    System.out.println(input);
                }
                selection.close();
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } finally {
        if (option == 3) {
                    try {
                        fis = new FileInputStream("src/main/resources/Hansel.txt");
                        Scanner scanner = new Scanner(fis);

                        while (scanner.hasNextLine()) {
                            input = scanner.nextLine();
                            System.out.println(input);
                        }
                        scanner.close();

                    } catch (FileNotFoundException e) {
                        throw new RuntimeException(e);

                    }
                }

            }
        }
    }
}







