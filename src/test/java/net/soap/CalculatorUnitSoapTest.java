package net.soap;

import org.junit.Test;
import org.tempuri.Calculator;
import org.tempuri.CalculatorSoap;

public class CalculatorUnitSoapTest {

    @Test
    public void testAddCalculatorUnit() {
        CalculatorSoap service = new Calculator().getCalculatorSoap();
        int result = service.add(10, 20);
        System.out.println(result);
        assert(result==30);
    }
}
