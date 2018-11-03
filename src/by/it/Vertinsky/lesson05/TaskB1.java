package by.it.Vertinsky.lesson05;
/*
Создайте 5 различных строк в списке ArrayList:

1. Создайте список строк.
2. Добавьте в него 5 различных строк.
3. Выведите его размер на экран.
4. Используя цикл выведите его содержимое на экран, каждое значение с новой строки.

*/


import java.util.ArrayList;

public class TaskB1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>(5);
        list.add("У лукоморья дуб зелёный;");
        list.add("Златая цепь на дубе том:");
        list.add("И днём и ночью кот учёный");
        list.add("Всё ходит по цепи кругом;");
        list.add("Идёт направо - песнь заводит,");
        int n=list.size();
        System.out.println(n);
        for (String s : list) {
            System.out.println(s);
        }

    }

}
