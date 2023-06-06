import java.text.DateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;
class School {
    private List<List<Student>> classes;
    private List<Student> Students;
    public School() {
        classes = new ArrayList<>();
    }

    public void addClass(List<Student> students) {
        classes.add(students);
    }

    public List<Student> searchStudentsByName(String name) {
        List<Student> foundStudents = new ArrayList<>();

        for (List<Student> studentList : classes) {
            for (Student student : studentList) {
                if (quickSearch(student.getFullName(), name)) {
                    foundStudents.add(student);
                }
            }
        }

        return foundStudents;
    }

    private boolean quickSearch(String target, String pattern) {
        int targetLength = target.length();
        int patternLength = pattern.length();
        int limit = targetLength - patternLength;

        for (int i = 0; i <= limit; i++) {
            int j;
            for (j = 0; j < patternLength; j++) {
                if (target.charAt(i + j) != pattern.charAt(j)) {
                    break;
                }
            }
            if (j == patternLength) {
                return true;
            }
        }

        return false;
    }

    }

