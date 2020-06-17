//Шейкерная сортировка

import java.util.Arrays;

public class Task2_a {
        //создали массив чисел;
        public static void main(String[] args) {
            int[] a = {11, 44, 555, 22, 2, 8,9};

            boolean isSorted = false;
            int b;
            while (!isSorted){
                isSorted = true;
                //Через цикл for проверяем больше ли элемент следующего элемента;
                for (int i = 0; i < a.length-1; i++){
                    //если больше, то массив не отсортирован;
                    if(a[i] > a [i+1]){
                        isSorted = false;
                        //через переменную b переписываем массив в верной последовательности;
                        b = a[i];
                        a[i] = a[i+1];
                        a[i+1] = b;
                    }
                }
            }
            System.out.println(Arrays.toString(a));
        }

    }
