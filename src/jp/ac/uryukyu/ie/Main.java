package jp.ac.uryukyu.ie;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {

        boolean WontContinue = true;//下にあるWhiteを制御するための変数

        String Show = "表示";
        String LetItAdd = "作成";
        String Finish = "終了";//ユーザー入力を認証するための変数３種類

        List<List<LessonData>> masterDateList;//時間割全体を保存するためのMasterList
        int countListOfMDL = 0;//入力された授業数のカウンター

        CreateSortName createSortName;
        createSortName = new CreateSortName();

        masterDateList = new ArrayList<>();
        masterDateList.add(createSortName.getList());
        countListOfMDL++;



        while (WontContinue) {
            System.out.println("\n\n_________________________________" +
                    "\n実行したい内容を正しく入力してください。" +
                    "\n【menu】" +
                    "\n・「表示」" +
                    "\n・「作成」" +
                    "\n・「終了」");

            Scanner sc1 = new Scanner(System.in);
            String line = sc1.nextLine();//ユーザー入力


            if (line.equals(Show)) {

                //for(int i=0;i>countListOfMDL;i++){
               //     System.out.println();
               // }
                //MasterListを出力したかったが、やり方がわからない、、
                //objectDataを入れたListはtoString()を利用して出力できたのでその理解ができれば、、、

            } else if (line.equals(LetItAdd)) {
                AddList addList;
                addList = new AddList();
                masterDateList.add(addList.getList());//ユーザー入力したObjectDataをListに格納し、それをMasterListに格納
                countListOfMDL++;

            } else if (line.equals(Finish)) {
                WontContinue = false;
                System.out.println("システムを終了中です。。。");

            } else {
                System.out.println("入力内容に誤りがあります。");
            }


        }
    }

}