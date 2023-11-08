package lecture02;
import java.util.Scanner;
public class prac2 {
    public static void main(String[]args){

        int[] num  = new int[5];

        Scanner scan = new Scanner(System.in);//数字入力インスタンス
        for(int i=0;i<5;i++){
            System.out.printf("数字%dつ目",i);
            num[i] += scan.nextInt();
            System.out.print("");//改行
        }

        Keisan cal = new Keisan();
        int a = cal.sum(num);
        cal.judge(a);


    }
}
