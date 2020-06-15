import com.person.pojo.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();

        Employee e1 = new Employee("张三", 22, 5500, 123424);

        Employee e2 = new Employee("李四", 26, 6500, 121424);

        Employee e3 = new Employee("李薏", 19, 3500, 123424);
        Employee e4 = new Employee("欧露", 20, 5600, 123024);


        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);

        //排序，默认升序
        employees.sort(Comparator.comparing(Employee::getAge));

        for (Employee employee : employees) {
            System.out.println(employee);
        }

    }
}
