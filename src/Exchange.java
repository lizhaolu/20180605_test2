import java.util.Scanner;

/**
 * Created by superzhaolu on 2018/6/5.
 */
public class Exchange {
    public static void main(String[] args) {
        System.out.println("请输入消费金额");
        Scanner sc=new Scanner(System.in);
        float money=sc.nextFloat();
        System.out.println("是否参加优惠换购活动");
        System.out.println("1:满50元，加2元换购百事可乐饮料1瓶");
        System.out.println("2:满100元，加3元换购500ml可乐一瓶");
        System.out.println("3:满100元，加10元换购5公斤面粉");
        System.out.println("4:满200元，加10元可换的1个办白尔炒菜锅");
        System.out.println("5:满200元，加20元可换购欧莱雅爽肤水一瓶");
        System.out.println("0:不换购");
        System.out.println("请选择：");
        int choose=sc.nextInt();
        switch (choose){
            case 1:
            if(money>=50){
                System.out.println("本次消费总额"+(money+2));
                System.out.println("成功换购百事可乐");
            }else{
                System.out.println("不满足条件");
            }
            break;
            case 2:
                if(money>=100){
                    System.out.println("本次消费总额"+(money+3));
                    System.out.println("成功换购可乐");
                }else{
                    System.out.println("不满足条件");
                }
                break;
            case 3:
                if(money>=100){
                    System.out.println("本次消费总额"+(money+10));
                    System.out.println("成功换购面粉");
                }else{
                    System.out.println("不满足条件");
                }
                break;
            case 4:
                if(money>=200){
                    System.out.println("本次消费总额"+(money+10));
                    System.out.println("成功换购苏泊尔炒菜锅");
                }else{
                    System.out.println("不满足条件");
                }
                break;
            case 5:
                if(money>=200){
                    System.out.println("本次消费总额"+(money+20));
                    System.out.println("成功换购欧莱雅爽肤水");
                }else{
                    System.out.println("不满足条件");
                }
                break;
            case 0: System.out.println("本次消费总额"+money);
                break;
            default:
                System.out.println("请选择正确的选项");
        }

    }
}
