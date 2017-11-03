package Home;

public class Main2 {

    public static void main(String[] args) {


        Division division = new Division();
        int a = 5;
        int b = 2;
        int resultDivision = division.calculate(a, b);
        System.out.println("результат деления переменных " + a + " и " + b + " = " + resultDivision);

        Subtraction subtraction = new Subtraction();
        int c = 7;
        int d = 2;
        int resultSubtraction = Subtraction.calculate(c, d);
        System.out.println("результат вычитания переменных " + c + " и " + d + " = " + resultSubtraction);


        Addition addition = new Addition();
        int t = 5;
        int k = 4;
        int resultAddition = addition.calculate(t, k);
        System.out.println("результат сложения переменных " + t + " и " + k + " = " + resultAddition);

        Multiplication multiplication = new Multiplication();
        int y = 1;
        int u = 5;
        int resultMultiplication = multiplication.calculate(y, u);
        System.out.println("результат умножения переменных " + y + " и " + u + " = " + resultMultiplication);
    }

}




