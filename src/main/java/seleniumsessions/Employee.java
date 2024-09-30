package seleniumsessions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Employee implements Comparable<Employee> {
    private String name;
    private int id;
    private int age;
    private double salary;

    public Employee(String name, int id, int age, double salary)  throws Exception{
        if (age < 20) {
            throw new RuntimeException("Age must be 20 or above.");
        }
        this.name = name;
        this.id = id;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public int compareTo(Employee other) {
        return Integer.compare(this.age, other.age);
    }

    @Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", age=" + age + ", salary=" + salary + "]";
	}
    
    

    public static void main(String[] args) {
        try {
            List<Employee> employees = new ArrayList<Employee>();
            
            employees.add(new Employee("Alice", 1, 25, 50000));
            employees.add(new Employee("Bob", 2, 22, 60000));
            employees.add(new Employee("Charlie", 3, 28, 55000));
            employees.add(new Employee("Dave", 4, 21, 52000));
            
            

            //Sort using Comparable (by age)
//            Collections.sort(employees);
//            
//            System.out.println("Sorted by age using Comparable:");
//            for (Employee employee : employees) {
//                System.out.println(employee);
//            }
            
            

            //Sort using Comparator (by age, custom)
            Collections.sort(employees, new Comparator<Employee>() {
                @Override
                public int compare(Employee e1, Employee e2) {
                   // return Integer.compare(e1.getAge(), e2.getAge());
                    return e1.getName().compareTo(e2.getName());
                    
                }
            });
            System.out.println("Sorted by age using Comparator:");
            for (Employee employee : employees) {
                System.out.println(employee);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

