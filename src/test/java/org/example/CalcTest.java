package org.example;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CalcTest {
    @BeforeAll
    public static void MessageBeforeAll() {
        System.out.println("Перед всеми");
    }

    @BeforeEach
    public void MessageBeforeEach() {
        System.out.println("Перед каждым");
    }

    @ParameterizedTest(name = "#{index} - вычитание {0} b {1} ожидаем {2}")
    @CsvSource({"3, 1, 4", "10, 5, 15", "4, 2, 6"})
    @DisplayName("Проверка суммирования")
    void summ(int a, int b, int expectedResult) {
        Calc calc = new Calc();
        int resultSumm = calc.summ(a, b);
        Assertions.assertEquals(expectedResult, resultSumm, "Не прошло проверку по условию");
    }

    @Test
    @DisplayName("Проверка вычитания")
    @Timeout(10)
    void minus() {
        Calc calc = new Calc();
        int resultOfDifference = calc.minus(20, 3);
        Assertions.assertEquals(17, resultOfDifference, "Не прошел проверку на ожидаемый результат");
    }
}