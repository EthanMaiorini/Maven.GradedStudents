package io.zipcoder;

import java.util.Arrays;

public class Classroom {
    Student[] students;

    public Classroom(int maxStudents) {
        this.students = new Student[maxStudents];
    }

    public Classroom(Student[] students){
        this.students = Arrays.copyOf(students,students.length);
    }

    public Classroom() {
        this(30);
    }

    public Student[] getStudent() {
        if(students.length>0)
        return students;
        else
            return null;
    }

   public Double getAverageExamScore(){
        int x = 0;
        double getScore = 0.0;
        for(Student s: students){
            getScore += s.getAverageExamScore();
            x++;
        }
        getScore = getScore/x;
        return getScore;
   }

    public void addStudent(Student student){
        if(this.students.length > 0){
            int x =0;
            for(Student s:students)
                x++;
            if (this.students.length != x)
            students[x] = student;
            else
                System.out.println("No room");
        }
    }

   public void removeStudent(String firstName, String lastName){
        Student[] removeStudent = new Student[students.length];
        int x = 0;
        for(Student s:this.students){
            if (!(s.getLastName().equals(lastName))&&(!(s.getFirstName().equals(firstName)))) {
                removeStudent[x] = s;
            }
            x++;
        }
        this.students = Arrays.copyOf(removeStudent,students.length);
   }

    public Student[] getStudentsByScore(){
        Student temp;
        for(int i =0;i<students.length-1;i++) {
            for (int y = 0; y < students.length - i; y++) {
                if (this.students[y].getAverageExamScore() > this.students[y + 1].getAverageExamScore()) {
                    temp = this.students[y];
                    this.students[y] = this.students[y + 1];
                    this.students[y + 1] = temp;
                }else if (this.students[y].getAverageExamScore() == this.students[y + 1].getAverageExamScore()){
                    if(compare names)
                        switch
                }
            }
        }
        return this.students;
    }

    public Student[] getGradeBook(){

    }

}
