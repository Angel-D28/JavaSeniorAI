public class Student {
    private String name;
    private Course[] courses;
    private int count; // controla cuántos cursos hay realmente

    public Student(String name, int maxCourses) {
        this.name = name;
        this.courses = new Course[maxCourses];
        this.count = 0;
    }

    public void addCourse(Course course) {
        if (count < courses.length) {
            courses[count] = course;
            count++;
        } else {
            System.out.println("No se pueden agregar más cursos");
        }
    }

    public void showCourses() {
        System.out.println("Cursos de " + name + ":");
        for (int i = 0; i < count; i++) {
            System.out.println("- " + courses[i].getName());
        }
    }
}