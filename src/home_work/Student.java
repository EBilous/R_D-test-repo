package src.home_work;

/*Створити клас "Студент"
            Створіть клас "Студент", який має такі приватні поля: ім'я, номер студентського квитка, середній бал.
            Створіть методи доступу до цих полів (getters і setters). Додайте валідацію в методах set: ім'я не може бути пустим,
            номер студентського квитка має містити тільки цифри, середній бал повинен бути від 1 до 100.*/
public class Student {
    public static void main(String[] args) {
        Student newStudent = new Student();
        newStudent.setName("Eugene");
        newStudent.setCardId(100001L);
        newStudent.setGpa(77.3D);
        System.out.println(newStudent.getName() + " " + newStudent.getCardId().toString() + " " + newStudent.getGpa());
    }

    private String name;
    private long cardId;
    private double gpa;

    public void setName(String name) {
        if (!name.isEmpty()) {
            this.name = name;
        }
    }

    public String getName() {
        return name;
    }

    public void setCardId(Long cardId) {
        this.cardId = cardId;
    }

    public Long getCardId() {
        return cardId;
    }

    public void setGpa(Double gpa) {
        if (1 < gpa && gpa < 100) {
            this.gpa = gpa;
        }
    }

    public Double getGpa() {
        return gpa;
    }
}
