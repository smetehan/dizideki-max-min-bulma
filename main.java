
import java.util.Arrays;

public class project {


    public static void main(String[] args) {

      int[] num={15,12,788,1,-1,-778,2,0};
      int sayi=5;
     Arrays.sort(num);
     int min=0;
     int max=0;

        for(int i:num){
            if (i<sayi){
                max=i;

            }
if(i>sayi){
    min=i;
    break;
}
        }


        System.out.println(max);
        System.out.println(min);
    }


}



