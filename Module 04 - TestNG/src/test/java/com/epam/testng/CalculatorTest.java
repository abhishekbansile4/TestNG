package com.epam.testng;
import com.epam.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest  extends ConfigurationTests {
    Calculator calculator = new Calculator();
    @Test(dataProviderClass = DataProviderForCalculator.class, dataProvider = "dataProviderForLong", groups = "PrimaryOperations")
    public void verifySum(long number1, long number2){
        long expectedResult = number1+number2;
        long actualResult = calculator.sum(number1, number2);
        Assert.assertEquals(actualResult, expectedResult);
    }
    @Test(dataProviderClass = DataProviderForCalculator.class, dataProvider = "dataProviderForDouble", groups = "PrimaryOperations")
    public void verifySum(double number1, double number2){
        double expectedResult = number1+number2;
        double actualResult = calculator.sum(number1, number2);
        Assert.assertEquals(actualResult, expectedResult);
    }
    @Test(dataProviderClass = DataProviderForCalculator.class, dataProvider = "dataProviderForLong", groups = "PrimaryOperations")
    public void verifySub(long number1, long number2){
        long expectedResult = number1-number2;
        long actualResult = calculator.sub(number1, number2);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test(dataProviderClass = DataProviderForCalculator.class, dataProvider = "dataProviderForDouble", groups = "PrimaryOperations")
    public void verifySub(double number1, double number2){
        double expectedResult = number1-number2;
        double actualResult = calculator.sub(number1, number2);
        Assert.assertEquals(actualResult, expectedResult);
    }
    @Test(dataProviderClass = DataProviderForCalculator.class, dataProvider = "dataProviderForLong", groups = "PrimaryOperations")
    public void verifyMult(long number1, long number2){
        long expectedResult = number1*number2;
        long actualResult = calculator.mult(number1, number2);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test(dataProviderClass = DataProviderForCalculator.class, dataProvider = "dataProviderForDouble", groups = "PrimaryOperations")
    public void verifyMult(double number1, double number2){
        double expectedResult = Math.floor(number1*number2);
        double actualResult = calculator.mult(number1, number2);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test(dataProviderClass = DataProviderForCalculator.class, dataProvider = "dataProviderForDivOfLong", groups = "PrimaryOperations")
    public void verifyDiv(long number1, long number2){
        long expectedResult = number1/number2;
        long actualResult = calculator.div(number1, number2);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test(dataProviderClass = DataProviderForCalculator.class, dataProvider = "dataProviderForDivOfDouble", groups = "PrimaryOperations")
    public void verifyDiv(double number1, double number2){
        double actualResult = calculator.div(number1, number2);
        double expectedResult = number1/number2;
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test(dataProviderClass = DataProviderForCalculator.class, dataProvider = "dataProviderForDivOfLongWithException", expectedExceptions = NumberFormatException.class, groups = "PrimaryOperations")
    public void verifyDivForException(long number1, long number2){
        long actualResult = calculator.div(number1,number2);
        long expectedResult = number1/number2;
        Assert.assertEquals(actualResult, expectedResult);
    }
    @Test(dataProviderClass = DataProviderForCalculator.class, dataProvider = "dataProviderForDivOfLongWithException", groups = "PrimaryOperations")
    public void verifyDivForException(double number1, double number2){
        double expectedResult = number1/number2;
        double actualResult = calculator.div(number1,number2);
        Assert.assertEquals(actualResult, expectedResult);
    }
    @Test(dataProviderClass = DataProviderForCalculator.class, dataProvider = "dataProviderForDouble", groups = "PrimaryOperations")
    public void verifyPow(double number1, double number2){
        double expectedResult = Math.pow(number1, Math.floor(number2));
        double actualResult = calculator.pow(number1, number2);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test(dataProviderClass = DataProviderForCalculator.class, dataProvider = "dataProviderForSquareRoot", groups = "PrimaryOperations")
    public void verifySqrt(double number){
        double expectedResult = Math.sqrt(Math.abs(number));
        double actualResult = calculator.sqrt(number);
        Assert.assertEquals(actualResult, expectedResult);
    }
    @Test(dataProviderClass = DataProviderForCalculator.class, dataProvider = "dataProviderForTrigonometryOperations", groups = "TrigonometricFunctions")
    public void verifyTg(double number){
        double expectedResult = Math.sin(number)/Math.cos(number);
        double actualResult = calculator.tg(number);
        Assert.assertEquals(actualResult, expectedResult);
    }
    @Test(dataProviderClass = DataProviderForCalculator.class, dataProvider = "dataProviderForTrigonometryOperations", groups = "TrigonometricFunctions")
    public void verifyCtg(double number){
        double expectedResult = Math.tanh(number);
        double actualResult = calculator.ctg(number);
        Assert.assertEquals(actualResult, expectedResult);
    }
    @Test(dataProviderClass = DataProviderForCalculator.class, dataProvider = "dataProviderForTrigonometryOperations", groups = "TrigonometricFunctions")
    public void verifyCos(double number){
        double expectedResult = Math.cos(number);
        double actualResult = calculator.cos(number);
        Assert.assertEquals(actualResult, expectedResult);
    }
    @Test(dataProviderClass = DataProviderForCalculator.class, dataProvider = "dataProviderForTrigonometryOperations", groups = "TrigonometricFunctions")
    public void verifySin(double number){
        double expectedResult = Math.sin(number);
        double actualResult = calculator.sin(number);
        Assert.assertEquals(actualResult, expectedResult);
    }
    @Test(dataProviderClass = DataProviderForCalculator.class, dataProvider = "dataProviderToCheckLongType")
    public void verifyIsPositive(long value){
        boolean expectedResult = value>0;
        boolean actualResult = calculator.isPositive(value);
        Assert.assertEquals(actualResult, expectedResult);
    }
    @Test(dataProviderClass = DataProviderForCalculator.class, dataProvider = "dataProviderToCheckLongType")
    public void verifyIsNegative(long value){
        boolean expectedResult = value<0;
        boolean actualResult = calculator.isNegative(value);
        Assert.assertEquals(actualResult, expectedResult);
    }
}
