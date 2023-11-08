package lecture02;
import java.util.Scanner;

public class plac3 {
    public static void main(String[]args){

        int a = 0;
        String[][] idpass = new String[5][2];
        Scanner scan = new Scanner(System.in);
        Settei id = new Settei();
        Sikibetu cheak = new Sikibetu();


        idpass = id.id();
        System.out.print("Enter your id:");
        String name = scan.nextLine();
        int[] value = cheak.id(name,idpass,a);

        if(value[0] == 0){
            System.out.print("Error!");
        }

        if(value[0] == 1){
            System.out.print("id correct ! Enter your password:");
            String password = scan.nextLine();
            a = cheak.pass(password,idpass,value[0],value[1]);

            if(a == 0){
                System.out.print("不正なアクセス");
            }

            if(a == 1){
                System.out.print("ログイン完了");
            }
        }

    }


}
