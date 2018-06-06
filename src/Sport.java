import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

/**
 * Created by superzhaolu on 2018/6/5.
 */
public class Sport {
    public static void main(String[] args) {
        System.out.println("请输入百米赛跑成绩");
        Scanner sc=new Scanner(System.in);
        float grade=sc.nextFloat();
        if(grade<=10){
            System.out.println("恭喜您进入决赛");
            System.out.println("请输入您的性别，男生为1，女生为0");
            int male=sc.nextInt();
            if (male==1){
                System.out.println("您被分配到男子组");
            }else{
                System.out.println("您被分配到女子组");
            }
        }else {
            System.out.println("很遗憾，您未进入决赛");
        }
    }
}
