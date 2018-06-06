import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by superzhaolu on 2018/6/5.
 */
public class Position {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=0;
        System.out.print("任意数字：");
        int b=scanner.nextInt();
        ArrayList l=new ArrayList();
        getPosition(b,l);
        System.out.println(l.size());
    }
    public static ArrayList<Integer> getPosition(int num, ArrayList<Integer> list) {
        if ((num / 10 == 0) && (num % 10 == 0)) {
            return list;
        }
        list.add(num % 10);
        getPosition(num / 10, list);
        return list;

    }
}
