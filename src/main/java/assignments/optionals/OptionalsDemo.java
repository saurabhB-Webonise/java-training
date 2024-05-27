package assignments.optionals;

import java.util.Optional;


interface FunctionalInterface {
    void callabck();
}


public class OptionalsDemo {

    public static void divider(String str) {
        System.out.println("================" + str + "==================");
    }

    public static void nextLine() {
        System.out.println();
    }

    public static void scope(FunctionalInterface functionalInterface) {
        divider("");
        functionalInterface.callabck();
        nextLine();
    }

    public static void main(String[] args) {


        // creating a string array
        String[] str = new String[5];

        // Setting value for 2nd index
        str[2] = "Hello World";

        // It returns an empty instance of Optional class
        Optional<String> empty = Optional.empty();
        divider("Optional Empty Example");
        System.out.println(empty);
        nextLine();

        // It returns a non-empty Optional
        divider("Optional Non-Empty Example");
        Optional<String> non_null_value = Optional.of(str[2]);
        System.out.println(non_null_value);
        nextLine();


        // It returns value of an Optional.
        // If value is not present, it throws
        // an NoSuchElementException
        divider("Getting non-null value from Non-Empty Optionals");
        System.out.println(non_null_value.get());
        nextLine();

        // It returns hashCode of the value
        divider("Printing hashcode");
        System.out.println(non_null_value.hashCode());
        nextLine();


        // It returns true if value is present,
        // otherwise false
        divider("Checking value is present in Optional");
        System.out.println(non_null_value.isPresent());
        nextLine();


//----------------------------------------------------------------------------------------------------------------------


        Optional<String> null_value = Optional.ofNullable(str[3]);
        divider("Optional null value Example");
        System.out.println(null_value);
        nextLine();

        // It returns value of an Optional.
        // If value is not present, it throws
        // an NoSuchElementException
        divider("Getting non-null value from Non-Empty Optionals");
        try {
            System.out.println(null_value.get());
        } catch (Exception e) {
            System.out.println("Handled in Catch block, Exception message : " + e.getMessage());
        }
        nextLine();

        // It returns hashCode of the value
        divider("Printing hashcode");
        System.out.println(null_value.hashCode());
        nextLine();

        // It returns true if value is present,
        // otherwise false
        divider("Checking value is present in Optional");
        System.out.println(null_value.isPresent());
        nextLine();
    }
}
