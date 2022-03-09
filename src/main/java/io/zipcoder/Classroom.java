package io.zipcoder;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

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
        int x =0;
        if(this.students.length > 0) {
            for (Student s : students)
                x++;
        }
            if (this.students.length != x+1)
            students[x] = student;
            else
                System.out.println("No room");
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

   public int lexographicalIsEqual(String name1, String name2){
        //return 1 if name1 is greater, 0 if name2 is greater and -1 if equal
       for(int x = 0;x<name1.length()-1;x++) {
           if(name2.length()<x) {
               return 0;
           }
           if(name1.charAt(x)>name2.charAt(x)) {
               return 1;
           }
       }
       return -1;
   }

    public Student[] getStudentsByScore(){
        Student temp;
        for(int i =0;i<students.length-1;i++) {
            for (int y = 0; y < students.length - i; y++) {
                if (this.students[y].getAverageExamScore() > this.students[y + 1].getAverageExamScore()) {
                    temp = this.students[y];
                    this.students[y] = this.students[y + 1];
                    this.students[y + 1] = temp;
                } else if (this.students[y].getAverageExamScore() == this.students[y + 1].getAverageExamScore()) {
                    if ((lexographicalIsEqual(this.students[y].getLastName(), this.students[y + 1].getLastName())) == 1) {
                        temp = this.students[y];
                        this.students[y] = this.students[y + 1];
                        this.students[y + 1] = temp;
                    } else if((lexographicalIsEqual(this.students[y].getLastName(), this.students[y + 1].getLastName())) == -1){
                        if ((lexographicalIsEqual(this.students[y].getFirstName(), this.students[y + 1].getFirstName())) == 1) {
                            temp = this.students[y];
                            this.students[y] = this.students[y + 1];
                            this.students[y + 1] = temp;
                        }
                    }
                  }
                }
            }
            return this.students;
        }

    public Map getGradeBook() {
        int studentCount = this.students.length;
        int[]grade = {10,29,50,89,100};
        int y,z=0, x=0;
        Student[] studentsToMap = new Student[studentCount];
        studentsToMap = getStudentsByScore();
        Map studentsByGrade = new HashMap();
        while (x < studentCount) {
            y = (grade[z] * studentCount) / 100;
            while (x < y){
                studentsByGrade.put('A', studentsToMap[x]);
                x++;
            }
            z++;
        }
        return studentsByGrade;
    }


}
