package jp.ac.uryukyu.ie;

public class LessonData {
    private String  StudentName;
    private String TeacherName;
    private String subject;
    private int month;
    private int day;
    private int time;

    public String getStudentName() {
        return StudentName;
    }

    public String getTeacherName() {
        return TeacherName;
    }

    public String getSubject() {
        return subject;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public int getTime() {
        return time;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    public void setTeacherName(String teacherName) {
        TeacherName = teacherName;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setTime(int time) {
        this.time = time;
    }

    //LessonData(String StudentName, String TeacherName, String subject, int month, int day, int time){
        //this.StudentName = StudentName;
        //this.TeacherName = TeacherName;
        //this.subject = subject;
        //this.month = month;
        //this.day = day;
        //his.time = time;
    }

