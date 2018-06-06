package test5;

import java.util.Scanner;

/**
 * Created by superzhaolu on 2018/6/5.
 */
public class menu {
    public static void main(String[] args) {
        System.out.println("请选择你要进行的操作");
        Scanner sc=new Scanner(System.in);
        int choose=sc.nextInt();
        SecondMenu s=new SecondMenu();
        switch (choose){
            case 1:s.menu();break;
            case 2:
                System.out.println("您已经退出");
                break;
            default:
                System.out.println("请输入正确的操作");break;
        }
    }
}
