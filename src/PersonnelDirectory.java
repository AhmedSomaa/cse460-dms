import java.util.ArrayList;
import java.util.Scanner;

public class PersonnelDirectory {
    public static void main(String[] args) {
        Personnel per = new Personnel();
        Scanner scan = new Scanner(System.in);
        String firstN, lastN, middleN;
        int empID;
        double salary;
        int choice = -1;

        do {
            System.out.println("Welcome to the Personnel Directory Management System");
            System.out.println("====================================================");
            System.out.println("\n\n\t 1. Add Personnel");
            System.out.println("\n\t 2. Find Personnel");
            System.out.println("\n\t 3. Print Names");
            System.out.println("\n\t 4. Number of Entries in the Directory");
            System.out.print("\n\t Select one of the options above (1, 2, 3, 4): ");
            choice = scan.nextInt();
            scan.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter first name: ");
                    firstN = scan.nextLine();
                    System.out.println("Enter last name: ");
                    lastN = scan.nextLine();
                    System.out.println("Enter middle name: ");
                    middleN = scan.nextLine();

                    System.out.println("Enter employer id : ");
                    empID = scan.nextInt();
                    System.out.println("Enter base salary");
                    salary = scan.nextDouble();
                    scan.nextLine();

                    System.out.println("Personnel Type (1: Employee  or 2: Executive or 3: Security or 4: Volunteer)?: ");
                    int personnelType = scan.nextInt();

                    Person person = PersonnelFactory.createPersonnel(lastN, firstN, middleN, empID, salary, personnelType);
                    per.addPersonnel(person);
                    break;
                case 2:
                    System.out.println("Enter first name : ");
                    firstN = scan.nextLine();

                    System.out.println("Enter last name : ");
                    lastN = scan.nextLine();


                    boolean found = false;
                    int loc = -1;
                    ArrayList<Person> perList = per.getPersonnelList();
                    for (int i = 0; i < per.getTotalCount(); i++) {
                        if (perList.get(i).getFirst().equals(firstN) && perList.get(i).getLast().equals(lastN)) {
                            found = true;
                            loc = i;
                        }
                    }

                    if (found) {
                        System.out.println("Found");
                        perList.get(loc).printName1();

                    } else {
                        System.out.println("not found");
                        Person p1 = new Person(lastN, firstN, " ");
                        per.addPersonnel(p1);
                    }

                    break;
                case 3:
                    System.out.println("Enter the order 0: first, middle, last, 1: first, last, middle, 2: last, first , middle ");
                    int order = scan.nextInt();
                    for (int i = 0; i < per.getTotalCount(); i++) {
                        switch (order) {
                            case 0:
                                per.getPersonnelList().get(i).printName0();
                                break;
                            case 1:
                                per.getPersonnelList().get(i).printName1();
                                break;
                            case 2:
                                per.getPersonnelList().get(i).printName2();
                                break;
                            default:
                                System.out.println("Invalid option");
                        }
                    }
                    break;
                case 4:
                    System.out.println("Total Entries : " + per.getTotalCount());
                    break;
            }
        } while (true);
    }
}