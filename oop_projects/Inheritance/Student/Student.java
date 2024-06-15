public class Student extends Person {
    // additional attributes specific to Student
    private String module;
    private boolean isEnrolled;
    private int enrollmentYear;
    private int graduationYear;

    // constructor
    public Student(String id, String forename, String surname, int age, String module, boolean isEnrolled, int enrollmentYear, int graduationYear) {
        // call to superclass constructor (Person)
        super(id, forename, surname, age);
        this.module = module;
        this.isEnrolled = isEnrolled;
        this.enrollmentYear = enrollmentYear;
        this.graduationYear = graduationYear;
    }

    // getter for module
    public String getModule() {
        return this.module;
    }

    // setter for module
    public void setModule(String module) {
        this.module = module;
    }

    // getter for isEnrolled
    public boolean isEnrolled() {
        return this.isEnrolled;
    }

    // setter for isEnrolled
    public void setEnrolled(boolean isEnrolled) {
        this.isEnrolled = isEnrolled;
    }

    // getter for enrollmentYear
    public int getEnrollmentYear() {
        return this.enrollmentYear;
    }

    // setter for enrollmentYear
    public void setEnrollmentYear(int enrollmentYear) {
        this.enrollmentYear = enrollmentYear;
    }

    // getter for graduationYear
    public int getGraduationYear() {
        return this.graduationYear;
    }

    // setter for graduationYear
    public void setGraduationYear(int graduationYear) {
        this.graduationYear = graduationYear;
    }

    // override toString method to include Student-specific details
    @Override
    public String toString() {
        return super.toString() + String.format("\nModule: %s \nEnrolled: %b \nEnrollment Year: %d \nGraduation Year: %d", module, isEnrolled, enrollmentYear, graduationYear);
    }
}
