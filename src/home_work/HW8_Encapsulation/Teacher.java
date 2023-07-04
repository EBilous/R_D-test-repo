package src.home_work.HW8_Encapsulation;

/*Створити клас, який описує студента(з ім‘ям / прізвищем / віком)
             та клас для опису викладача (з ім‘ям / прізвищем / віком / студентом(ваш клас)
              до нього додоти гетери / сетери, створити об’єкти в вашому мейн методі*/

public class Teacher {

    public Teacher() {
    }

    public enum TeacherRank {INSTRUCTOR, ASSISTANT_PROFESSOR, ASSOCIATE_PROFESSOR, PROFESSOR}

    private String name;
    private String surname;
    private String dateOfBirth;
    private String faculty;
    private long cardId;
    private Teacher.TeacherRank rank;
    private String phoneNumber;
    private String student;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public long getCardId() {
        return cardId;
    }

    public void setCardId(long cardId) {
        this.cardId = cardId;
    }

    public TeacherRank getRank() {
        return rank;
    }

    public void setRank(int rank) {
        if (rank > TeacherRank.values().length) {
            this.rank = TeacherRank.INSTRUCTOR;
        } else {
            this.rank = TeacherRank.values()[rank];
        }
    }

    public void setRank(String rank) {
        if (rank != null) {
            this.rank = TeacherRank.valueOf(rank.toUpperCase());
        }
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getStudent() {
        return student;
    }

    public void setStudent(String student) {
        this.student = student;
    }

    public String getTeacherProfile() {
        return String.join(" ", getName(), getSurname(), getFaculty(), getRank().toString());
    }

    public String getTeacherProfile(String role) {
        if (role.equals("ADMIN") || role.equals("HR")) {
            return String.join(" ", "|", String.valueOf(getCardId()), getName(), getSurname(), getFaculty(), getRank().toString(), getDateOfBirth(), getPhoneNumber(), "||", getStudent(), "|");
        } else {
            return getTeacherProfile();
        }

    }
}
