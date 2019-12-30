package com.esm.DSProject2;
import java.util.Scanner;

public class Api {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String command = sc.nextLine();
        DataStructure ds = new DataStructure();
        while (true) {
            if (command.contains("Show‬‬ ‫‪sup‬‬ ‫‪of‬‬ ‫‪2‬‬ ‫‪sets‬‬")) {
                ds.sup(command);
            } else if (command.contains("Show‬‬ ‫‪conf‬‬ ‫‪of‬‬ ‫‪2‬‬ ‫‪sets‬‬")) {
                ds.conf(command);
            } else if (command.contains("‫‪Show‬‬ ‫‪all‬‬ ‫‪sets‬‬ ‫‪with‬‬ ‫‪sups‬‬ ‫‪more‬‬")) {
                // TODO : 3rd function call
            } else if (command.contains("file")) {
                System.out.print("Enter File Path: ");
                ds.fromFile(sc.nextLine());
            } else if (command.contains("insert")) {
                ds.insert(command);
            } else if (command.equals("exit")) {
                break;
            } else {
                System.out.println("Invalid Command");
            }
        }
    }
}
