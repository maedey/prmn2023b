package lecture02;
import java.util.Scanner; //Scannerライブラリをインポート

public class prac1 {
    public static void main(String[]args){

        String number = "B2222080";

        Scanner scan = new Scanner(System.in); //標準入力インスタンス

        System.out.print("学籍番号を入力してください。：");
        String gakuseki = scan.next();

        Gakuseki z = new Gakuseki();
        z.hyouzi(number,gakuseki);


    }
}
