package src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;


public class TestClass1 extends TestClass0 {

    private int id;         //will be available only in this class

    protected int number;   //will be available in class which extend this

    public int value;       //will be available in everywhere 

    int n;                  //will be available in package with this class

    int constructor;

    private int num = 8;

    public TestClass1() {
    }

    public TestClass1(int b) {
        constructor = b;
    }

    public int getNum() {    //getter method
        System.out.println("number is:" + num);
        return num;
    }

    public void setNum(int newValue) {  //setter method
        num = newValue;
        System.out.println("number is:" + num);
    }

    public void test_for_loop() {
        int[] arr = {1, 3, 4, 6, 4, 7, 8, 6, 4};
        for (int elem : arr) {
            System.out.println(elem);
        }
    }

    public void test_while() {
        int[] tes = {1, 4, 6, 643, 4, 65, 4};

        int i = 0;

        while (i < tes.length) {
            System.out.println(tes[i]);
            i++;
        }
    }

    public static void test_static() {
        System.out.println("Test Static Method");
    }

    public static void test_for() {
        for (int i = 1; i <= 20; i++) {
            System.out.println("text" + i);
        }
    }

    public static void test_if() {
        String browser = "chrome";

        if (browser.equalsIgnoreCase("Chrome")) {
            System.out.println("Browser is Chrome");
        } else if (browser.equalsIgnoreCase("Firefox")) {
            System.out.println("Browser is Firefox");
        } else if (browser.equalsIgnoreCase("IE")) {
            System.out.println("Browser is IE");
        } else {
            System.out.println("Unknown browser name is : " + browser);
        }
    }

    public static void test_switch() {
        int x = 2;

        switch (x) {
            case 1:
                System.out.println("Case 1");
                break;

            case 2:
                System.out.println("Case 2");
                break;

            default:
                System.out.println("NO one case matched");
        }
    }

    public static void test_startwith() {
        String name = "1 selenium 3";
        boolean status = name.startsWith("1");
        System.out.println(status);
    }

    public static void test_contains() {
        String expected = "Hello how are you";
        String actual = "Hello";
        boolean status = expected.contains(actual);
        System.out.println("Status is " + status);

    }

    public static void test_split() {
        String example = "h-e-l-l-o-w-o-r-l-d";
        String[] toolname = example.split("-");
        System.out.println(Arrays.toString(toolname));
        for (int i = 0; i < toolname.length; i++) {
            System.out.println(toolname[i]);
        }
    }

    public static void test_parametrs(int a, int b) {
        int c = a + b;
        System.out.println("Result is: " + c);
        TestClass1.test_contains();
    }

    public static void test_create_array(int length, String type_of_values) {
        int id[] = new int[length];
        if (type_of_values.equalsIgnoreCase("random")) {
            for (int i = 0; i < id.length; i++) {
                id[i] = TestClass1.random_number();
            }
        } else {
            int b = 0;
            for (int i = 0; i < id.length; i++, b++) {
                id[i] = b;
            }
        }
        System.out.println("List of elements is: " + Arrays.toString(id));
    }

    public static int random_number() {
        Random rand = new Random();
        int b = rand.nextInt(50) + 1;
        return b;
    }

    public static void test_array_list() {
        ArrayList qwe = new ArrayList(Arrays.asList("1", "12", "sails", 1, 4, 5, "one"));
        for (int i = 0; i < qwe.size(); i++) {
            System.out.println(qwe.get(i));
        }
        for (Object i : qwe) {
            System.out.println(i);
        }
        System.out.println(Arrays.toString(qwe.toArray()));
    }

    public static void test_map() {
        HashMap<String, String> obj1 = new HashMap<String, String>();
        obj1.put("1", "qwe");
        obj1.put("2", "asd");
        obj1.put("3", "zxc");
        String value = obj1.get("2");
        System.out.println(value);
    }

    public static void testOverload() {
        System.out.println("without parameters");
    }

    public static void testOverload(String v) {
        System.out.println("with parameters:" + v);
    }
}