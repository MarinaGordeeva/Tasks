//Шейкерная сортировка

import java.util.Arrays;

public class Task2_b {

    public static void main(String[] args) {
        int[] mas = {11,44,555,22,2,8,16,9};
        int left = 1; // левая граница
        int right = mas.length - 1; // правая граница


     do {
         for (int i = right; i >= left; i--) { //прохождение цикла слева на право.
             if (mas[i - 1] > mas[i]) {
                 int temp = mas[i]; //В переменную temp записывает текущее значение;
                 mas[i] = mas[i - 1]; //переписываем значение (меняем мстами);
                 mas[i - 1] = temp;
             }
         }
         //прохождение цикла в обратном направлении (лево на право).
         left++; //Начинаем прохождение от второго индекса;
         for (int i = left; i <= right; i++) {
             if (mas[i - 1] > mas[i]) {
                 int temp = mas[i];
                 mas[i] = mas[i - 1];
                 mas[i - 1] = temp;
             }
         }
         right--;
     }while (left <= right);
     System.out.println();
        System.out.println(Arrays.toString(mas));
    }
}
