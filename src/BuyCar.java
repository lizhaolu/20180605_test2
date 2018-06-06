import java.util.Scanner;

/**
 * Created by superzhaolu on 2018/6/5.
 */
public class BuyCar {
    public static void main(String[] args) {
        System.out.println("请输入您的银行存款，单位为万元");
        Scanner sc=new Scanner(System.in);
        int money=sc.nextInt();
        if(money>=500){
            System.out.println("您可以购买凯迪拉克");
        }else if(money>=100){
            System.out.println("您可以购买帕萨特");
        }else if(money>=50){
            System.out.println("您可以购买依兰特");
        }else if(money>=10){
            System.out.println("您可以购买奥拓");
        }else if(money<10){
            System.out.println("您可以购买捷安特");
        }
    }

}
