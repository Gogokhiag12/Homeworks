public class Student {
    private String name;
    private String surname;
    private long id;
    private int age;
    private String mail;
    private int phoneNumber;
    private int enrollmentYear;
    private SchoolClass grade;

    public Student(String name, String surname, long id, int age, String mail, int phoneNumber, int enrollmentYear, SchoolClass grade) {
        this.name = name;
        this.surname = surname;
        this.id = id;
        this.age = age;
        this.mail = mail;
        this.phoneNumber = phoneNumber;
        this.enrollmentYear = enrollmentYear;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEnrollmentYear(int enrollmentYear) {
        this.enrollmentYear = enrollmentYear;
    }

    public void setGrade(SchoolClass grade) {
        this.grade = grade;
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
