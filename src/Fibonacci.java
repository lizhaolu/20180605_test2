/**
 * Created by superzhaolu on 2018/6/5.
 */
public class Fibonacci {
    public static void main(String[] args) {
        int a=1;
        int b=1;
        int i=3;
        System.out.print(a+"\t");
        System.out.print(b+"\t");
        while (i<20){
            a=a+b;
            System.out.print(a+"\t");
            if (i%5==0){
                System.out.println();
            }
            i++;
            b=b+a;
            System.out.print(b+"\t");
            if (i%5==0){
                System.out.println();
            }
            i++;
        }
    }

}
