import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class StudentTest {

    @Test
    void averageGradeShouldEqualEleven(){

        // Tester om getAverageGrade fungerer
        Academy academy = new Academy();

        Course java = new Course("Java");
        Course sql = new Course("SQL");
        Course assembly = new Course("Assembly");
        Course python = new Course("Python");

        Student s1 = new Student("Hans");

        academy.addCourse(java);
        academy.addCourse(sql);
        academy.addCourse(assembly);
        academy.addCourse(python);

        academy.addStudent(s1);

        s1.addCourse(java,10);
        s1.addCourse(sql, 10);
        s1.addCourse(assembly,12);
        s1.addCourse(python,4);

        assertEquals(9,s1.getAverageGrade());

    }

}