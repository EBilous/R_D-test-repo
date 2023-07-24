package src.home_work.LEC16_collections_p1;

/*1. Створити програму для збереження списку чисел з 10 елементів та іншого з 2 000 000 елементів. Для кожного підібрати свій тип

2. Зберегти у колекції список студентів (класс Студент теж створити)

3. Вивести цей список

4. Опціонально: написати реалізацію класу ArrayList або LinkedList*/


public class Student {

    String firstname;
    String lastName;
    Integer age;

    public Student(String firstname, String lastName, int age) {
        this.firstname = firstname;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
