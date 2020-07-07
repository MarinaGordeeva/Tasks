
public class Color {


    private String color;
    private int nomOfColor;
    private static final int RED = 1;
    private static final int ORANGE = 2;
    private static final int YELLOW = 3;
    private static final int GREEN = 4;
    private static final int BLUE = 5;
    private static final int DARKBLUE = 6;
    private static final int VIOLET =7;

//Конструктор

    public Color(int nomOfColor) {
        this.nomOfColor = nomOfColor;

    }



    //метод  - возвращает номер цвета
    public int getNumber() {
        return nomOfColor;
    }

// метод, который возврщает название цвета
    public String getName() {
            switch (nomOfColor){
                case RED:
                    return "красный";
                case ORANGE :
                    return "оренжевый";
                case YELLOW:
                    return "желтый";
                case GREEN:
                    return "зелёный";
                case BLUE:
                    return "голубой";
                case DARKBLUE:
                    return "синий";
                case VIOLET:
                    return "фиолетовый";
                default: return "неизвестное число";
            }

    }

}