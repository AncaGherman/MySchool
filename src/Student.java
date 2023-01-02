import java.util.Arrays;

public class Student extends Person {
    private int year;
    boolean buget = true;
    private Course[] listOfCMan;
    private Course[] listOfCOpt;

    public Student(String name, String id) {
        super(name, id);
    }

    public Student(String name, String id, int year, boolean buget, Course[] listOfCMan, Course[] listOfCOpt) {
        super(name, id);
        this.year = year;
        this.buget = buget;
        this.listOfCMan = listOfCMan;
        this.listOfCOpt = listOfCOpt;
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

    public Course[] getListOfCMan() {
        return listOfCMan;
    }

    public void setListOfCMan() {
        // urmeaza sa fac
        this.listOfCMan = listOfCMan;
    }

    public Course[] getListOfCOpt() {
        return listOfCOpt;
    }

    public void setListOfCOpt(Course[] listOfCOpt) {
        this.listOfCOpt = listOfCOpt;
    }

    public void registerStudent(Course [] listOfCOpt) {
        // urmeaza sa fac
    }

    @Override
    public String toString() {
        return "Student{" +
                super.getName() + " "+
                super.getId() + " "+
                "year=" + year + " " +
                (buget? "buget":"taxa") + " " +
                "listOfCMan=" + Arrays.toString(listOfCMan) +
                "listOfCOpt=" + Arrays.toString(listOfCOpt) +
                '}';
    }
}
