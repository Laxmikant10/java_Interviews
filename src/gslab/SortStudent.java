package src.gslab;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Sort Student based on Course name
 */
public class SortStudent {
    public static void main(String[] args) {

        String english = "English";
        String marathi = "Marathi";

        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student(2, "Lax", 132, "Marathi"));
        studentList.add(new Student(3, "Anu", 125, "English"));
        studentList.add(new Student(1, "Shyam", 131, "Marathi"));
        studentList.add(new Student(4, "Raj", 131, "English"));

        // System.out.println(" Normal studentList = " + studentList);

        Comparator<Student> studentComparator = (o1, o2) -> Integer.compare(o2.getMarks(), o1.getMarks());

        List<Student> collect = studentList.stream().sorted(studentComparator).collect(Collectors.toList());
        //System.out.println("Sorted studentList = " + collect);

        //course name --> done
        // English Marathi --> added

        // English list sort

        List<Student> englishSort = studentList.stream().filter(student -> student.getCourseName().equals(english)).sorted(studentComparator).collect(Collectors.toList());

        //System.out.println("englishSort = " + englishSort);
        //Marathi list sort

        List<Student> marathiSort = studentList.stream().filter(student -> student.getCourseName().equals(marathi)).sorted(studentComparator).collect(Collectors.toList());

        //System.out.println("marathiSort = " + marathiSort);


        //1st way Sort Student based on Course name
        Map<String, List<Student>> map = new HashMap<>();

        for (Student student : studentList) {
            map.put(student.courseName, studentList);
        }

        map.forEach((s, students) -> {
            System.out.println("Student Course : " + s);
            List<Student> collect1 = students.stream()
                    .filter(student -> student.getCourseName()
                            .equals(s))
                    .sorted((o1, o2) -> Integer.compare(o2.getMarks(), o1.getMarks()))
                    .collect(Collectors.toList());
            System.out.println("collect1 = " + collect1);
        });

        // 2nd way Sort Student based on Course name
        Map<String, List<Student>> groupByCourse = studentList.stream().collect(Collectors.groupingBy(student -> student.getCourseName()));

        groupByCourse.forEach((courseName, students) ->{
            System.out.println("courseName = " + courseName);
            students.stream().sorted((o1, o2) -> Integer.compare(o2.getMarks(), o1.getMarks())).forEach(System.out::println);
        } );
    }
}
