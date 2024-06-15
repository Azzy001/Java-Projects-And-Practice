public class Person {
    // Fields/Attributes
    private String id;
    private String forename;
    private String surname;
    private int age;
    private String email;

    // constructor
    public Person(String id, String forename, String surname, int age) {
        this.id = id;
        this.forename = forename;
        this.surname = surname;
        // Validate age
        if (age < 18 || age > 100) {
            throw new IllegalArgumentException("Age must be between 18 and 100");
        }
        this.age = age;
        // automatically generate email
        this.email = updateEmail();
    }
    
    // getter for id
    public String getId() {
        return this.id;
    }
    
    // getter for forename
    public String getForename() {
        return this.forename;
    }
    
    // setter for forename
    public void setForename(String forename) {
        this.forename = forename;
        this.email = updateEmail(); // Update email when forename changes
    }
    
    // getter for surname
    public String getSurname() {
        return this.surname;
    }
    
    // setter for surname
    public void setSurname(String surname) {
        this.surname = surname;
        this.email = updateEmail(); // Update email when surname changes
    }
    
    // getter for age
    public int getAge() {
        return this.age;
    }
    
    // setter for age
    public void setAge(int age) {
        // validate age
        if (age < 18 || age > 100) {
            throw new IllegalArgumentException("Age must be between 18 and 100");
        }
        this.age = age;
    }
    
    // getter for email
    public String getEmail() {
        return this.email;
    }
    
    // method to update email based on forename and surname
    private String updateEmail() {
        return this.email = String.format("%s.%s@northumbria.ac.uk", this.forename.toLowerCase(), this.surname.toLowerCase());
    }
    
    // override toString method to provide formatted string representation of Person object
    @Override
    public String toString() {
        return String.format("\nId: %s \nForename: %s \nSurname: %s \nAge: %d \nEmail: %s", this.id, this.forename.toUpperCase(), this.surname.toUpperCase(), this.age, this.email);
    }
}
