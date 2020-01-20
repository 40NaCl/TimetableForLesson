package jp.ac.uryukyu.ie;

import javax.naming.spi.StateFactory;

public class LessonData {
    private String  StudentName;
    private String TeacherName;
    private String subject;
    private String month;
    private String day;
    private String hour;
    private String minute;

    public String getStudentName() {
        return StudentName;
    }
    public String getTeacherName() {
        return TeacherName;
    }
    public String getSubject() {
        return subject;
    }
    public String getMonth() {
        return month;
    }
    public String getDay() {
        return day;
    }
    public String getHour() {
        return hour;
    }
    public String getMinute() { return minute; }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    public void setTeacherName(String teacherName) {
        TeacherName = teacherName;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public void setMinute(String minute) {
        this.minute = minute;
    }


    @Override
    public String toString(){
        return StudentName + " " + subject + " "
                + month + "月" + day + "日" + hour + "時" + minute + "分 "
                + TeacherName;
    }


}




