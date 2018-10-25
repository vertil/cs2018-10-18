package by.it.Vertinsky.lesson02;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

/*
Ускорение свободного падения на Земле и Марсе таково:
Марс   3.86
Земля   9.81

С клавиатуры вводится вес человека в килограммах.
Рассчитайте вес человека на Марсе и выведите
округлив его до сотых килограмма (2 знака)

Создайте для этих целей метод getWeight(int weight)

Требования:
1. Метод getWeight(int weight) должен быть статическим.
2. Метод getWeight должен возвращать значение типа double.
3. Метод getWeight должен обязательно (!) округлять до сотых возвращаемое значение типа double.
4. Метод getWeight не должен ничего выводить на экран.
5. Метод getWeight должен правильно переводить вес тела в килограммах на Земле
    в вес этого же тела на Марсе, и возвращать это значение.

Пример:

Ввод:
75

Вывод:
29.51


*/
class TaskC3 {
    public static void main(String[] args) {
        System.out.println("Введите вес человека (кг)");
        Scanner sc = new Scanner(System.in);
        int x= sc.nextInt();
        // (ЗАПАСНАЯ ВЫВОДИТ 29,51 ТОЕСТЬ С ЗАПЯТОЙ)
       // System.out.printf("%.2f",getWeight(x));
        System.out.println(getWeight(x));
       // System.out.print(getWeight(x));

    }
    public static double getWeight(int weight) {
        double mars=0.0;
        mars = (weight *3.86)/9.81;

        //ОКРУГЛЕНИЕ
        int mars100=(int) (mars*100);
        double delta=mars*100-mars100;
        if (delta<0.5)
            return mars100/100.0;
        else
            return ++mars100/100.0;

        //return mars;
    }

}