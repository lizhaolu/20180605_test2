import java.util.Scanner;

/**
 * Created by superzhaolu on 2018/6/5.
 */
public class Calculator {
    public static void main(String[] args) {
        System.out.println("请输入两个数");
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        System.out.println("请输入要进行的操作 + - * /");
        String c=sc.next();
        switch (c){
            case "+":
                System.out.println(a+b);
                break;
            case "-":
                System.out.println(a-b);
                break;
            case "*":
                System.out.println(a*b);
                break;
            case "/":
                System.out.println(a/b);
                break;
            default:
                System.out.println("请输入正确的字符");
        }
    }
}
