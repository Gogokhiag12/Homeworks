import java.util.ArrayList;

public class SchoolClass {
    private int grade;
    private char identificator;
    private String classHead;
    private ArrayList<Subject> subjectList;

    public int getGrade() {
        return grade;
    }

    public char getIdentificator() {
        return identificator;
    }

    public String getClassHead() {
        return classHead;
    }

    public ArrayList<Subject> getSubjectList() {
        return subjectList;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void setIdentificator(char identificator) {
        this.identificator = identificator;
    }

    public void setClassHead(String classHead) {
        this.classHead = classHead;
    }

    public String getClassName(){
        String result = String.valueOf(grade);
        result += " || ";
        result += classHead;
        return result;
    }
}
