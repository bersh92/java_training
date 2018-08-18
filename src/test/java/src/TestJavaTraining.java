package src;

public class TestJavaTraining extends JavaTraining{

    public static void main(String[] args) {
        //JavaTraining obj1 = new JavaTraining();
        // obj1.test_while();
        TestJavaTraining testExtends = new TestJavaTraining();
        testExtends.test_for_loop(); // can call method from JavaTraining using obj of TestJavaTraining class
        JavaTraining.test_map();
        testExtends.getNum();
        testExtends.setNum(56);

    }



}
