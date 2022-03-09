package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class StudentTest {

    @Test
    public void testToString() {

        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        ArrayList<Double> examScores = new ArrayList<>();
        examScores.add(100.0);
        examScores.add(150.0);
        examScores.add( 250.0);
        examScores.add(0.0);
        Student student = new Student(firstName, lastName, examScores);

        // When
        String output = student.toString();

        // Then
       String result = ("Student Name: Leon Hunter \n> Average Score: 125.0 \nExam Scores: \n   Exam 1 -> 100.0 \n   Exam 2 -> 150.0 \n   Exam 3 -> 250.0 \n   Exam 4 -> 0.0 \n");
        Assert.assertEquals(output,result);
    }

    @Test
    public void testGetAverageExamScore() {
        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        ArrayList<Double> examScores = new ArrayList<>();
        examScores.add(100.0);
        examScores.add(150.0);
        examScores.add( 250.0);
        examScores.add(0.0);
        Student student = new Student(firstName, lastName, examScores);
        Double result = 125.0;

        // When
        Double output = student.getAverageExamScore();

        // Then
        Assert.assertEquals(output,result);

    }

    @Test
    public void testSetExamScore() {
        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        ArrayList<Double> examScores = new ArrayList<>();
        examScores.add(100.0);
        Student student = new Student(firstName, lastName, examScores);

        // When
        student.setExamScore(1, 150.0);
        String output = student.getExamScores();

        // Then
        String result = "Exam Scores: \n   Exam 1 -> 150.0 \n";
        Assert.assertEquals(output,result);
    }

    @Test
    public void testGetExamScores() {
        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        ArrayList<Double> examScores = new ArrayList<>();
        examScores.add(100.0);
        examScores.add(95.0);
        examScores.add( 123.0);
        examScores.add(96.0);
        Student student = new Student(firstName, lastName, examScores);

        // When
        String output = student.getExamScores();
        String result = "Exam Scores: \n   Exam 1 -> 100.0 \n   Exam 2 -> 95.0 \n   Exam 3 -> 123.0 \n   Exam 4 -> 96.0 \n";
        // Then
        Assert.assertEquals(output,result);
    }

    @Test
    public void testAddExamScore() {
        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        ArrayList<Double> examScores = new ArrayList<>();
        Student student = new Student(firstName, lastName, examScores);

        // When
        student.addExamScore(100.0);
        String output = student.getExamScores();

        // Then
        String result = "Exam Scores: \n   Exam 1 -> 100.0 \n";
        Assert.assertEquals(output,result);
    }
}