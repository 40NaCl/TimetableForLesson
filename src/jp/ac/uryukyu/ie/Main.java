package jp.ac.uryukyu.ie;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {

        boolean WontContinue = true;
        String Show = "表示";
        String LetItAdd = "作成";
        String Finish = "終了";
        List<List<LessonData>> masterDateList;
        int countListOfMDL = 0;

        CreateSortName createSortName;
        createSortName = new CreateSortName();

        masterDateList = new ArrayList<>(Arrays.asList(createSortName.getList()));
        countListOfMDL++;



        while (WontContinue) {
            System.out.println("\n\n_________________________________" +
                    "\n実行したい内容を正しく入力してください。" +
                    "\n【menu】" +
                    "\n・「表示」" +
                    "\n・「作成」" +
                    "\n・「終了」");

            Scanner sc1 = new Scanner(System.in);
            String line = sc1.nextLine();


            if (line.equals(Show)) {
                for(int i=0;i>countListOfMDL;i++){
                    LessonData data = new LessonData();

                    System.out.println(data);
                }

            } else if (line.equals(LetItAdd)) {
                AddList addList;
                addList = new AddList();
                masterDateList.add(addList.getList());


            } else if (line.equals(Finish)) {
                WontContinue = false;
                System.out.println("システムを終了中です。。。");

            } else {
                System.out.println("入力内容に誤りがあります。");
            }


        }
    }

}