public class Student {
    private String name;
    private int grade;
    private int age;

    public Student(String name, int age, int grade){
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }

    public int getGrade() {
        return grade;
    }

    @Override
    public String toString(){
        return String.format("Name: %s, Age: %d, Grade: %d", name, age, grade);
    }
}
