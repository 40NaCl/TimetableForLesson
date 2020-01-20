package jp.ac.uryukyu.ie;

import java.util.ArrayList;
import java.util.List;

public class MasterDataListTest {
    public static void main(String[] args){
        List<MasterDataList> MList = new ArrayList<MasterDataList>();
        MasterDataList MData;

        //以下LessonDataの編集ーーーーーーーーーーーーーーーーーーーーーー
        List<LessonData> list;
        LessonData data;

        MData = new MasterDataList();
        list = new ArrayList<LessonData>();
        data = new LessonData();
        data.setStudentName("太郎くん");
        data.setTeacherName("佐藤先生");
        data.setSubject("数学");
        data.setMonth(1);
        data.setDay(4);
        data.setTime(1400);
        list.add(data);

        MData.setLessoninfo(list);
        MList.add(MData);

        System.out.println(MList.get(0).getLessoninfo());


    }
}
