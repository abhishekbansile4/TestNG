package com.epam.testng;

import org.testng.annotations.DataProvider;

public class DataProviderForCalculator {
    @DataProvider
    public static Object[][] dataProviderForLong(){
        return new Object[][]{
                {2, 6},
                {5, 0},
                {0, 5},
                {Long.MAX_VALUE, Long.MAX_VALUE},
                {Long.MIN_VALUE, Long.MIN_VALUE},
                {-5, 3},
                {5, -3},
                {0, 0}
        };
    }
    @DataProvider
    public static Object[][] dataProviderForDouble(){
        return new Object[][]{
                {2.5, 4.5},
                {Double.MAX_VALUE, Double.MAX_VALUE},
                {0, 5.95},
                {5.95, 0},
                {0, 0},
                {-5.5, 9},
                {5.5, -9},
                {Double.MIN_VALUE, Double.MIN_VALUE},

        };
    }
    @DataProvider
    public static Object[][] dataProviderForDivOfLong(){
        return new Object[][]{
                {2, 6},
                {0, 5},
                {Long.MAX_VALUE, Long.MAX_VALUE},
                {-1, -4},
                {-5, 3},
                {5, -3},
                {Long.MIN_VALUE, Long.MIN_VALUE}
        };
    }

    @DataProvider
    public static Object[][] dataProviderForDivOfDouble(){
        return new Object[][]{
                {2.5, 4.5},
                {Double.MIN_VALUE, Double.MAX_VALUE},
                {0, 5.95},
                {-5.5, 9},
                {5.5, -9},
                {Double.MAX_VALUE, Double.MIN_VALUE},

        };
    }
    @DataProvider
    public static Object[][] dataProviderForDivOfLongWithException(){
        return new Object[][]{
                {5, 0},
                {0, 0}
        };
    }

    @DataProvider
    public static Object[][] dataProviderForDivOfDoubleWithException(){
        return new Object[][]{
                {5.65, 0},
                {0, 0}
        };
    }

    @DataProvider
    public static Object[][] dataProviderForSquareRoot() {
        return new Object[][]{
                {1.0},
                {25},
                {1600},
                {-25},
                {0}
        };
    }

    @DataProvider
    public static Object[][] dataProviderForTrigonometryOperations() {
        return new Object[][]{
                {30},
                {720},
                {0},
                {-45},
                {-420}
        };
    }
    @DataProvider
    public static Object[][] dataProviderToCheckLongType() {
        return new Object[][]{
                {1},
                {0},
                {-1},
                {Long.MIN_VALUE},
                {Long.MAX_VALUE}
        };
    }
    @DataProvider
    public static Object[][] toCheckDoubleAgainstEndLimit(){
        return new Object[][]{
                {Double.MAX_VALUE, Double.MAX_VALUE}
        };
    }


}
