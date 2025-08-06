package Module5.SuperKeyword;

class Person {
    String firstName;
    String lastName;
    Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
class Student extends Person {
    int USN;
    Student(String firstName, String lastName, int USN) {
        super(firstName, lastName);
        this.USN = USN;
    }
}
public class SuperKeyword {
    public static void main(String[] args) {
        Student s1 = new Student("John", "Smith", 18);
        System.out.println(s1.firstName + " " + s1.lastName);
        System.out.println(s1.USN);
    }
}
