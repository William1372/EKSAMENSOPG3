public class Main {

    public static void main(String[] args) {

        Academy academy = new Academy();

        Course processing = new Course("Processing");
        Course java = new Course("Java");
        Course sql = new Course("SQL");
        Course assembly = new Course("Assembly");

        academy.addCourse(processing);
        academy.addCourse(java);
        academy.addCourse(sql);
        academy.addCourse(assembly);

        Student karl = new Student("Karl");
        Student victoria = new Student("Victoria");
        Student hans = new Student("Hans");

        academy.addStudent(karl);
        academy.addStudent(victoria);
        academy.addStudent(hans);

        karl.addCourse(processing,10);
        karl.addCourse(java,7);
        karl.addCourse(sql,4);
        karl.addCourse(assembly,12);
        victoria.addCourse(processing,12);
        victoria.addCourse(java,12);
        victoria.addCourse(sql,10);
        victoria.addCourse(assembly,12);
        hans.addCourse(processing, 02);
        hans.addCourse(java, 12);
        hans.addCourse(sql,-3);
        hans.addCourse(assembly,12);

        academy.printDiploma(karl);
        academy.printDiploma(victoria);
        academy.printDiploma(hans);

        academy.printTopStudents(3);
        academy.printBottomStudents(3);

    }

}
