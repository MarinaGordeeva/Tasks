//Cортировка выбором
import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {

        //создали массив чисел;
        int [] arr = {1,2,5,3,7,1,8,9};
        for(int i = 0; i < arr.length; i++) {
            //создаем переменнык min min_i  для реализации метода;
            int min = arr[i];
            int min_i = i;

            //Через цикл for проверяем есть ли в оставшейся части массива элемент, который меньше "минимального";
            for (int j = i+1; j <arr.length ; j++) {

             //если есть, то запоминаем индекс.
                if (arr[j] < min) {
                    min = arr[j];
                    min_i = j;
                }
            }
            //меняем местами, перезаписав значения.
                 if (i != min_i)
                 {
                     int tmp = arr[i];
                     arr[i] = arr[min_i];
                     arr[min_i] = tmp;
                 }
        }
        System.out.println(Arrays.toString(arr));
        }
            }



