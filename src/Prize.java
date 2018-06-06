import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

/**
 * Created by superzhaolu on 2018/6/5.
 */
public class Prize {
    public static void main(String[] args) {
        System.out.println("我行我素购物管理系统》幸运抽奖");
        System.out.println("请输入四位会员号");
        Scanner sc=new Scanner(System.in);
        int guest=sc.nextInt();
        while (guest<1000||guest>9999){
            System.out.println("请重新输入");
            guest=sc.nextInt();
        }
        int ram=(int)(Math.random()*10);
        System.out.println(ram);
        if((guest%1000/100)==ram){
            System.out.println(guest+"号客户是幸运客户，获得精美Mp3一个");
        }else{
            System.out.println(guest+"号客户，谢谢您的支持");
        }
    }
}
