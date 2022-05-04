package LambdaTaskOne;

public class Main {
    public static void main (String[] args) {
        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);

        int i = calc.abs.apply(a);
        System.out.println(i);
        int j = calc.abs.apply(b);
        System.out.println(j);
        try {
            int c = calc.devide.apply(i, j);
            calc.println.accept(c);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}



