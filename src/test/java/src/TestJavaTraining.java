package src;

public class TestJavaTraining extends TestClass1 {
    public static void main(String[] args) {
        TestJavaTraining testObj = new TestJavaTraining();
        TestClass1 obj = new TestClass1(8); // use custom constructor from TestClass1 class
        testObj.test_for_loop(); // can call method from TestClass1 using obj of TestJavaTraining class
        testObj.test_map();
        testObj.getNum();
        testObj.setNum(56);
        TestClass1.testOverload("parameter");
        testObj.getValue();
    }

}
