package implementation;

import bean.Student;

public class StudentImpl {
    public static void main(String[] args) {
        //task 1
        printFormat("%28s\n", "TASK1");
        Student student1 = new Student("Temp", "Temp@gmail.com");
        Student student2 = new Student("Temp", "Temp@gmail.com");
        System.out.println(student1.equals(student2));
        printFormat("%33s\n", "Task1 Completed");
        Student[] list = new Student[]{new Student("abhishek", "Abhi@gmail.com"),
                new Student("Ramesh", "ram@gmail.com"),
                new Student("Vaibhav", "vai@gmail.com")};
        printFormat("%28s\n", "TASK2");
        System.out.println("student list");
        printArray(list);
        StudentImpl studentImpl = new StudentImpl();
        Student[] sortedList = studentImpl.sortStudent(list);
        System.out.println("sorted list");
        printArray(sortedList);
        printFormat("%33s\n", "Task2 Completed");
    }

    //method for print formatted output
    private static void printFormat(String format, String TASK1) {
        System.out.println("-".repeat(50));
        System.out.format(format, TASK1);
        System.out.println("-".repeat(50));
    }

    private static void printArray(Student[] list) {
        for (Student student : list) {
            System.out.println(student);
        }
        System.out.println();
    }

    public Student[] sortStudent(Student[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            for (int j = 0; j < list.length - 1; j++) {
                if (list[j].getName().compareToIgnoreCase(list[j + 1].getName()) < 0) {
                    Student temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }
        return list;
    }
}
