import java.util.Scanner;

/**
 * Created by superzhaolu on 2018/6/5.
 */
public class Vip {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入是否为会员：是(y)/否（其他字符）");
        String id=sc.next();
        System.out.println("请输入购物金额");
        float money=sc.nextFloat();
        if (id.equals("y")){
            if(money>=200){
                System.out.println("实际支付"+0.75*money);
            }else {
                System.out.println("实际支付"+0.8*money);
            }
        }else {
            if(money>=100){
                System.out.println("实际支付"+0.9*money);
            }else {
                System.out.println("实际支付"+money);
            }
        }
    }
}
