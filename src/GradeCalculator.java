/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Mycha Shem Jimenea
 */
import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int studentCount = input.nextInt();
        input.nextLine(); // consume newline

        String[] names = new String[studentCount];
        double[] averages = new double[studentCount];

        for (int i = 0; i < studentCount; i++) {
            System.out.println("\nStudent " + (i + 1));
            System.out.print("Name: ");
            names[i] = input.nextLine();

            System.out.print("Enter number of subjects: ");
            int subjectCount = input.nextInt();
            double total = 0;

            for (int j = 0; j < subjectCount; j++) {
                System.out.print("Grade for subject " + (j + 1) + ": ");
                total += input.nextDouble();
            }

            averages[i] = total / subjectCount;
            input.nextLine(); 
        }

        System.out.println("\n--- Student Results ---");
        for (int i = 0; i < studentCount; i++) {
            String remark = averages[i] >= 75 ? "Passed" : "Failed";
            System.out.printf("%s - Average: %.2f - %s%n", names[i], averages[i], remark);
        }

        input.close();
    }
}
