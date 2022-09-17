package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;

public class Course {

    private String courseDepartment;
    private int courseNumber;
    private String courseTitle;
    private Teacher instructor;
    private ArrayList<Student> roster;

    public Course (String courseDepartment, int courseNumber, String courseTitle, Teacher instructor, ArrayList<Student> roster) {
        this.courseDepartment = courseDepartment;
        this.courseNumber = courseNumber;
        this.courseTitle = courseTitle;
        this.instructor = instructor;
        this.roster = roster;
    }

    public void setCourseDepartment (String aCourseDepartment) {
        this.courseDepartment = aCourseDepartment;
    }
    public void setCourseNumber (int aCourseNumber) {
        this.courseNumber = aCourseNumber;
    }
    public void setCourseTitle (String aCourseTitle) {
        this.courseTitle = aCourseTitle;
    }
    public void setInstructor (Teacher aInstructor) {
        this.instructor = aInstructor;
    }
    public void setRoster (ArrayList<Student> aRoster) {
        this.roster = aRoster;
    }

    public String getCourseDepartment () {
        return this.courseDepartment;
    }
    public int getCourseNumber () {
        return this.courseNumber;
    }
    public String getCourseTitle () {
        return this.courseTitle;
    }
    public Teacher getInstructor () {
        return this.instructor;
    }
    public ArrayList<Student> getRoster () {
        return this.roster;
    }
}
