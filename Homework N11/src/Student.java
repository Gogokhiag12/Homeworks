public class Student {
    private String name;
    private String surname;
    private long id;
    private int age;
    private String mail;
    private int phoneNumber;
    private int enrollmentYear;
    private SchoolClass grade;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public long getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getMail() {
        return mail;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public int getEnrollmentYear() {
        return enrollmentYear;
    }

    public SchoolClass getSchoolClass() {
        return grade;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void changeClass(SchoolClass newClass){
        this.grade = newClass;
    }
}
