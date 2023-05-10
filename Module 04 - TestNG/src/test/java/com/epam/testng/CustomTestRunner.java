package com.epam.testng;

import org.testng.TestNG;
import org.testng.xml.XmlSuite;
import java.util.ArrayList;
import java.util.List;

public class CustomTestRunner{
    public static void main(String[] args) {
        TestNG testNG = new TestNG();
        XmlSuite suite = new XmlSuite();

        List<String> listeners = new ArrayList<>();
        listeners.add("com.epam.testng.Listener");
        suite.setListeners(listeners);

        Class[] classes = {CalculatorTest.class};
        testNG.setTestClasses(classes);

        List<XmlSuite> suites = new ArrayList<>();
        suites.add(suite);
        testNG.setXmlSuites(suites);
        testNG.run();
    }
}
