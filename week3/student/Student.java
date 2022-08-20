package week3.student;

import week3.department.Department;

public class Student extends Department {
    public void studentName(){
        System.out.println("My name is Stellah");
    }
    public void studentDept(){
        System.out.println("My dept is IT");
    }
    public void studentID(){
        System.out.println("My ID is 100IT18");
    }

    public static void main(String[] args) {
        //create object for Student
        Student obj = new Student();
        obj.collegeName();
        obj.collegeCode();
        obj.collegeRank();
        obj.deptName();
        obj.studentName();
        obj.studentID();
        obj.studentDept();
    }
}
