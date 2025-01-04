import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class Academy {

    private List<Student> students;
    private List<Course> courses;
    final String BOLD = "\033[1m";
    final String RESET = "\033[0m";

    public Academy() {

        this.students = new ArrayList<>();
        this.courses = new ArrayList<>();

    }

    public void addStudent(Student student) {

        students.add(student);

    }

    public void addCourse(Course course) {

        courses.add(course);

    }

    public void printDiploma(Student student) {

        System.out.println(BOLD+student.getName()+RESET);

        for (Map.Entry<Course, Integer> entry : student.getCourses().entrySet()) {

            System.out.println(entry.getKey().getSubject()+": "+entry.getValue());

        }

        System.out.println(BOLD+"Gennemsnit: "+RESET+student.getAverageGrade()+"\n");

    }

    public List<Student> getHighest(int amount) {

        return students.stream().sorted(Comparator.comparingDouble(Student::getAverageGrade).reversed()).limit(amount).toList();

    }

    public List<Student> getLowest(int amount) {

        return students.stream().sorted(Comparator.comparingDouble(Student::getAverageGrade)).limit(amount).toList();

    }

    public void printTopStudents(int amount) {

        System.out.println(BOLD+"\nStuderende med højest gennemsnit:\n");
        List<Student> topStudents = getHighest(amount);
        for (Student s : topStudents){
            System.out.println(BOLD+s.getName()+RESET+" : "+s.getAverageGrade());

        }

    }

    public void printBottomStudents(int amount){

        System.out.println(BOLD+"\nStuderende med lavest gennemsnit:\n");
        List<Student> bottomStudents = getLowest(amount);
        for(Student s : bottomStudents){

            System.out.println(BOLD+s.getName()+RESET+" : "+s.getAverageGrade());

        }

    }

}