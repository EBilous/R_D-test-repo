package src.lections.compare;

public class Student implements Comparable {

    public Student(String name, float gradePointAverage) {
        this.name = name;
        this.gradePointAverage = gradePointAverage;
    }

    private String name;
    private final float gradePointAverage;

    public String getName() {
        return name;
    }

    @Override
    public void compareTo(Student student) {
        if (this.gradePointAverage > student.gradePointAverage) {
            System.out.println("Student " + getName() + " has GPA higher than student " + student.getName());
        } else if (student.gradePointAverage > this.gradePointAverage) {
            System.out.println("Student " + student.getName() + " has GPA higher than student " + getName());
        } else {
            System.out.printf("The GPAs of students %s and %s are equal.", getName(), student.getName());
        }
    }
}
