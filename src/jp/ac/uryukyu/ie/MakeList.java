package jp.ac.uryukyu.ie;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class MakeList {
    public static void main(String[] args){
        List<MasterDataList> MstList = new ArrayList<MasterDataList>();
        MasterDataList Mdata;

        //以下LessonDataの編集ーーーーーーーーーーーーーーーーーーーーーー
        List<LessonData> list;
        LessonData data;

        Mdata = new MasterDataList();
        list = new ArrayList<LessonData>();
        data = new LessonData();

        boolean really = true;
        while (really) {

            question("生徒");
            data.setStudentName(scan());

            question("担当講師");
            data.setTeacherName(scan());

            question("教科");
            data.setSubject(scan());

            question("月");
            data.setMonth(scan());

            question("日付");
            data.setDay(scan());

            question("時刻(時)");
            data.setHour(scan());

            question("時刻(分)");
            data.setMinute(scan());

            list.add(data);
            System.out.println(data);
            System.out.println("\n\n本当にこの入力でよろしいでしょうか？" +"\n「yes」か「no」を入力してください。");

            boolean confirmation = true;
            while (confirmation) {
                if (scan().equals("yes")) {
                    System.out.println("時間割表に追加します");
                    confirmation = false;
                    really = false;
                }
                if (scan().equals("no")) {
                    System.out.println("最初からやり直してください");
                    confirmation = false;
                } else {
                    System.out.println("不明な単語が検出されました。もう一度入力してください。");
                }
            }
        }

        Mdata.setLessonDetails(list);
        MstList.add(Mdata);

        System.out.println(MstList.get(0).getLessonDetails());

    }

    public static void question(String sort){
        System.out.println("その授業の"+sort+"は？");
    }

    public static String scan(){
        Scanner sc1 = new Scanner(System.in);
        String line = sc1.nextLine();
        return line;
    }

}
