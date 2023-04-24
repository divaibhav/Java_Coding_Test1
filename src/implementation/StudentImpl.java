package implementation;

import bean.Student;

public class StudentImpl {
    public static void main(String[] args) {
        //task 1
        Student student1 = new Student("Temp", "Temp@gmail.com");
        Student student2 = new Student("Temp", "Temp@gmail.com");
        System.out.println(student1.equals(student2));
    }
}
