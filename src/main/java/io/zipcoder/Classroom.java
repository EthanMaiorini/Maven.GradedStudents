package io.zipcoder;

import java.util.ArrayList;
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
        if (students.length > 0)
                return students;
            else
                return null;
        }

   public Double getAverageExamScore(){
        int x = 0;
        double getScore = 0.0;
      //  for(Student s: students){
       int i =0;
       while((this.students[i] != null)&& (i<students.length-1)){
            getScore += this.students[i].getAverageExamScore();
            i++;
            x++;
        }
        getScore = getScore/x;
        return getScore;
   }

    public void addStudent(Student student){
        int x =0;
        while((this.students[x] != null)&& (x<students.length-1)) {
                x++;
        }
            if (students.length > x)
            students[x] = student;
            else
                System.out.println("No room");
        }

   public void removeStudent(String firstName, String lastName){
        Student[] removeStudent = new Student[students.length];
        int x = 0;
       while(x<students.length-1) {
           if(students[x] !=null) {
               if (!(students[x].getLastName().equals(lastName)) && (!(students[x].getFirstName().equals(firstName)))) {
                   removeStudent[x] = students[x];
               }
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

   public Student[] switchArr(Student[]students,int value){

       Student temp = students[value];
       students[value] = students[value + 1];
       students[value + 1] = temp;
       return  students;
   }

    public Student[] getStudentsByScore(){
       int length = students.length -1;
        for(int i =0;i<length;i++) {
            for (int y = 0; y < length- i; y++) {
                if ((this.students[y] != null)&&(this.students[y+1] != null)) {
                    if ((this.students[y].getAverageExamScore()) < (this.students[y + 1].getAverageExamScore())) {
                        this.students = switchArr(this.students, y);
                    } else if (this.students[y].getAverageExamScore() == this.students[y + 1].getAverageExamScore()) {
                        if ((lexographicalIsEqual(this.students[y].getLastName(), this.students[y + 1].getLastName())) == 1) {
                            this.students = switchArr(this.students, y);
                        } else if ((lexographicalIsEqual(this.students[y].getLastName(), this.students[y + 1].getLastName())) == -1) {
                            if ((lexographicalIsEqual(this.students[y].getFirstName(), this.students[y + 1].getFirstName())) == 1) {
                                this.students = switchArr(this.students, y);
                            }
                        }
                    }
                }else if (students[y] == null) removeStudent(students[y].getFirstName(),students[y].getLastName());
                else if(students[y+1] == null) removeStudent(students[y+1].getFirstName(),students[y+1].getLastName());
            }
            }
            return this.students;
        }

    public Map<Student, Character> getGradeBook() {
        int studentCount = this.students.length;
        int[]grade = {10,29,50,89,100};
        Character[] gradeValue = {'A','B','C','D','F'};
        int y,z=0, x=0;
        Student[] studentsToMap = getStudentsByScore();
        Map studentsByGrade = new HashMap();
        while (x < studentCount) {
            y = (grade[z] * studentCount) / 100;
            while ((x < y)&&(studentsToMap[x] != null)){
                studentsByGrade.put(studentsToMap[x],gradeValue[z]);
                x++;
            }
            z++;
        }
        return studentsByGrade;
    }


}
