package by.it.Vertinsky.lesson02;

import java.util.Scanner;

/* Нужно написать программу, которая вводит два числа с клавиатуры
и 4 раза выводит их сумму с обозначением системы счисления на экран в
ДЕСЯТИЧНОМ ДВОИЧНОМ ШЕСТНАДЦАТИРИЧНОМ ВОСЬМИРИЧНОМ виде

Вот пример ввода с клавиатуры:
34 26

Тогда вывод ожидается такой (обратите внимание на регистр букв):
DEC:34+26=60
BIN:100010+11010=111100
HEX:22+1a=3c
OCT:42+32=74
*/
class TaskC2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число");
        int a = sc.nextInt();
        System.out.println("Введите второе число");
        int b = sc.nextInt();
        int sum=a+b;
        System.out.printf("DEC:%d+%d=%d",a,b, sum);
        System.out.println();
       //ща в двоичку
        String str=Integer.toBinaryString(sum);
        String stra=Integer.toBinaryString(a);
        String strb=Integer.toBinaryString(b);
        System.out.printf( "BIN:%s+%s=%s", stra, strb, str);
        System.out.println();
        //ща в 16ричку
        str=Integer.toHexString(sum);
        stra=Integer.toHexString(a);
        strb=Integer.toHexString(b);
        System.out.printf("HEX:%s+%s=%s", stra, strb, str);
        System.out.println();
        //ща в 8ую
        str=Integer.toOctalString(sum);
        stra=Integer.toOctalString(a);
        strb=Integer.toOctalString(b);
        System.out.printf("OCT:%s+%s=%s", stra, strb, str);
        System.out.println();







    }

    }
