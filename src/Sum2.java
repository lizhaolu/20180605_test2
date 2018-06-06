/**
 * Created by superzhaolu on 2018/6/6.
 */
public class Sum2 {
    public static void main(String[] args) {
        int i=1;
        int sum=0;
        while (sum<2000){
            if(i%3!=0){
                sum=sum+i;
                System.out.println(i);
            }
            i++;
        }


    }
}
