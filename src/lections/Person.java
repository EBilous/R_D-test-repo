package src.lections;

/*Створіть клас Person з наступними полями:

        firstName (ім'я)
        lastName (прізвище)
        age (вік)
        Перевизначте метод equals(), таким чином, що дві особи будуть вважатися рівними,
         якщо їх імена, прізвища і вік співпадають.

        Перевизначте метод hashCode() відповідно до вашого методу equals().*/
public class Person extends Object {

    public String firstName;

    public String lastName;
    private int age;

    @Override public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Person person = (Person) o;

        if (age != person.age) {
            return false;
        }
        if (!firstName.equals(person.firstName)) {
            return false;
        }
        return lastName.equals(person.lastName);
    }

    @Override public int hashCode() {
        int result = firstName.hashCode();
        result = 31 * result + lastName.hashCode();
        result = 31 * result + age;
        return result;
    }

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }



}
