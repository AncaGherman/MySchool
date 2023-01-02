import java.util.Arrays;

public class School {
    private final int MAXCOURSES = 7;
    private final int MAXPERSONS = 10;
    private Course[] courseInSchool = new Course[MAXCOURSES];
    private Person[] personInSchool = new Person[MAXPERSONS];

    private void addCourses() {
        courseInSchool[0] = new Course ("Mathematics","Objectives for Mathematics", false, 1);
        courseInSchool[1] = new Course ("Informatics","Objectives for Informatics", true, 1);
        courseInSchool[2] = new Course ("Chemistry","Objectives for Chemistry", false, 2);
        courseInSchool[3] = new Course ("Biology","Objectives for Biology", false, 2);
        courseInSchool[4] = new Course ("Geography","Objectives for Geography", false,3);

    }

    private void addPersons() {
        Course[] ct0 = {courseInSchool[0],courseInSchool[1]};
        Course[] ct1 = {courseInSchool[2],courseInSchool[3], courseInSchool[4]};
        personInSchool[0] = new Teacher("Popescu", "00001", ct0);
        personInSchool[1] = new Teacher("Ionescu", "00002", ct1);
        personInSchool[3] = new Student("Popa", "00003", 1, true);
        personInSchool[4] = new Student("Avram", "00004", 1, false);
    }

    private void printCourses() {
        System.out.println("LISTA CURSURI EXISTENTE:");
        for (int i=0; i< courseInSchool.length; i++) {
            if (courseInSchool[i]!=null) {
                System.out.println(courseInSchool[i].toString1());
            }
        }
    }

    public void printPersons() {
        System.out.println("LISTA PERSOANE:");
        for (int i = 0; i< personInSchool.length; i++) {
            if (personInSchool[i] != null) {
                System.out.println(personInSchool[i].toString());
            }
        }
    }

    public static void main(String[] args) {
        School sc = new School();
        sc.addCourses();
        sc.addPersons();
        sc.printCourses();
        sc.printPersons();

    }
}
