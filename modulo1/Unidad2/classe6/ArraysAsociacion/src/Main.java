public class Main {
    public static void main(String[] args) throws Exception {

        Course c1 = new Course("Java");
        Course c2 = new Course("Python");

        Student s1 = new Student("Ana", 5);

        s1.addCourse(c1);
        s1.addCourse(c2);

        s1.showCourses();
    }
}
