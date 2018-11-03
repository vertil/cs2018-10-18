package by.it.Vertinsky.lesson05;

/* Задачка на сортировку
Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.
*/


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TaskC2 {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] list20 = new int[20];
        for (int i = 0; i < 20; i++) {
            list20[i] = Integer.parseInt(reader.readLine());
        }
        int buf;

        for (int i = 0; i < list20.length; i++) {
            for (int j = 0; j < list20.length; j++){
                if (list20[i] > list20[j])
                {   buf = list20[j];
                    list20[j] = list20[i];
                    list20[i] = buf;
                }
            }
        }

        for (int x : list20) {
            System.out.println(x);
        }
    }

  }



























