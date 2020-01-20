package jp.ac.uryukyu.ie;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        boolean WontContinue = true;
        String Show = "表示";
        String LetItMake = "作成";
        String Finish = "終了";


        while (WontContinue){
            System.out.println("\n\n_________________________________" +
                    "\n実行したい内容を正しく入力してください。" +
                    "\n【menu】"+
                    "\n・「表示」"+
                    "\n・「作成」"+
                    "\n・「終了」");

            Scanner sc1 = new Scanner(System.in);
            String line = sc1.nextLine();

            
            if(line.equals(Show)){

            }else if(line.equals(LetItMake)){

            }else if(line.equals(Finish)){
                WontContinue = false;
                System.out.println("システムを終了中です。。。");

            }else {
                System.out.println("入力内容に誤りがあります。");
            }


        }
    }
}
