public class PersonnelFactory {
    public static Person createPersonnel(String last, String first, String middle, int empID, double sal, int type) {
        switch (type) {
            case 1:
                return new Employee(last, first, middle, empID, sal);
            case 2:
                return new Executive(last, first, middle, empID, sal);
            case 3:
                return new Security(last, first, middle, empID, sal);
            case 4:
                return new Volunteer(last, first, middle, empID, sal);
            default:
                return null;
        }
    }
}
