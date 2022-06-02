public class Person {
    private String last;
    private String first;
    private String middle;

    Person(String last, String first, String middle) {
        this.last = last;
        this.first = first;
        this.middle = middle;
    }

    public String getLast() {
        return this.last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public String getFirst() {
        return this.first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getMiddle() {
        return this.middle;
    }

    public void setMiddle(String middle) {
        this.middle = middle;
    }

    public void printName0() {
        System.out.println(this.getFirst() + ", " + this.getMiddle() + " " + this.getLast());
    }

    public void printName1() {
        System.out.println(this.getFirst() + ", " + this.getLast() + " " + this.getMiddle());
    }

    public void printName2() {
        System.out.println(this.getLast() + ", " + this.getFirst() + " " + this.getMiddle());
    }

}
