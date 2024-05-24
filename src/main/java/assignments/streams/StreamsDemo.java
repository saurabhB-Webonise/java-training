package assignments.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class StreamsDemo {

    public void filter_IntermediateOperationDemo() {
        System.out.println();
        System.out.println("filter_IntermediateOperationDemo");

        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(2);
        arrayList.add(6);
        arrayList.add(9);
        arrayList.add(4);
        arrayList.add(20);


        System.out.println("Printing the collection : "
                + arrayList);
        System.out.println();
        List<Integer> ls = arrayList.stream()
                .filter(i -> i % 2 == 0)  // here filter method filtering source arraylist,
                .collect(Collectors.toList());

        System.out.println(ls);
    }

    public void map_IntermediateOperationDemo() {

        System.out.println();
        System.out.println("map_IntermediateOperationDemo");

        // Creating an integer Arraylist to store marks
        ArrayList<Integer> marks = new ArrayList<Integer>();
        // These are marks of the students
        // Considering 5 students so input entries
        marks.add(30);
        marks.add(78);
        marks.add(26);
        marks.add(96);
        marks.add(79);
        // Printing the marks of the students before grace
        System.out.println("Marks of students before grace : " + marks);
        // Now we want to grace marks by 6
        // using the streams to process over processing
        // collection

        // Using stream, we map every object and later
        // collect to List
        // and store them
        List<Integer> updatedMarks = marks.stream()
                .map(i -> i + 6)
                .collect(Collectors.toList());

        // Printing the marks of the students after grace
        System.out.println("Marks of students  after grace : " + updatedMarks);
    }

    public void sorted_IntermediateOperation() {
        System.out.println();
        System.out.println("sorted_IntermediateOperation");

        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(2);
        arrayList.add(6);
        arrayList.add(9);
        arrayList.add(4);
        arrayList.add(20);


        System.out.println("Printing the collection : "
                + arrayList);
        System.out.println();
        List<Integer> ls = arrayList.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println("After sorting : " + ls);
    }

    public void distinct_IntermediateOperation(){
        System.out.println();
        System.out.println("distinct_IntermediateOperation");

        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(2);
        arrayList.add(6);
        arrayList.add(6);
        arrayList.add(6);
        arrayList.add(9);
        arrayList.add(4);
        arrayList.add(20);


        System.out.println("Printing the collection : "
                + arrayList);
        System.out.println();
        List<Integer> ls = arrayList.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println("After Distict : " + ls);
    }

//    Terminal Operations are the operations that on execution return a final result as an absolute value.
//    collect(): It is used to return the result of the intermediate operations performed on the stream.
//    forEach(): It iterates all the elements in a stream.
//    reduce(): It is used to reduce the elements of a stream to a single value.

    public void collect_TerminalOperationDemo() {
        System.out.println();
        System.out.println("collect_TerminalOperationDemo");
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(2);
        arrayList.add(6);
        arrayList.add(9);
        arrayList.add(4);
        arrayList.add(20);

        System.out.println("Printing the collection : "
                + arrayList);
        System.out.println();
        List<Integer> ls
                = arrayList.stream()
                .filter(i -> i % 2 == 0)  // here filter method filtering source arraylist,
                .collect(Collectors.toList());
        System.out.println("Printing after filter for even number : " + ls);
    }

    public void reduce_TerminalOperationDemo() {
        System.out.println();
        System.out.println("reduce_TerminalOperationDemo");
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(2);
        arrayList.add(6);
        arrayList.add(9);
        arrayList.add(4);
        arrayList.add(20);
        System.out.println("Printing the collection : "
                + arrayList);
        System.out.println();
        int ls = arrayList.stream()
                .reduce(0, (a, b) -> a + b); // here filter method filtering source arraylist,
        System.out.println("Printing after reduce : " + ls);
    }

    public void forEach_TerminalOperationDemo() {

        System.out.println();
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        // Using forEach to print each element
        names.stream().forEach(name -> System.out.println(name));
    }

    public static void main(String[] args) {
        StreamsDemo streamsDemo = new StreamsDemo();

        streamsDemo.filter_IntermediateOperationDemo();
        streamsDemo.map_IntermediateOperationDemo();
        streamsDemo.sorted_IntermediateOperation();
        streamsDemo.distinct_IntermediateOperation();

        streamsDemo.collect_TerminalOperationDemo();
        streamsDemo.reduce_TerminalOperationDemo();
        streamsDemo.forEach_TerminalOperationDemo();
    }

}
