package com.epam.testng;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener {
    @Override
    public void onTestStart(ITestResult result){
        System.out.println(result.getName() + " - Test Case Started");
    }
    @Override
    public void onTestSuccess(ITestResult result){
        System.out.println(result.getName() + " - Test Case Passed");
    }
    @Override
    public void onTestSkipped(ITestResult result){
        System.out.println(result.getName() + " - Test Case Skipped");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println(result.getName() + " - Test Case Failed");;
    }
}
