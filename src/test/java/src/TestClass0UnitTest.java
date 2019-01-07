package src;


import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class TestClass0UnitTest {

    TestClass0 testClass0;

    @BeforeClass
    public void setup(){
        testClass0 = new TestClass0();
        System.out.println("Class object was created");
    }

    @Test
    public void setGetValue() {
        testClass0.setValue(5);
        int result = testClass0.getValue();
        assertEquals(result, 5);
        System.out.println("test setGetValue was passed");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("All tests were ended");
    }
}