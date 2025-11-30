package streams;

import java.util.List;

record Employee(String name, String designation) {
}

record Department(String name, List<Employee> employees) {
}

public class ExtractAndCombineNames {

    private static final List<Department> departments = List.of(
        new Department("Mathematics", List.of(
            new Employee("Salim Mathur", "Professor"),
            new Employee("Monica Deshpande", "Assistant Professor")
        )),
        new Department("Physics", List.of(
            new Employee("Mukesh Singh", "Lab Assistant"),
            new Employee("Payal Bagri", "Lecturer")
        ))
    );

    public static void main(String[] args) {

        final List<String> employeeNames = departments
            .stream()
            .flatMap(department -> department.employees().stream())
            .map(employee -> employee.name())
            .toList();

        System.out.println(employeeNames);
    }
}
