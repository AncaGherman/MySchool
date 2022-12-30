import java.util.Arrays;

public class Student extends Person {
    private int year;
    boolean buget = true;
    private Course[] listOfC;

    public Student(String name, String id) {
        super(name, id);
    }

    public Student(String name, String id, int year, boolean buget, Course[] listOfC) {
        super(name, id);
        this.year = year;
        this.buget = buget;
        this.listOfC = listOfC;
    }

    public Student(String name, String id, int year, boolean buget) {
        super(name, id);
        this.year = year;
        this.buget = buget;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isBuget() {
        return buget;
    }

    public void setBuget(boolean buget) {
        this.buget = buget;
    }

    public Course[] getListOfC() {
        return listOfC;
    }

    public void setListOfC(Course[] listOfC) {
        this.listOfC = listOfC;
    }

    @Override
    public String toString() {
        return "Student{" +
                super.getName() + " "+
                super.getId() + " "+
                "year=" + year + " " +
                (buget? "buget":"taxa") + " " +
                "listOfC=" + Arrays.toString(listOfC) +
                '}';
    }
}
