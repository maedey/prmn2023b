package lecture02;

public class Sikibetu {

    int[] id (String info, String[][] data, int a){
        int [] result = new int[2];

        for(int r=0;r<5;r++){
            if(info.equals( data[r][a])){

                result[0] = 1;
                result[1] = r;

                return result;
            }
        }

        return result;
    }

    int pass (String info,String[][] data,int a,int r){

        if(info.equals(data[r][a])){
          return 1;
        }else{
            return 0;
        }

    }
}
