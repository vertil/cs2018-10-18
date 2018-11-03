package by.it.Vertinsky.lesson04;

import java.util.Scanner;

/*

На входе вводится число и месяц 2018 года.
Программа должна выводить номер дня года, считая 1 января первым днем,
а 31 декабря 365-м.

Пример:
Ввод:
1 1

Вывод
1

Ввод:
31 12

Вывод
365

Ввод:
13 9

Вывод
256

 */
public class TaskC2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число и месяц");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int m;
        int sum;
        switch (b) {
            case 1:
                m=0;
                sum=a+m;
                System.out.println(sum);
                break;
            case 2:
                m=31;
                sum=a+m;
                System.out.println(sum);
                break;
            case 3:
                m=59;
                sum=a+m;
                System.out.println(sum);
                break;
            case 4:
                m=90;
                sum=a+m;
                System.out.println(sum);
                break;
            case 5:
                m=120;
                sum=a+m;
                System.out.println(sum);
                break;
            case 6:
                m=151;
                sum=a+m;
                System.out.println(sum);
                break;
            case 7:
                m=181;
                sum=a+m;
                System.out.println(sum);
                break;
            case 8:
                m=212;
                sum=a+m;
                System.out.println(sum);
                break;
            case 9:
                m=243;
                sum=a+m;
                System.out.println(sum);
                break;
            case 10:
                m=273;
                sum=a+m;
                System.out.println(sum);
                break;
            case 11:
                m=304;
                sum=a+m;
                System.out.println(sum);
                break;
            case 12:
                m=334;
                sum=a+m;
                System.out.println(sum);
                break;
            }
            }

}
