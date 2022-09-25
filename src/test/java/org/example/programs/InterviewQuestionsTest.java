package org.example.programs;

import static org.junit.jupiter.api.Assertions.*;

class InterviewQuestionsTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void factorial() {
        //factorial() in InterviewQuestions class should return 1 when you pass 1 to it.
        assertEquals(1,InterviewQuestions.factorial(1));
        assertEquals(6,InterviewQuestions.factorial(3));
        assertEquals(720,InterviewQuestions.factorial(6));
    }
}