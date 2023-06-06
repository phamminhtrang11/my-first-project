import java.util.Date;

class Student extends Human {
    private String className;
    private String grade;
    private String school;

    public Student(String name, String CCCD, int age, String className, String grade, String school) {
        super(name, CCCD, age);
        this.className = className;
        this.grade = grade;
        this.school = school;
    }

    public String getClassName() {
        return className;
    }
    public String getGrade() {
        return grade;
    }
    public String getSchool() {
        return school;
    }
}
