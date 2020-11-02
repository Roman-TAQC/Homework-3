public class ContractEmployee extends Employee implements Calculate {
    private double fixedPaid;
    private String federalTaxIDMember;
    private double salary;

    ContractEmployee(double fixedPaid, String federalTaxIDMember){
        this.fixedPaid = fixedPaid;
        this.federalTaxIDMember = federalTaxIDMember;
    }

    @Override
    public void calculatePay(){
        salary = fixedPaid;
    }

    @Override
    public String toString() {
        return "ContractEmployee{" +
                "salary=" + salary +
                ", fixedPaid=" + fixedPaid +
                ", federalTaxIDMember='"
                + federalTaxIDMember + '\'' +
                '}';
    }

    double getSalary(){
        return salary;
    }
}
