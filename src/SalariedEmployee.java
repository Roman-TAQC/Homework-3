public class SalariedEmployee extends Employee implements Calculate {
    private String socialSecurityNumber;
    private double hourlyPaid;
    private double salary;
    private int hoursWorked;

    SalariedEmployee(double hourlyPaid, String socialSecurityNumber, int hoursWorked){
        this.hourlyPaid = hourlyPaid;
        this.socialSecurityNumber = socialSecurityNumber;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public void calculatePay() {
        salary = hourlyPaid * hoursWorked;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "salary=" + salary + ", socialSecurityNumber='"
                + socialSecurityNumber + '\'' +
                ", hourlyPaid=" + hourlyPaid +
                ", hoursWorked=" + hoursWorked +
                '}';
    }

    double getSalary(){
        return salary;
    }
}
