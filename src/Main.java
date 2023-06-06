import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        School school = new School();
        List<Student> class1 = new ArrayList<>();
        class1.add(new Student("Nguyễn Văn A", "CCCD 1", 15,"Lớp 10A", "Khối 10","Trường A" ));
        class1.add(new Student("Phạm Văn B", "CCCD 2", 16,"Lớp 11A",  "Khối 11","Trường B"));
        class1.add(new Student("Phạm Thị C", "CCCD 3", 17, "Lớp 12A","Khối 12", "Trường C"));
        school.addClass(class1);

        List<Student> class2 = new ArrayList<>();
        class2.add(new Student("Nguyễn Thị D", "CCCD 4", 15,"Lớp 10B","Khối 10","Trường D"));
        class2.add(new Student("Trần Anh E", "CCCD 5", 16,"lớp 11A","Khối 11","Trường E"));
        class2.add(new Student("Phạm Văn F", "CCCD 6", 17,"Lớp 12A","Khối 12","Trường F"));
        school.addClass(class2);

        String searchName = "Nguyễn";
        List<Student> foundStudents = school.searchStudentsByName(searchName);

        if (foundStudents.isEmpty()) {
            System.out.println("Không tìm thấy học sinh có tên \"" + searchName + "\"");
        } else {
            System.out.println("Các học sinh có tên \"" + searchName + "\":");
            for (Student student : foundStudents) {
                System.out.println("Tên: " + student.getFullName() + ", Tuổi: " + student.getAge());
            }
        }
    }
}
