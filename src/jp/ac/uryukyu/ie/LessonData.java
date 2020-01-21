package jp.ac.uryukyu.ie;

public class LessonData {
    private String  studentName;
    private String teacherName;
    private String subject;
    private String month;
    private String day;
    private String hour;
    private String minute;

    public String getStudentName() {
        return studentName;
    }
    public String getTeacherName() {
        return teacherName;
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
        this.studentName = studentName;
    }

    public void setTeacherName(String teacherName) {this.teacherName = teacherName;}

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
        return studentName + subject + month + day + hour + minute + teacherName;
    }


}




