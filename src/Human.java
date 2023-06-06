import java.util.ArrayList;
import java.util.List;
class Human {
    private String fullName;
    private String CCCD;
    private int age;

    public Human(String fullName, String CCCD, int age) {
        this.fullName = fullName;
        this.CCCD = CCCD;
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public String getCCCD() {
        return CCCD;
    }

    public int getAge() {
        return age;
    }
}



