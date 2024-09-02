import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {
    public static final Factorial FACTORIAL = new Factorial();
    public static final String EMPTY_MESSAGE = "It shouldn't be empty";
    public static final String INVALID_NUMBER_MESSAGE = "Invalid number value";

    /**
     * Проверка, когда в строке число
     */

    @Test
    void checkNumber() {
        assertEquals(120, FACTORIAL.doFactorial("5"));
    }

    /**
     * Проверка, если в строке не число
     */

    @Test
    void checkNotNumber() {
        assertThrows(NumberFormatException.class, () -> FACTORIAL.doFactorial("Hello"));
        assertThrows(NumberFormatException.class, () -> FACTORIAL.doFactorial("%.89"));
        assertThrows(NumberFormatException.class, () -> FACTORIAL.doFactorial("1-0"));
    }

    /**
     * Проверка, если в строке 0
     */

    @Test
    void checkZero() {
        assertEquals( 1, FACTORIAL.doFactorial("0"));
    }

    /**
     * Проверка, если в строке пусто
     */

    @Test
    void checkEmpty() {
        assertThrows(NumberFormatException.class, () -> FACTORIAL.doFactorial(""), EMPTY_MESSAGE);
    }

    /**
     * Проверка, если в строке отрицательные числа
     */

    @Test
    void checkNegativeNumber() {
        assertThrows(NumberFormatException.class, () -> FACTORIAL.doFactorial("-5"), INVALID_NUMBER_MESSAGE);
    }

    /**
     * Проверка, если в строке дробные числа
     */

    @Test
    void checkNotIntNumber() {
        assertThrows(NumberFormatException.class, () -> FACTORIAL.doFactorial("0.67909"));
    }

    /**
     * Находим пограничное значение, когда алгоритм начинает вычислять неправильно
     */
    @Test
    void checkBigNumber() {
        assertEquals(479001600, FACTORIAL.doFactorial("12"));
        assertNotEquals(6227020800L, FACTORIAL.doFactorial("13"));
    }

}