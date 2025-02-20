import java.util.ArrayList;
import java.util.List;


public class main {
    public static void main(String[] args) {
        var reverseGrade = new GradeComparator().reversed();
        GradeComparator grade = new GradeComparator();
        AgeComparator age = new AgeComparator();

        List<Student> students = new ArrayList<>();
        students.add(new Student("Jasmin", 12, 100));
        students.add(new Student("Amy", 18, 48));
        students.add(new Student("Jim", 24, 76));

        students.sort(reverseGrade.thenComparing(age));
        System.out.print(students);

    }
}
