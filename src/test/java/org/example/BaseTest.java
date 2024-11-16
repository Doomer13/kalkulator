package org.example;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class BaseTest {

    @BeforeAll
    public static void beforeAll (){
        System.out.println("BeforeAll - Выполняется Перед всеми тестами, и один раз ");
    }
    @BeforeEach
    public  void  beforeEach(){
        System.out.println("BeforeEach - После каждого теста");
    }

    @AfterAll
    public static void afterAll(){
        System.out.println("AfterAll -После всех тестов");
    }

    @Test
    @DisplayName("Проверка Сложения")
    @Timeout(10)
    void summ1() {

        Base kal =new Base();
        int summ = kal.summ(6,6);
        Assertions.assertEquals(12,summ,"Ошибка");

    }

    @ParameterizedTest(name = "№{index} - сложение {0} и  {1}, ожидание {2}  ")
    @CsvSource({"2,2,4", "2,-1,1", "0,0,0" })
    @DisplayName("Параметризированная Проверка Сложения")

    void paramsumm(int a, int b,int exeptedresult) {

        Base kal =new Base();
        int summ = kal.summ(a,b);
        Assertions.assertEquals(exeptedresult,summ,"Ошибка");

    }

    @ParameterizedTest(name = "№{index} - вычетание {0} и  {1}, ожидание {2}  ")
    @CsvSource ({"5,5,0", "3,-3,6", "13,7,6"})
    @DisplayName("Параматрезировнная проврка вычетания")

    void paramminus(int a, int b,int exeptedresult) {

        Base kal = new Base();
        int decrease = kal.minus(a, b);
        Assertions.assertEquals(exeptedresult,decrease,"Ошибка");
    }
}