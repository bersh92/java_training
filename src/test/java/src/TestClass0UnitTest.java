package src;


import org.testng.annotations.*;

import static org.testng.Assert.*;

public class TestClass0UnitTest {

    TestClass0 testClass0;

    @BeforeClass
    public void setupClass(){
        System.out.println("All tests were started");
    }

    @BeforeMethod     //used for run code before each method
    public void setupTest(){
        testClass0 = new TestClass0();
        System.out.println("Class object was created");
    }

    @AfterMethod     //used for run code after each method
    public void tearDownTest(){
        System.out.println("Test ended");
    }

    @Test
    public void setGetValue() {
        testClass0.setValue(5);
        int result = testClass0.getValue();
        assertEquals(result, 5);
        System.out.println("test was passed");
    }

    @Test
    public void setGetValueTest() {
        testClass0.setValue(7);
        assertEquals(testClass0.getValue(), 7);
        System.out.println("test was passed");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("All tests were ended");
    }
}