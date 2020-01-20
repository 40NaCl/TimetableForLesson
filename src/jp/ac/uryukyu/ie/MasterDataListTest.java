package jp.ac.uryukyu.ie;

import java.util.ArrayList;
import java.util.List;

public class MasterDataListTest {
    public static void main(String[] args){
        List<MasterDataList> MstList = new ArrayList<MasterDataList>();
        MasterDataList Mdata;

        //以下LessonDataの編集ーーーーーーーーーーーーーーーーーーーーーー
        List<LessonData> list;
        LessonData data;

        Mdata = new MasterDataList();
        list = new ArrayList<LessonData>();
        data = new LessonData();

        data.setStudentName("太郎くん");
        data.setTeacherName("佐藤先生");
        data.setSubject("数学");
        data.setMonth(1);
        data.setDay(4);
        data.setHour(14);
        data.setMinute(00);
        list.add(data);

        Mdata.setLessoninfo(list);
        MstList.add(Mdata);

        System.out.println(MstList.get(0).getLessoninfo());


    }
}
