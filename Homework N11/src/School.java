import java.util.ArrayList;

public class School {
    private String name;
    private String dateOfEstablishment;
    private String directorFullName;
    private String email;
    private int phoneNumber;
    private String address;
    private ArrayList<Teacher> listOfTeachers;
    private ArrayList<Student> listOfStudents;

    public String getName() {
        return name;
    }

    public String getDateOfEstablishment() {
        return dateOfEstablishment;
    }

    public String getDirectorFullName() {
        return directorFullName;
    }

    public String getEmail() {
        return email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public ArrayList<Teacher> getListOfTeachers() {
        return listOfTeachers;
    }

    public ArrayList<Student> getListOfStudents() {
        return listOfStudents;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDateOfEstablishment(String dateOfEstablishment) {
        this.dateOfEstablishment = dateOfEstablishment;
    }

    public void setDirectorFullName(String directorFullName) {
        this.directorFullName = directorFullName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setListOfTeachers(ArrayList<Teacher> listOfTeachers) {
        this.listOfTeachers = listOfTeachers;
    }

    public void setListOfStudents(ArrayList<Student> listOfStudents) {
        this.listOfStudents = listOfStudents;
    }
    public void addTeacher(Teacher teacher){
        listOfTeachers.add(teacher);
    }
    public void removeTeacher(Teacher teacher){
        listOfTeachers.remove(teacher);
    }
    public void addStudent(Student student){
        listOfStudents.add(student);
    }
    public void removeStudent(Student student){
        listOfStudents.remove(student);
    }
    public void removeStudent(long personalNumber){
        for (int i = 0; i < listOfStudents.size(); i++){
            Student current = listOfStudents.get(i);
            if (current.getId() == personalNumber){
                listOfStudents.remove(current);
                return;
            }
        }
    }
    public boolean containsStudent(Student ifContains){
        for (Student realStudent : listOfStudents) {
            if (realStudent == ifContains)
                return false;
        }
        return true;
    }

    public int getStudentsCount(){
        return listOfStudents.size();
    }
}
