public class App {
    public static void main(String[] args) {

        // Los estudiantes se crean fuera del Course
        Student s1 = new Student("Ana", 20);
        Student s2 = new Student("Luis", 22);

        // Se crea el arreglo externamente
        Student[] group = {s1, s2};

        // El Course recibe el arreglo (no crea los estudiantes)
        Course course = new Course("Java", group);

        course.showStudents();
    }
}