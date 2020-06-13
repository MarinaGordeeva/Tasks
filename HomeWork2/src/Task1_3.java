//Все цифры из числа введенного через аргумент к исполняемой
// программе перемножить между собой и
// вывести ход вычислений в консоль

import java.util.Scanner;

public class Task1_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //Класс Scanner принимает целое число;
        System.out.println("Введите число от 1 до 999");
        int num = input.nextInt();

       if(num < 1 || num >999){                 //Если число меньше 1 и больше 999, то выводить строку "Ошибка!"
           System.out.println("Oшибка!");
       }else {                                  //Если условие верно, то выполнить последовательное умножение цифр числа;
           System.out.println((num/100)*((num%100)/10)*(num%10)); //цифра сотни *  цифра десятка * еденицы
       }

       }

    }





