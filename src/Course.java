public class Course {
    private String nameC;
    private String summary;
    private boolean optional = true;
    private int year ;

    public Course(String nameC, String summary, boolean optional, int year) {
        this.nameC = nameC;
        this.summary = summary;
        this.optional = optional;
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getNameC() {
        return nameC;
    }

    public void setNameC(String nameC) {
        this.nameC = nameC;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public boolean isOptional() {
        return optional;
    }

    public void setOptional(boolean optional) {
        this.optional = optional;
    }

    @Override
    public String toString() {
        return '\'' + this.getNameC() + '\'';
    }
    public String toString1() {
        return "Courses{" +
                "nameC='" + this.getNameC() + '\'' +
                ", summary='" + this.getSummary() + '\'' +
                (this.isOptional()? " optional":" mandatory") +
                '}';
    }
}
