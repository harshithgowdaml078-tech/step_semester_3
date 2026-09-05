package week1.class_problems;

import java.util.Random;

public class BmiWellness {

    public static void main(String[] args) {
        int teamSize = 10;
        double[] heights = new double[teamSize];
        double[] weights = new double[teamSize];

        Random rand = new Random();
        for (int i = 0; i < teamSize; i++) {
            heights[i] = 1.50 + rand.nextDouble() * 0.5;   // 1.50 - 2.00 m
            weights[i] = 50 + rand.nextDouble() * 60;      // 50 - 110 kg
        }

        printWellnessReport(heights, weights);
    }

    static String getBmiStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        if (bmi < 25) return "Normal";
        if (bmi < 30) return "Overweight";
        return "Obese";
    }

    static void printWellnessReport(double[] heights, double[] weights) {
        System.out.println("Person | Height (m) | Weight (kg) | BMI   | Status");
        for (int i = 0; i < heights.length; i++) {
            double bmi = weights[i] / (heights[i] * heights[i]);
            String status = getBmiStatus(bmi);
            System.out.printf("%-6d | %-10.2f | %-11.2f | %-5.2f | %s%n",
                    i + 1, heights[i], weights[i], bmi, status);
        }
    }
}
