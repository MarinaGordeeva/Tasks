public class CalculatorWithMathExtends extends CalculatorWithOperator {
    //метод сложение.
    public double plus(double a, double b){
        return a + b;
    }

    //метод вычитание.
    public double minus (double a, double b)
    {
        return a - b;
    }

    // метод деление.
    public double div (double a, double b){
        return a / b;
    }

    // метод умножение.
    public double multiply (double a, double b){
        return a * b;
    }


//в следующи методах использую библиотеку Math.
    public double power (double a, double b){
        return Math.pow(a, b);
    }

    public double sqrt (double c){
        return Math.sqrt(c);
    }

    public double module(double c){
        return  Math.abs(c);
    }
}
