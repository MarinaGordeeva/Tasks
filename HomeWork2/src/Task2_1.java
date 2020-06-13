//Вывести все элементы в консоль при помощи do....while, while, for, foreach.
// Элементы массива вводить через консоль. Массив хранит в себе числа.
// 2.2 Вывести каждый второй элемент массива

import java.util.Scanner;

public class Task2_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //Класс Scanner с переменной input;
        System.out.print("Write 10 nombers)))"); //Выводим строку в консоль;
        int mas[] = new int[10];                  //Создаем массив, длинна массива = 10;
        for(int i =0; i < mas.length; i++){
            mas[i] = input.nextInt();
        }
        System.out.println("Nice)");
        for(int i=0;i < mas.length; i++){
            System.out.print(mas[i]);
        }


    }
}




