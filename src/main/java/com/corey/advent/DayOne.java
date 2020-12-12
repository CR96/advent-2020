package com.corey.advent;

public class DayOne {

    static int[] expenseReport = new int[]{1721, 979, 366, 299, 675, 1456};

    public static void main(String[] args) {
        System.out.println(findProductOfThree(expenseReport));
    }

    // Find two numbers that add to 2020, then return their product
    public static int findProductOfTwo(int[] expenseReport) {

        for (int i = 0; i < expenseReport.length; i++) {
            for (int j = 1; j < expenseReport.length; j++) {
                if (expenseReport[i] + expenseReport[j] == 2020) {
                    return expenseReport[i] * expenseReport [j];
                }
            }
        }

        // Return -1 if no result found
        return -1;
    }

    // Find three numbers that add to 2020, then return their product
    public static int findProductOfThree(int[] expenseReport) {

        for (int i = 0; i < expenseReport.length; i++) {
            for (int j = 1; j < expenseReport.length; j++) {
                for (int k = 2; k < expenseReport.length; k++) {
                    if (expenseReport[i] + expenseReport[j] + expenseReport[k] == 2020) {
                        return expenseReport[i] * expenseReport[j] * expenseReport[k];
                    }
                }
            }
        }

        // Return -1 if no result found
        return -1;
    }
}