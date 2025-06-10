package org.example;

public class Calc {
    public int summ(int a, int b) {
        int result;
        result = a + b;
        System.out.println("Сумма " + a + " и " + b + " равна " + result);
        return result;
    }

    public int minus(int a, int b) {
        int resultminus;
        resultminus = a - b;
        System.out.println("Разница " + a + " и " + b + " равна " + resultminus);
        return resultminus;
    }
}
