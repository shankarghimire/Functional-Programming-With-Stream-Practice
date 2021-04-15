package examples.ch01.set01;

import java.util.function.Consumer;

public class LambdInference {
    public static void main(String[] args) {

        // *** Part 1: identify the FI

        // Standard syntax
        Consumer<String> c1 = msg -> System.out.println(msg.length());


        // Compile-time error: not enough info
        //Object x1 = msg -> System.out.println(msg.length());


        // Compile-time error: not enough info
        //Object x2 = (String msg) -> System.out.println(msg.length());


        // OK: cast added
        Object x3 = (Consumer<String>) ((String msg) -> System.out.println(msg.length()));

        //Part 2: Identify Parameter types
        //OK, but inferred parameter type is Object
        Consumer<?> c2 = msg -> System.out.println(msg);

        //Compiler-time error: Interence is "not" based on body of Lambda
        //Consumer<?> c3 = msg -> System.out.println(msg.length());

        //OK: added manifest type to paramter
        Consumer<?> c3 = (String msg)-> System.out.println(msg.length());
    }
}
