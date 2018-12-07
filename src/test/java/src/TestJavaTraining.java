package src;

public class TestJavaTraining extends TestClass1 {
    TestJavaTraining testObj;
    TestClass2 <Integer> testObj1;
    TestClass3 testObj2;

    public void main() {
        testObj = new TestJavaTraining();
        testObj1 = new TestClass2 <> (); // Generic
        TestClass1 obj = new TestClass1(8); // use custom constructor from TestClass1 class
        testObj2 = new TestClass3("Constructor Parameter");
        testObj.test_for_loop(); // can call method from TestClass1 using obj of TestJavaTraining class
        testObj.test_map();
        testObj.getNum();
        testObj.setNum(56);
        TestClass1.testOverload("parameter");
        testObj.getValue();
        testObj1.setNumber(5); //Generic
    }
}
