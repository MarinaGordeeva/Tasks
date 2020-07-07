import java.util.Scanner;

public class hanoi_2 {
    //метод принимает параметры n - колличество колец. а,b,c-стержни
    static void hanoi(int n, int a, int b, int c){
        if(n==0) return;
        hanoi(n-1, a, c, b);
        System.out.println(a + " -> " + b); //выводим в консоль шаги игры;

        hanoi(n-1, c, b, a);

    }

    public static void main(String[] args) {
        //через консоль вводим число колец.
        System.out.println("Возможное число колец в этой игре от 3 до 8. Введите число.");
        Scanner con = new Scanner(System.in);

        //вводим из кансоли число, которое соответствует числу колец в игре.
        int n = con.nextInt();

        //Если число число меньше 3 и больше 8, то "Число не соответствует условию("
        if(n<3||n>8){
            System.out.println("Число не соответствует условию(");

        }else
        hanoi(n, 1, 2, 3);

    }

}
