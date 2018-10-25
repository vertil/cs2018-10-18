package by.it.Vertinsky.lesson02;
/*
Измените переменные и строку вывода в программе так,
чтобы она рассчитывала и печатала следующее выражение
3*3+4*4=25
 */

class TaskA3 {
    public static void main(String[] args) {
        int i = 2;
        int j = 3;
        int k = j*j+i*i*i*i;
        System.out.printf("%d*%d+%d*%d=%d", j, j, i*2,i*2, k);
    }
}
