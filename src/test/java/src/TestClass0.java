package src;

public class TestClass0 {

    String constructor;
    private int value;

    public TestClass0(String b) {  //custom constructor, if not set up, will be used default
        constructor = b;
    }

    public TestClass0() {          //default constructor
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {        //getter method
        System.out.println("number value is:" + value);
        return value;
    }
}
