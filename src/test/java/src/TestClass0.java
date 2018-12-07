package src;

public class TestClass0 {

    String constructor;

    public TestClass0(String b) {
        constructor = b;
    }

    public TestClass0() {
    }

    private int value;

    public int getValue() {    //getter method
        System.out.println("number value is:" + value);
        return value;
    }
}
