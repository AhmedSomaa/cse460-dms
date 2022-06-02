import java.util.ArrayList;

public class Personnel {
    private ArrayList<Person> personList;

    public Personnel() {
        this.personList = new ArrayList<Person>();
    }

    public void addPersonnel(Person p) {
        this.personList.add(p);
    }

    public ArrayList<Person> getPersonnelList() {
        return this.personList;
    }

    public int getTotalCount() {
        return this.personList.size();
    }
}
