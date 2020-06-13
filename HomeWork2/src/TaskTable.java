//1.1. Вывести таблицу умножения в консоль

public class TaskTable {

    public static void main(String[] args) {
        for(int a=1; a<=10; a++){
            for(int b=1; b<=10; b++){
                int c=a*b;
               System.out.printf("%5d",c); /*5 - колличество пустых симфолов перед цифрой, для визуального выравнивания*/
            }
            System.out.println(); /*каждый новый десяток начинается с новой строки*/
        }
    }
}
