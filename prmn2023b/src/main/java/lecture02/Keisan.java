package lecture02;

public class Keisan {

    int sum(int[] a){
        int x = 0;
        for(int i=0;i<5;i++){
             x += a[i];
        }
        return x;
    }//合計を求めるメソッド

    void judge(int x){

        System.out.printf("合計値　:　%d",x);
        if(x>=100){
            System.out.print("great!");
        }else if(x>=50){
            System.out.print("big");
        }else{
            System.out.print("small");
        }
    }
}
