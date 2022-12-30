import java.util.Arrays;
public class Teacher extends Person {
    //private int nrsbj = 1;
    //private String[] listOfC;
    private Course[] listOfC;

    public Teacher(String name, String id, Course[] listOfC) {
        super(name, id);
        this.listOfC = listOfC;
    }

    public Teacher(String name, String id) {
        super(name, id);
    }

    public Course[] getListOfC() {
        return listOfC;
    }

    public void setListOfC(Course[] listOfC) {
        this.listOfC = listOfC;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                super.getName() + " " +
                super.getId() + " " +
                "listOfC=" + Arrays.toString(listOfC) +
                '}';
    }
//    @Override
//    public String toString() {
//        return "Teacher{" +
//                super.getName() + " " +
//                super.getId() + " " +
//                Arrays.toString(listOfC) +
//                '}';
//    }
}
