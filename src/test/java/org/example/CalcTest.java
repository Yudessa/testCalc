package org.example;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CalcTest {
@BeforeAll
 public static void readys(){
    System.out.println("BeforeAll");
}
@BeforeEach
public  void red(){
    System.out.println("BeforeEach");
}
    @ParameterizedTest (name = "#{index} - вычитание {0} b {1} ожидаем {2}")
    @CsvSource ({"3, 1, 4", "10, 5, 15", "4, 2, 6"})
    @DisplayName("Проверка суммирования")
    void summ(int a, int b, int expectedResult) {
        Calc calc = new Calc();
        int result = calc.summ(a, b);
        Assertions.assertEquals(expectedResult, result ,"Не выполнен");
    }

    @Test
    @DisplayName("Проверка вычитания")
    @Timeout(10)
    void minus() {
        Calc calc = new Calc();
        int resultminus = calc.minus(20, 3);
        Assertions.assertEquals(17, resultminus, "Не выполнен");
    }
}