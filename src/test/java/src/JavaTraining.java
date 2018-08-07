package src;

import java.lang.reflect.Array;
import java.util.Arrays;

public class JavaTraining {


    public void test_for_loop()
    {
        int[] arr = {1, 3, 4, 6, 4, 7, 8, 6, 4};

        for (int elem : arr) {
            System.out.println(elem);
        }
    }

    public void test_while()
    {
        int[] tes = {1, 4, 6, 643, 4, 65, 4};

        int i = 0;

        while (i < tes.length) {
            System.out.println(tes[i]);
            i++;
        }
    }

    public static void test_static()
    {
     System.out.println("Test Static Method");
    }

    public static void test_for()
    {
        for (int i=1; i<=20; i++ ){
            System.out.println("text" + i);
        }
    }

    public static void test_if()
    {
        String browser = "chrome";

        if (browser.equalsIgnoreCase("Chrome"))
        {
            System.out.println("Browser is Chrome");
        }
        else if (browser.equalsIgnoreCase("Firefox"))
        {
            System.out.println("Browser is Firefox");
        }
        else if (browser.equalsIgnoreCase("IE"))
        {
            System.out.println("Browser is IE");
        }
        else
            {
            System.out.println("Unknown browser name is : " + browser);
        }
    }

    public static void test_switch()
    {
        int x = 2;

        switch (x)
        {
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

    public static void test_startwith()
    {
    String name = "1 selenium 3";
    boolean status = name.startsWith("1");
    System.out.println(status);
    }

    public static void test_contains()
    {
    String expected = "Hello how are you";
    String actual = "Hello";
    boolean status = expected.contains(actual);
    System.out.println("Status is " + status);

    }

    public static void test_split()
    {
        String example = "h-e-l-l-o-w-o-r-l-d";
        String [] toolname = example.split("-");
        System.out.println(Arrays.toString(toolname));
        for(int i=0; i<toolname.length; i++)
    {
        System.out.println(toolname[i]);
    }
    }

    public static void test_parametrs(int a, int b)
    {
        int c = a + b;
        System.out.println("Result is: " + c);
        JavaTraining.test_contains();
    }

}


    /*for (int elem: arr) {
        //System.out.println(arr[elem]);
    }
}*/