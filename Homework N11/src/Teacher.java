public class Teacher {
    private String name;
    private String surname;
    private long id;
    private int age;
    private String mail;
    private int phoneNumber;
    private int sinceWhen;
    private Subject which;

    public Teacher(String name, String surname, long id, int age, String mail, int phoneNumber, int sinceWhen, Subject which) {
        this.name = name;
        this.surname = surname;
        this.id = id;
        this.age = age;
        this.mail = mail;
        this.phoneNumber = phoneNumber;
        this.sinceWhen = sinceWhen;
        this.which = which;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

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

    public int getSinceWhen() {
        return sinceWhen;
    }

    public Subject getWhich() {
        return which;
    }
}
