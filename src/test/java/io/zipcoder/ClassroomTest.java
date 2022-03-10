package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class ClassroomTest {

    @Test
    public void testGetStudent() {
        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        ArrayList<Double> examScores = new ArrayList<>();
        examScores.add(100.0);
        examScores.add(150.0);
        examScores.add(250.0);
        examScores.add(0.0);
        Student student = new Student(firstName, lastName, examScores);
        Classroom classroom = new Classroom();
        classroom.addStudent(student);

        // When
        Student[] students = classroom.getStudent();
        String output = "";
        int x =0;
        while(students[x] != null) {
            output += students[x].toString();
            x++;
        }

        // Then
        String result = ("Student Name: Leon Hunter \n> Average Score: 125.0 \nExam Scores: \n   Exam 1 -> 100.0 \n   Exam 2 -> 150.0 \n   Exam 3 -> 250.0 \n   Exam 4 -> 0.0 \n");
        Assert.assertEquals(result,output);
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
        Classroom classroom = new Classroom();
        classroom.addStudent(student);
        //when
        Double scores = classroom.getAverageExamScore();
        //then
        Assert.assertEquals(result,scores);
    }

    @Test
    public void testRemoveStudent() {
        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        ArrayList<Double> examScores = new ArrayList<>();
        examScores.add(100.0);
        examScores.add(150.0);
        examScores.add( 250.0);
        examScores.add(0.0);
        Student student = new Student(firstName, lastName, examScores);
        String firstName1 = "Ethan";
        String lastName1 = "Maiorini";
        ArrayList<Double> examScores1 = new ArrayList<>();
        examScores.add(107.0);
        examScores.add(150.0);
        examScores.add( 250.0);
        examScores.add(90.0);
        Student student1 = new Student(firstName1, lastName1, examScores1);
        Classroom classroom = new Classroom();
        classroom.addStudent(student);
        classroom.addStudent(student1);
        //when
        classroom.removeStudent("Ethan","Maiorini");
        Student[] students = classroom.getStudent();
        String output = "";
        int x =0;
        while(students[x] != null) {
            output += students[x].toString();
            x++;
        }
        //then
        String result = ("Student Name: Leon Hunter \n> Average Score: 125.0 \nExam Scores: \n   Exam 1 -> 100.0 \n   Exam 2 -> 150.0 \n   Exam 3 -> 250.0 \n   Exam 4 -> 0.0 \n");
        Assert.assertEquals(result,output);
    }

    @Test
    public void testGetStudentsByScore() {
        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        ArrayList<Double> examScores = new ArrayList<>();
        examScores.add(100.0);
        examScores.add(150.0);
        examScores.add( 250.0);
        examScores.add(0.0);
        Student student = new Student(firstName, lastName, examScores);
        String firstName1 = "Ethan";
        String lastName1 = "Maiorini";
        ArrayList<Double> examScores1 = new ArrayList<>();
        examScores1.add(107.0);
        examScores1.add(150.0);
        examScores1.add( 250.0);
        examScores1.add(90.0);
        Student student1 = new Student(firstName1, lastName1, examScores1);
        Classroom classroom = new Classroom(2);
        classroom.addStudent(student);
        classroom.addStudent(student1);
        //when
        Student[] classNew = classroom.getStudentsByScore();
        String output = "";
        int x =0;
        while((x<classNew.length)&& (classNew[x] != null)) {
            output += classNew[x].toString();
            x++;
        }
        System.out.println(output);

    }

    @Test
    public void testGetGradeBook() {
        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        ArrayList<Double> examScores = new ArrayList<>();
        examScores.add(100.0);
        examScores.add(150.0);
        examScores.add( 250.0);
        examScores.add(0.0);
        Student student = new Student(firstName, lastName, examScores);
        String firstName1 = "Ethan";
        String lastName1 = "Maiorini";
        ArrayList<Double> examScores1 = new ArrayList<>();
        examScores1.add(107.0);
        examScores1.add(150.0);
        examScores1.add( 250.0);
        examScores1.add(90.0);
        Student student1 = new Student(firstName1, lastName1, examScores1);
        Classroom classroom = new Classroom(2);
        classroom.addStudent(student);
        classroom.addStudent(student1);

        //when
        System.out.println( classroom.getGradeBook());


    }
}
