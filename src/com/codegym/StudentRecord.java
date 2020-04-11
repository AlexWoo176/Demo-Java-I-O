package com.codegym;

import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class StudentRecord {
    public static void main(String[] args) {
        double test1, test2, test3;
        double average;
        Scanner inFile = null;
        PrintWriter outFile = null;

        String name;

        try {
            FileReader fileReader = new FileReader("/home/alexwoo/IdeaProjects/test.txt");
            inFile = new Scanner(fileReader);
            outFile = new PrintWriter("testAvg.txt");

            while (inFile.hasNext()) {

                name = inFile.next();
                outFile.println("Student Name: " + name);

                test1 = inFile.nextDouble();
                test2 = inFile.nextDouble();
                test3 = inFile.nextDouble();

                outFile.printf("Test Scores: %5.2f %5.2f %5.2f %n", test1, test2, test3);
                average = (test1 + test2 + test3) / 3;
                outFile.printf("Average test score: %5.2f %n", average);
                outFile.println();
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            inFile.close();
            outFile.close();
        }
    }
}
