
/* As our assignment requirement, it should include
Implementation of control flows (If/else) to handle user input,
I am still working on it, I still don't get it in what way I can implement on it.
 */
package com.Craft.Wassie;

import java.util.Scanner;

    public class GradeCalculator {
        public static void main(String[] args) {
            System.out.println("Welcome to the Grade Calculator!");

            Scanner scanner = new Scanner(System.in);
            System.out.print("How many subject do you have: ");
            int numSubjects = scanner.nextInt();

            // Create an array to store the scores of each subject
            double[] scores = new double[numSubjects];

            // Collect scores for each subject
            for (int i = 0; i < numSubjects; i++) {
                System.out.print("Enter the score for subject " + (i + 1) + ": ");
                scores[i] = scanner.nextDouble();
            }

            // Calculate the total score
            double totalScore = 0;
            for (double score : scores) {
                totalScore += score;
            }

            // Calculate the average grade
            double averageGrade = totalScore / numSubjects;

            // Display the average grade
            System.out.println("The average grade is: " + averageGrade);

            scanner.close();
        }
    }



