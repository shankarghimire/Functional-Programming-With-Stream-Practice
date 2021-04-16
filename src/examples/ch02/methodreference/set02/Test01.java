package examples.ch02.methodreference.set02;

import examples.ch01.set01.Employee;

import java.util.function.Supplier;

public class Test01 {
    public static void main(String[] args) {
        Employee frank = new Employee("Frank", 3000);
        Integer i = frank.getSalary();
        Supplier<Integer> salary = frank::getSalary;
        System.out.println(salary.get());
    }
}
