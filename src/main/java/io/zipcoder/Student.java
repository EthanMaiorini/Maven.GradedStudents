package io.zipcoder;

import java.util.ArrayList;

public class Student {

    private String firstName;
    private String lastName;
    ArrayList<Double> examScores;


    public Student(String firstName, String lastName, ArrayList<Double> examScores) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores = new ArrayList<>();
        this.examScores.addAll(examScores);
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void addExamScore(Double examScore){
         examScores.add(examScore);
    }

    public String getExamScores(){
        String output = "Exam Scores: \n";
        int x = 1;
        String result;
        for(Double e:examScores){
            result = String.format("   Exam "+x+" -> "+e+" \n");
            output = output.concat(result);
            x++;
        }
        return output;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }


    public int getNumberOfExamsTaken(){
        return examScores.size();
    }

    public void setExamScore(int examNumber, double examScore) {
        examScores.set(examNumber-1, examScore);
    }

    public double getAverageExamScore() {
        int x = 0;
        Double result = 0.0;
        for(Double e:examScores){
           result += e;
           x++;
        }
        result = result/x;
        return result;
    }

    public String toString(){
        String output;
        String average;
        Double avg = this.getAverageExamScore();
        output = "Student Name: "+firstName+" "+lastName+" \n";
        average = "> Average Score: "+ avg+" \n";
        output = output.concat(average);
        output = output.concat(this.getExamScores());
        return output;
    }
}
