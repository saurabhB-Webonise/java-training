package assignments.methodreference;


interface FunctionalInterfaceDemo {
    public int operation(int a, int b);
}


public class MethodReferenceDemo {

    static class StaticClassDemo {

        public static int sum(int a, int b) {
            return a + b;
        }

        public static int multiply(int a, int b) {
            return a * b;
        }

        public static int subtract(int a, int b) {
            return a - b;
        }
    }

    public static void main(String[] args) {
        NormalClassDemo normalClassDemo = new NormalClassDemo();

        FunctionalInterfaceDemo functionalInterfaceDemo = normalClassDemo::sum;
        System.out.println(functionalInterfaceDemo.operation(10, 20));

        functionalInterfaceDemo = normalClassDemo::subtract;
        System.out.println(functionalInterfaceDemo.operation(10, 20));

        functionalInterfaceDemo = StaticClassDemo::sum;
        System.out.println(functionalInterfaceDemo.operation(60, 20));
    }
}

class NormalClassDemo {
    public int sum(int a, int b) {
        return a + b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }
}
