package jp.ac.uryukyu.ie;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class CreateSortName {
    private List<LessonData> list = createSortName();

    public List<LessonData> getList() { return list; }
    public void setList(List<LessonData> list) { this.list = list; }

    public List createSortName() {
        List<LessonData> list;
        LessonData data;


        data = new LessonData();

        data.setStudentName("生徒");
        data.setTeacherName("担当講師");
        data.setSubject("教科");
        data.setMonth("月");
        data.setDay("日");
        data.setHour("時");
        data.setMinute("分");
        list = new ArrayList<>(Arrays.asList(data));

        return list;
    }

}



