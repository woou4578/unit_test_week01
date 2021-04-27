import org.junit.Test;

import static org.junit.Assert.*;

public class CustomCalculatorTest {

    private CustomCalculator customCalculator;

    // 더하기 테스트를 진행합니다.
    @Test
    public void addTest() {
        customCalculator = new CustomCalculator();
        int result = customCalculator.add(10, 10);
        // 테스트 코드 입력
        assertTrue(result==20);
    }

    @Test
    public void subtractTest() {
        customCalculator = new CustomCalculator();
        int result = customCalculator.subtract(23,10);
        assertTrue(result==13);
    }

    @Test
    public void multiplyTest() {
        customCalculator = new CustomCalculator();
        int result = customCalculator.multiply(2,10);
        assertTrue(result==20);
    }

    @Test
    public void divideTest() {
        customCalculator = new CustomCalculator();
        int result = customCalculator.divide(9,3);
        assertTrue(result==3);
    }
}