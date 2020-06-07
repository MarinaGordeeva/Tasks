import java.util.Scanner;

public class Task2_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Write 10 nombers)))");
        int mas[] = new int[10];
        for(int i =0; i < mas.length; i++){
            mas[i] = input.nextInt();
        }
        System.out.println("Nice)");
        for(int i=0;i < mas.length; i++){
            System.out.print(mas[i]);
        }


    }
}


