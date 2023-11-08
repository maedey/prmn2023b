package lecture02;
import java.util.Scanner;
public class plac4 {
    public static void main(String[]args){
       Scanner scan = new Scanner(System.in);
       String name = scan.nextLine();
       int num = scan.nextInt();


        System.out.printf("氏名:%s,学籍番号:%d",name,num);
    }
}
