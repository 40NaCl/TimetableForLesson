package jp.ac.uryukyu.ie;

import java.util.ArrayList;
import java.util.List;


public class MasterDataList {
    public List<LessonData> Lessoninfo;

    public List<LessonData>getLessoninfo(){
        return Lessoninfo;
    }

    public void setLessoninfo(List<LessonData> lessoninfo) {
        Lessoninfo = lessoninfo;
    }
}
