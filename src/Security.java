public class Security extends Person{
    private int empID;
    private double baseSalary;

    public Security(String last, String first, String middle, int empID, double baseSalary) {
        super(last, first, middle);
        this.empID = empID;
        this.baseSalary = baseSalary;
    }

    public int getID() {
        return this.empID;
    }
}
