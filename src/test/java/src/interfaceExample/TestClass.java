package src.interfaceExample;

import org.testng.annotations.Test;

public class TestClass {

    InterfaceExample interfaceExample1;

    @Test
    public void main1(){
        interfaceExample1 = new Class1(); // we create interface object from Class1

        interfaceExample1.firstPrint();   //results will be from Class1
        interfaceExample1.secondPrint();
    }

    @Test
    public void main2(){  // // we create interface object from Class2
        interfaceExample1 = new Class2();
        interfaceExample1.firstPrint();   //results will be from Class2
        interfaceExample1.secondPrint();
    }

}
