package LambdaTaskOne;

public class Main {
    public static void main (String[] args) {
        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);

        a = calc.abs.apply(a);
        b = calc.abs.apply(b);

        try {
            if (calc.isPositive.test(a & b)) { // Деление на 0 запрещено ArithmeticException
                int c = calc.devide.apply(a, b);
                calc.println.accept(c);
            }
        } catch (ArithmeticException e) {
            e.getStackTrace();
        }
    }
}



