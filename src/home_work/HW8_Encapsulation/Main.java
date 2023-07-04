package src.home_work.HW8_Encapsulation;

public class Main {
        public static void main(String[] args) {

            Student student = new Student("Eugene", "Bilous", "01-01-1985", "1A2", "Java", 10001L, 59D);
            Teacher teacher = new Teacher();
            teacher.setName("Ivan");
            teacher.setSurname("Vernugora");
            teacher.setRank("Professor");
            teacher.setDateOfBirth("28-06-1965");
            teacher.setCardId(123456789L);
            teacher.setPhoneNumber("+380990001010");
            teacher.setStudent(student.getStudentProfile());

            // Get student's profile
            System.out.println(student.getStudentProfile());

            //Get short teacher's profile with public info only
            System.out.println(teacher.getTeacherProfile());

            //Get full teachers profile with all personnel data
            System.out.println(teacher.getTeacherProfile("ADMIN"));

            // update teacher's rank and get new profile info
            teacher.setRank(0);
            System.out.println(teacher.getTeacherProfile());

        }
    }
