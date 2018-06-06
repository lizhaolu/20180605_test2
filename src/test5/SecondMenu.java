package test5;

import java.util.Scanner;

/**
 * Created by superzhaolu on 2018/6/5.
 */
public class SecondMenu {
    public void menu(){
        System.out.println("请输入您要进行的操作");
        System.out.println("1.客户信息管理");
        System.out.println("2.购物结算");
        System.out.println("3.真情回馈");
        System.out.println("4.注销");
        Scanner sc=new Scanner(System.in);
        int choose=sc.nextInt();
        switch (choose){
            case 1:
                System.out.println("购物管理系统》客户信息管理");
                System.out.println("1.显示所有客户信息");
                System.out.println("2.添加客户信息");
                System.out.println("3.修改客户信息");
                System.out.println("4.查询客户信息");
                break;
            case 2:
                System.out.println("购物管理系统》真情回馈");
                System.out.println("1.幸运大放送");
                System.out.println("2.幸运抽奖");
                System.out.println("3.生日问候");
                break;
            default:
                System.out.println("请输入正确的操作");
        }
    }
}
