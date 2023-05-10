package com.epam.testng;

import org.testng.annotations.*;

public class ConfigurationTests {
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("Before Suite");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Before Method");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("Before class");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("Before test");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("After Method");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("After test");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("After Class");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("After Suite");
    }
}
