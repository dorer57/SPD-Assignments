public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(new Add());
        System.out.println(calculator.calculate(10, 5));

        calculator.setStrategy(new Substract());
        System.out.println(calculator.calculate(10, 5));

        calculator.setStrategy(new Multiply());
        System.out.println(calculator.calculate(10, 5));

        calculator.setStrategy(new Divide());
        System.out.println(calculator.calculate(10, 5));
    }
}