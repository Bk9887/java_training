package Module5.StudentMarks;

import java.util.Scanner;

class Student {
    int rollNo;
    int mark1;
    int mark2;
    int mark3;
    public Student(int rollNo, int mark1, int mark2, int mark3) {
        this.rollNo = rollNo;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }
    int totalMarks(){
        return mark1 + mark2 + mark3;
    }
}
public class StudentMarks{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[]  students = new Student[n];
        for(int i = 0; i < n; i++){
            int rollNo = sc.nextInt();
            int mark1 = sc.nextInt();
            int mark2 = sc.nextInt();
            int mark3 = sc.nextInt();
            students[i]=new Student(rollNo, mark1, mark2, mark3);
        }
        for(int i = 0; i < n; i++){
            System.out.println(students[i].totalMarks() + students[i].rollNo);
        }

    }
}
