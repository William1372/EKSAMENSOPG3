import java.util.HashMap;
import java.util.Map;

public class Student {

    private String name;
    private Map<Course, Integer> courses;

    public Student(String name) {

        this.name = name;
        this.courses = new HashMap<>();

    }

    private boolean isValidGrade(int grade) {

        return grade == -3 || grade == 0 || grade == 2 || grade == 4 || grade == 7 || grade == 10 || grade == 12;

    }

    public void addCourse(Course course, int grade) {

        if (courses.containsKey(course)) return;
        if (isValidGrade(grade)) courses.put(course, grade);

    }

    public Map<Course, Integer> getCourses() {

        return courses;

    }

    public void printCoursesAndGrades() {
        for (Map.Entry<Course, Integer> entry : courses.entrySet()) {
            System.out.println(entry.getKey().getSubject() + ": " + entry.getValue());
        }
    }

    public double getAverageGrade() {

        if (courses.isEmpty()){

            return 0.0;

    }
        int total = 0;
        for (int grade : courses.values()) {

            total += grade;

        }

        return total / (double)courses.size();

    }

    public String getName() {

        return name;

    }

}
