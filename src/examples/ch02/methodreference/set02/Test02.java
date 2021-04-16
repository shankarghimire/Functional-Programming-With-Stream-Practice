package examples.ch02.methodreference.set02;

import examples.ch01.set01.Employee;

import java.util.concurrent.Callable;
import java.util.function.Function;

public class Test02 {
    public static<T> void printAll(T[]array, Function<T, String> toStringFun){
        int i = 0;
        for(T t: array){
            System.out.println(i++ + ":\t" + toStringFun.apply(t));
        }
    }
    public static void main(String[] args) {
        Employee employees [] = new Employee[5];
        employees[0] = new Employee("Alec", 1500);
        employees[1] = new Employee("Bob", 500);
        employees[2] = new Employee("Clark", 100);
        employees[3] = new Employee("Jake", 200);
        employees[4] = new Employee("Manish", 5000);
        printAll(employees, Employee::getName);

        System.out.println();
        //To print all salary
        //Generates compile time error
        //printAll(employees, Employee::getSalary);
        printAll(employees, e-> "" + e.getSalary());


    }
}
