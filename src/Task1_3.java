public class Task1_3 {
    public static void main(String[] args) {
        int[] number = {1, 3, 5, 6, 7, 8, 9};
        for (int i = 0; i < number.length; i++){
            System.out.println(number[i]+"");
        }
        int sumOfNumbers =0;
        for(int i = 0; i<number.length; i++){
            sumOfNumbers += number[i];
        }
        System.out.println("Сумма чисел:" + sumOfNumbers);

    }

    }