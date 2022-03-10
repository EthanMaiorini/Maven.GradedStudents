package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

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
    public void testGetStudent2() {
        // : Given
        String firstName = "Mike";
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
    public void testGetStudentsByScore2() {
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
        String firstName2 = "Bob";
        String lastName2 = "Maiorini";
        ArrayList<Double> examScores2 = new ArrayList<>();
        examScores2.add(107.0);
        examScores2.add(150.0);
        examScores2.add( 250.0);
        examScores2.add(90.0);
        Student student2 = new Student(firstName2, lastName2, examScores2);
        String firstName3 = "Lou";
        String lastName3 = "Dam";
        ArrayList<Double> examScores3 = new ArrayList<>();
        examScores3.add(80.0);
        examScores3.add(180.0);
        examScores3.add( 150.0);
        examScores3.add(40.0);
        Student student3 = new Student(firstName3, lastName3, examScores3);
        String firstName4 = "Robert";
        String lastName4 = "Williams";
        ArrayList<Double> examScores4 = new ArrayList<>();
        examScores4.add(65.0);
        examScores4.add(50.0);
        examScores4.add( 50.0);
        examScores4.add(70.0);
        Student student4 = new Student(firstName4, lastName4, examScores4);
        Student[] students = new Student[]{student,student1,student2,student3,student4};
        Classroom classroom = new Classroom(students);
        classroom.addStudent(student);
        classroom.addStudent(student1);
        classroom.addStudent(student2);
        classroom.addStudent(student3);
        classroom.addStudent(student4);
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
        Classroom classroom = new Classroom(5);
        classroom.addStudent(student);
        classroom.addStudent(student1);

        //when
        //System.out.println( classroom.getGradeBook());
        Map map = new HashMap(classroom.getGradeBook());
        Assert.assertEquals('B',map.get(student1));

    }

    @Test
    public void testGetGradeBook2() {
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
        String firstName2 = "Bob";
        String lastName2 = "Maiorini";
        ArrayList<Double> examScores2 = new ArrayList<>();
        examScores2.add(107.0);
        examScores2.add(150.0);
        examScores2.add( 250.0);
        examScores2.add(90.0);
        Student student2 = new Student(firstName2, lastName2, examScores2);
        String firstName3 = "Lou";
        String lastName3 = "Dam";
        ArrayList<Double> examScores3 = new ArrayList<>();
        examScores3.add(80.0);
        examScores3.add(180.0);
        examScores3.add( 150.0);
        examScores3.add(40.0);
        Student student3 = new Student(firstName3, lastName3, examScores3);
        String firstName4 = "Robert";
        String lastName4 = "Williams";
        ArrayList<Double> examScores4 = new ArrayList<>();
        examScores4.add(65.0);
        examScores4.add(50.0);
        examScores4.add( 50.0);
        examScores4.add(70.0);
        Student student4 = new Student(firstName4, lastName4, examScores4);
        Classroom classroom = new Classroom(5);
        classroom.addStudent(student);
        classroom.addStudent(student1);
        classroom.addStudent(student2);
        classroom.addStudent(student3);
        classroom.addStudent(student4);

        //when
        Map map = new HashMap(classroom.getGradeBook());

//        System.out.println( classroom.getGradeBook());
         Assert.assertEquals('C',map.get(student1));

    }

    @Test
    public void testAddStudent() {
        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        ArrayList<Double> examScores = new ArrayList<>();
        examScores.add(100.0);
        examScores.add(150.0);
        examScores.add(250.0);
        examScores.add(0.0);
        Student student = new Student(firstName, lastName, examScores);
        Classroom classroom = new Classroom(1);
        classroom.addStudent(student);
        String firstName3 = "Lou";
        String lastName3 = "Dam";
        ArrayList<Double> examScores3 = new ArrayList<>();
        examScores3.add(80.0);
        examScores3.add(180.0);
        examScores3.add( 150.0);
        examScores3.add(40.0);
        Student student3 = new Student(firstName3, lastName3, examScores3);
        classroom.addStudent(student3);


        // When
        Student[] students = classroom.getStudent();
        String output = "";
        int x =0;
        while((x<students.length)&&(students[x] != null)) {
            output += students[x].toString();
            x++;
        }

        // Then
        String result = ("Student Name: Leon Hunter \n> Average Score: 125.0 \nExam Scores: \n   Exam 1 -> 100.0 \n   Exam 2 -> 150.0 \n   Exam 3 -> 250.0 \n   Exam 4 -> 0.0 \n");
        Assert.assertEquals(result,output);
    }
}
