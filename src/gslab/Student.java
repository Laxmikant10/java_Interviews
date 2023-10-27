package src.gslab;

public class Student {

    int id;
    String name;
    int marks;



    String courseName;

    public Student(int id, String name, int marks, String courseName) {
        this.id = id;
        this.name = name;
        this.marks = marks;
        this.courseName = courseName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                ", courseName='" + courseName + '\'' +
                '}';
    }
}
