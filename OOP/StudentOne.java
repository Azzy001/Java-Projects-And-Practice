public class StudentOne {
    // class attributes
    private String firstname;
    private String lastname;
    private String studentId;
    private String email;
    private String module;

    // class constructor
    public StudentOne(String firstname, String lastname, String studentId, String module){
        this.firstname = firstname;
        this.lastname = lastname;
        this.studentId = studentId;
        this.email = String.format("%s.%s@student.ac.uk", firstname.toLowerCase(), lastname.toLowerCase());
        this.module = module;
    }

    // Getter methods
    public String getFirstName(){
        return "Firstname: " + firstname;
    }
    public void setFirstName(String firstname){
        this.firstname = firstname;
        this.email = String.format("%s.%s@student.ac.uk", firstname.toLowerCase(), this.lastname.toLowerCase());
    }


    public String getLastName(){
        return "Lastname: " + lastname;
    }
    public void setLastName(String lastname){
        this.lastname = lastname;
        this.email = String.format("%s.%s@student.ac.uk", this.firstname.toLowerCase(), lastname.toLowerCase());
    }


    public String getStudentId(){
        return "Student ID: " + studentId;
    }
    public void setStudentId(String studentId){
        this.studentId = studentId;
    }


    public String getEmail(){
        return "Email: " + email;
    }
    public void setEmail(String email){
        this.email = email;
    }


    public String getModule(){
        return "Module: " + module;
    }
    public void setModule(String module){
        this.module = module;
    }


    @Override
    public String toString() {
        return String.format("StudentOne{name='%s %s', studentId='%s', email='%s', module='%s'}",
                             firstname, lastname, studentId, email, module);
    }

    public static void main(String[] args){
        System.out.println("\n-----Student DBS --------------->\n");
        StudentOne studentOne = new StudentOne("Arsalan", "Arref", "1234", "Computer Science");

        System.out.println(studentOne.getFirstName());
        System.out.println(studentOne.getLastName());
        System.out.println(studentOne.getStudentId());
        System.out.println(studentOne.getEmail());
        System.out.println(studentOne.getModule());

        studentOne.setFirstName("Muhammad");
        System.out.println("\n"+studentOne.getFirstName());
        System.out.println(studentOne.getEmail());
        System.out.println("\n-------------------------------->\n");
    }
}
