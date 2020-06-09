public class Task2_2 {
    public static void main(String[] args) {
        int[]a = {3,4,5,6,7,8,2,3,4,5}; //Создали массив
        for (int i = 0; i<a.length; i++){
            if(i%2 != 0){
                System.out.print(a[i]+ ", ");

            }
        }
    }
}
