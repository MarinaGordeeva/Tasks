public class ObjectMain5 {
    public static void main(String[] args) {
        CalculatorWithOperator calc = new CalculatorWithOperator();
       // CalculatorExtends calc2 = new CalculatorExtends();

        //вычиление 4.1 + 15*7 + (28/5)
        double resultOf = calc.plus(calc.plus(4.1,(calc.multiply(15, 7))),(calc.power(calc.div(28, 5),2)));
        System.out.println(resultOf);

        //В Java тип double имеет специальные значения для понятий «плюс бесконечность» и «минус бесконечность».
        // Положительное число, разделенное на 0 или 0.0, дает «плюс бесконечность», по-этому в консоли появляется Infinity(бесконечность)
        double nextResult = calc.div(resultOf, 0);
        System.out.println(nextResult);

        double nextResult1 = calc.div(resultOf, 0.0);
        System.out.println(nextResult1);
  //____________________________________
        CalculatorWithMathCopy calc2 = new CalculatorWithMathCopy();
        double resultCalc2 = calc2.plus(calc2.plus(4.1,(calc2.multiply(15, 7))),(calc2.power(calc2.div(28, 5),2)));
        System.out.println(resultCalc2);

        double nextResultCalc2 = calc2.div(resultCalc2, 0);
        System.out.println(nextResultCalc2);

        double nextResultCalc22 = calc2.div(resultCalc2, 0.0);
        System.out.println(nextResultCalc22);
//_______________________________________
        CalculatorWithMathExtends calc3 = new CalculatorWithMathExtends();
        double resultCalc3 = calc3.plus(calc3.plus(4.1,(calc3.multiply(15, 7))),(calc3.power(calc3.div(28, 5),2)));
        System.out.println(resultCalc3);

        double nextResultCalc3 = calc3.div(resultCalc3, 0);
        System.out.println(nextResultCalc3);

        double nextResultCalc33 = calc3.div(resultCalc3, 0.0);
        System.out.println(nextResultCalc33);
    }

}
