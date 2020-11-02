public class Main {
    public static void main(String[] args) {
        Employee[] employee = {new SalariedEmployee(2.2, "25", 4),
                new SalariedEmployee(2.1, "56", 3),
                new ContractEmployee(2.3, "11"),
                new ContractEmployee(5.4, "34"),
                new SalariedEmployee(1.21, "77", 5)
        };

        //calculate salaries for each employee
        for (Employee empl: employee) {
            empl.calculatePay();
        }

        //show unsorted array
        for (Employee empl: employee) {
            System.out.println(empl);
        }
        System.out.println();

        //sort employees by salary using bubble sorting algorithm because lists are not allowed in this task
        Employee[] work = new Employee[1];
        for (int i = 0; i < employee.length; i++) {
            for (int j = employee.length - 1; j > i; j--) {
                if (employee[j-1].getSalary() > employee[j].getSalary()) {
                    work[0] = employee[j-1];
                    employee[j-1] = employee[j];
                    employee[j] = work[0];
                }
            }
        }

        //show sorted array
        for (Employee empl: employee) {
            System.out.println(empl);
        }
    }
}