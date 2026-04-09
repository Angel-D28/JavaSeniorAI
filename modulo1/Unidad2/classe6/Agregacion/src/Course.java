public class Course {
    private String courseName;
    private Student[] students;
    private int count;

    public Course(String courseName, Student[] students) {
        this.courseName = courseName;
        this.students = students;
        this.count = students.length;
    }

    public void showStudents(){
        System.out.println("Students in " + courseName + ":");
        for(int i =  0; i < count; i++){
            System.out.println("- " + students[i].getName() + " Age: " + students[i].getAge() + " years");
        }
    }

    public String getCourseName() {
        return courseName;
    }

    public Student[] getStudents() {
        return students;
    }
    public int getCount() {
        return count;
    }
}
