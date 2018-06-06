/**
 * Created by superzhaolu on 2018/6/5.
 */
public class Bank {
    public static void main(String[] args) {
        double money=10000;
        for (int year=0;year<5;year++){
            money=money*0.003+money;
        }
        System.out.println("五年后获得本金是"+money);
    }
}
