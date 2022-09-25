package org.example.programs;

public class InterviewQuestions {
    public static int factorial(int input) {
        int result = 1;
        for (int i = 1; i <= input; i++) {
            result *= i;
        }
        return result;
    }
}
