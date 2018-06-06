import java.util.Scanner;

/**
 * Created by superzhaolu on 2018/6/6.
 */
public class Sum3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int count=0;
        int sum=0;
        int i=0;
        while(i<10){
            int num=scanner.nextInt();
            if(num==999){
                break;
            }
            if(num>0){
                count++;
                sum+=num;
            }
            i++;
        }
        System.out.println("个数为"+count+"和为"+sum);
    }
}
