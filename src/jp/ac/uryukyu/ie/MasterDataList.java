package jp.ac.uryukyu.ie;

import java.util.List;


public class MasterDataList {
    public List<LessonData> LessonDetails;

    public List<LessonData> getLessonDetails() {
        return LessonDetails;
    }

    public void setLessonDetails(List<LessonData> lessonDetails) { LessonDetails = lessonDetails; }
}
