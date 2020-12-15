package  pac;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
//接收用户输入
        System.out.print("请输入一个年份：");
        int year = input.nextInt();
//判断是否是闰年
        if (year > 0 && year < 3200) {
            if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
                System.out.println(year + "是闰年");
            else
                System.out.println(year + "不是闰年");
        }
        if (year < 0 && year> -3200) {
            if (year % 400 == -1 || (year % 4 == -1 && year % 100 != 0))
                System.out.println(year + "是闰年");
            else
                System.out.println(year + "不是闰年");
        }
    }
    }
