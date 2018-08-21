package src;

public class TestJavaTraining extends JavaTraining{
    public static void main(String[] args) {
        //JavaTraining obj1 = new JavaTraining();
        // obj1.test_while();
        TestJavaTraining testExtends = new TestJavaTraining();
        JavaTraining obj = new JavaTraining(8); // use custom constructor from JavaTraining class
        testExtends.test_for_loop(); // can call method from JavaTraining using obj of TestJavaTraining class
        JavaTraining.test_map();
        testExtends.getNum();
        testExtends.setNum(56);
        JavaTraining.testOverload("parameter");
    }



}
