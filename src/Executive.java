public class Executive extends Person{
    private int empID;
    private double baseSalary;

    public Executive(String last, String first, String middle, int empID, double baseSalary) {
        super(last, first, middle);
        this.empID = empID;
        this.baseSalary = baseSalary;
    }

    public int getID() {
        return this.empID;
    }
}
