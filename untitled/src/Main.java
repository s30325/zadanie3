public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Adam", "Nowacki", "s21357", "s21357@pjwstk.edu.pl",
                ".pjwstk.edu.pl", new double[]{3.0, 5.0, 2.0, 3.5});
        Student student2 = new Student("Wojciech", "Chelkowski", "s54367", "s54367@pjwstk.edu.pl",
                ".pjwstk.edu.pl", new double[]{3.0, 3.5, 4.0, 3.0});
        Student student3 = new Student("Pavlo", "Valerko", "s98457", "s98457@pjwstk.edu.pl",
                ".pjwstk.edu.pl", new double[]{5.0, 5.0, 3.0, 3.0});
        Student student4 = new Student("Jan", "Kowalski", "s29845", "s29845@pjwstk.edu.pl",
                ".pjwstk.edu.pl", new double[]{5.0, 5.0, 2.0, 3.5});
        Student student5 = new Student("Anna", "Zyt", "s39820", "s39820@pjwstk.edu.pl",
                ".pjwstk.edu.pl", new double[]{3.0, 5.0, 4.0, 3.0});

        StudentGroup studentGroup = new StudentGroup("group1", new Student[]{student1, student2, student3,
                student4});
        System.out.println("Srednia studenta");
        System.out.println(student1.countAGP());
        studentGroup.addStudent(student5);
        System.out.println("liczba studentow w grupie");
        System.out.println(studentGroup.students.length);
      
    }
}