import org.apache.catalina.filters.RemoteIpFilter;
import org.apache.commons.collections.functors.NullIsTruePredicate;

import java.util.ArrayList;
import java.util.List;

public class Test0328 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a / b);
        System.out.println();

        String c = "123";
        String d = "456";
        System.out.println(c + d);
        System.out.print(c);
        System.out.print(d);

        //qianghzizhuanghuan
        System.out.println(Integer.parseInt(c) * Integer.parseInt(d));

        //1.定義List
        List<String> list = new ArrayList<>();
        //2.追加a,b,c,d
        list.add(String.valueOf(a));
        list.add(String.valueOf(b));
        list.add(c);
        list.add(d);
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");


        //通过下标进行遍历list
        for (int i = list.size() - 1; i >= 0; i--) {
            switch (list.get(i)) {
                case "1":
                    System.out.println("2");
                    break;
                case "2":
                    System.out.println("4");
                    break;
                case "3":
                case "4":
                    System.out.println("5");
                    break;

                default:
                    System.out.println("0");
            }
        }

    }
}