package assignments.lamda_expression;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

interface FunctionalInterfaceDemo {
    public int add(int a, int b);
}

public class LamdaExpressionDemo {

    public void lamdaExpressionWithParameter() {
        FunctionalInterfaceDemo obj = (int a, int b) -> {


            System.out.println(this.getClass().getName());

            return a + b;
        };
        System.out.println(obj.add(10, 20));
    }

    public void lamdaExpressionOnCollection() {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(205);
        arrayList.add(102);
        arrayList.add(98);
        arrayList.add(275);
        arrayList.add(203);


        System.out.println("Before sorting : " + arrayList.toString());

        Collections.sort(arrayList, (obj1, obj2) -> {
            if (obj1 > obj2) {
                return -1;
            } else if (obj1 < obj2) {
                return 1;
            } else {
                return 0;
            }
        });

        System.out.println("After sorting in descending order: " + arrayList.toString());


        Collections.sort(arrayList, (v1, v2) -> (v2 > v1) ? -1 : (v2 < v1) ? 1 : 0);

        System.out.println("After sorting in ascending order: " + arrayList.toString());

        Collections.sort(arrayList, (v1, v2) -> v2.compareTo(v1));
        System.out.println("After using \"compareTo\" method for descending order: " + arrayList.toString());

    }

    public void methodAcceptingFunctionalInterface(int a, int b, FunctionalInterfaceDemo functionalInterfaceDemo) {
        functionalInterfaceDemo.add(a, b);
    }

    public static void main(String[] args) {

        LamdaExpressionDemo obj = new LamdaExpressionDemo();
        obj.lamdaExpressionWithParameter();
        obj.lamdaExpressionOnCollection();

        obj.methodAcceptingFunctionalInterface(10, 40, (int a, int b) -> {
            return a + b;
        });
    }
}



