/**
 * Created by superzhaolu on 2018/6/5.
 */
public class Sum {
    public static void main(String[] args) {
        int sum=0;
        for(int a=1;a<=1000;a++){
            if(a%7!=0){
                sum=sum+a;
            }
        }
        System.out.println(sum);
    }

}
