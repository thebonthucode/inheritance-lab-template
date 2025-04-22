public class Teacher extends Person {
    private String subject;
    private int yearsOfExperience;

    // Original constructor (used in Main.java)
    public Teacher(String name, int age, String gender) {
        super(name, age, gender);
        this.subject = "Unknown";
        this.yearsOfExperience = 0;
    }

    // Extended constructor (optional: for more info)
    public Teacher(String name, int age, String gender, String subject, int yearsOfExperience) {
        super(name, age, gender);
        this.subject = subject;
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getSubject() {
        return subject;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setYearsOfExperience(int years) {
        this.yearsOfExperience = years;
    }

    @Override
    public String toString() {
        return super.toString() + ", subject: " + subject + ", experience: " + yearsOfExperience + " years";
    }
}
