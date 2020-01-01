package com.esm.DSProject2;
import java.util.Scanner;

public class Api {
    public static void main(String[] args) {
        System.out.println("Welcome. 2nd project of Data Structures");
        System.out.println("Enter any command");
        Scanner sc = new Scanner(System.in);
        String command = sc.nextLine();
        DataStructure ds = new DataStructure();
        while (true) {
            if (command.contains("Show sup of 2 sets")) {
                float sup = ds.sup(command);
                System.out.println(sup * 100 + "%");
            } else if (command.contains("Show conf of 2 sets")) {
                float conf = ds.conf(command);
                System.out.println(conf*100 + "%");
            } else if (command.contains("Show all sets with sups more than")) {
                ds.apriori(command);
            } else if (command.contains("file")) {
                System.out.print("Enter File Path: ");
                ds.fromFile(sc.nextLine());
            } else if (command.contains("insert")) {
                System.out.println("Enter your products separated by (;) :");
                ds.insert(sc.nextLine());
            } else if (command.equals("exit")) {
                break;
            } else {
                System.out.println("Invalid Command");
            }
            command = sc.nextLine();
        }
    }
}
