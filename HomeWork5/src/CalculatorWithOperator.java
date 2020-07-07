
public class CalculatorWithOperator<b> {


//метод сложение.
    public double plus(double a, double b){
        return a + b;
    }

//метод вычитание.
    public double minus(double a, double b)
    {
        return a - b;
    }

// метод деление.
    public double div(double a, double b){
        return a / b;
    }

// метод умножение.
    public double multiply(double a, double b){
        return a * b;
    }

// метод возведение в степень.
    public double power (double a, double b){
        double result = a;
        for (int i = 1; i < b; i++){
            result *= a;
        }
        return result;
    }
//метод модуль числа - возвращает положительное число.
    public double module (double a){
        if (a < 0) {
           double result = a * -1;
        }
        return a;
    }

    public double sqrt(double a){
        double result = Math.sqrt(a);
        return result;
    }
}

