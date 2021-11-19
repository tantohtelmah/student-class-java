package com.company;

public class Course {
    private String courseTitle;
    private double courseScore;

    public Course(String courseTitle, double courseScore) {
        this.courseTitle = courseTitle;
        this.courseScore = courseScore;
    }
    public Course(String courseTitle) {
        this.courseTitle = courseTitle;
        this.courseScore = 0.0;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public double getCourseScore() {
        return courseScore;
    }

    public void setCourseScore(double courseScore) {
        this.courseScore = courseScore;
    }
}
