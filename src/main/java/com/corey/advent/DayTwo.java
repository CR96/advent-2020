package com.corey.advent;

public class DayTwo {

    public static String[] passwords = new String[]{
            "1-3 a: abcde",
            "1-3 b: cdefg",
            "2-9 c: ccccccccc"
    };

    public static void main(String[] args) {
        int validPasswords = 0;
        for (int i = 0; i < passwords.length; i++) {
            if (isPasswordValid(passwords[i])) {
                validPasswords++;
            }
        }
        System.out.println(validPasswords);
    }

    public static boolean isPasswordValid(String policyAndPassword) {
        String policy = policyAndPassword.split(":")[0];
        String password = policyAndPassword.split(":")[1];

        int policyLowerLimit = Integer.parseInt(policy.split("-")[0]);
        int policyUpperLimit = Integer.parseInt(policy.split("-")[1].split(" ")[0]);
        String policyLetter = policy.split(" ")[1];

        int charCount = 0;
        for (int i = 0; i < password.length(); i++) {
            if (String.valueOf(password.charAt(i)).equals(policyLetter)) {
                charCount++;
            }
        }
        if (charCount >= policyLowerLimit && charCount <= policyUpperLimit) {
            return true;
        }
        return false;
    }


}
